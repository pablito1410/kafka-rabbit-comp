package com.pablito.messenger.application.channel.events.kafka.consumer;

import com.pablito.messenger.application.channel.events.Event;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.security.DenyAll;

@Data
@AllArgsConstructor
public class MessageSendEvent implements Event {
        String channelId;
        String senderId;
        String value;

}
