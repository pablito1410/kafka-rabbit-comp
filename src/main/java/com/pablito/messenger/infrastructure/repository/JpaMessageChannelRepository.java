package com.pablito.messenger.infrastructure.repository;

import com.pablito.messenger.application.channel.MessageChannel;
import com.pablito.messenger.application.channel.MessageChannelRepository;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JpaMessageChannelRepository extends MessageChannelRepository, JpaRepository<MessageChannel, String> {
}
