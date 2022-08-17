package com.pablito.messenger.application.channel;

import com.pablito.messenger.application.channel.events.kafka.consumer.MessageSendEvent;
import com.pablito.messenger.application.channel.exception.ChannelNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MessageChannelService {

    private final MessageChannelRepository repository;
    private final ChannelValidator validator;
    public void handle(final MessageSendEvent event) {
        repository.findById(event.getChannelId())
                .orElseThrow(() -> new ChannelNotFoundException(event.getChannelId()))
                .handle(validator, event);
    }
}
