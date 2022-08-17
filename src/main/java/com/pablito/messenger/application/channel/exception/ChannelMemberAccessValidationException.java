package com.pablito.messenger.application.channel.exception;

public class ChannelMemberAccessValidationException extends MessengerException {
    private final String channelId;
    private final String senderId;

    public ChannelMemberAccessValidationException(final String channelId, final String senderId) {
        this.channelId = channelId;
        this.senderId = senderId;
    }
}
