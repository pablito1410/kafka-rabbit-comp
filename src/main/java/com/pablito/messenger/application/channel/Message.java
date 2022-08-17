package com.pablito.messenger.application.channel;

import com.pablito.messenger.application.channel.events.kafka.consumer.MessageSendEvent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Message {

    @Id
    @GeneratedValue
    private String id;
    private String senderId;
    private String value;
    public Message(final MessageSendEvent event) {
        this.senderId = event.getSenderId();
        this.value = event.getValue();
    }
}
