package com.pablito.messenger.application.channel.events;

public class MessageRegisteredEvent implements Event {
    private final String channelId;
    private final String senderId;

    public MessageRegisteredEvent(final String channelId, final String senderId) {
        this.channelId = channelId;
        this.senderId = senderId;
    }
}
