package com.pablito.messenger.application.channel;

import com.pablito.messenger.application.channel.exception.ChannelAccessValidationException;
import com.pablito.messenger.application.channel.exception.ChannelMemberAccessValidationException;
import org.springframework.stereotype.Component;

import java.util.Set;
@Component
class ChannelValidator {

    void checkChannelId(final String channelId, final String providedChannelId) {
        if (!channelId.equals(providedChannelId))
            throw new ChannelAccessValidationException(channelId, providedChannelId);
    }

    void checkChannelMembership(final String channelId, final Set<String> membersIds, final String senderId) {
        if (!membersIds.contains(senderId))
            throw new ChannelMemberAccessValidationException(channelId, senderId);
    }
}
