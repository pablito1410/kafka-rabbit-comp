package com.pablito.messenger.application.channel.events.domain.notifications;

import com.pablito.messenger.application.channel.events.kafka.consumer.MessageSendEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageSendNotifier {

    @EventListener
    void handle(final MessageSendEvent event) {
        log.info("Handle {} notification", event.getClass().getName());
    }
}
