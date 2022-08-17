package com.pablito.messenger.application.channel;

import java.util.Optional;

public interface MessageChannelRepository {
    Optional<MessageChannel> findById(String id);
}
