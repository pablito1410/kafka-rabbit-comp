package com.pablito.messenger.application.channel.events.kafka.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pablito.messenger.application.channel.MessageChannelService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class MessageChannelListener {

    private final MessageChannelService messageChannelService;
    private final ObjectMapper objectMapper;

    @KafkaListener(id = "messageListener", topics = "messages", containerFactory = "kafkaListenerContainerFactory")
    public void handle(final String message) throws JsonProcessingException {
        final MessageSendEvent event = objectMapper.readValue(message, MessageSendEvent.class);
        log.info("Handled message, {}, {}", event.getChannelId(), event.getSenderId());
        messageChannelService.handle(event);
    }
}
