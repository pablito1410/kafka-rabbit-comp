package com.pablito.messenger.application.channel.exception;

public class ChannelNotFoundException extends MessengerException {

    private final String channelId;

    public ChannelNotFoundException(final String channelId) {
        this.channelId = channelId;
    }
}
