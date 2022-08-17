package com.pablito.messenger.application.channel.exception;

public class ChannelAccessValidationException extends MessengerException {
    private final String channelId;
    private final String providedChannelId;

    public ChannelAccessValidationException(final String channelId, final String providedChannelId) {
        this.channelId = channelId;
        this.providedChannelId = providedChannelId;
    }
}
