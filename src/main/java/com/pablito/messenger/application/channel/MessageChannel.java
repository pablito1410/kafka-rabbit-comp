package com.pablito.messenger.application.channel;

import com.pablito.messenger.application.channel.events.MessageRegisteredEvent;
import com.pablito.messenger.application.channel.events.kafka.consumer.MessageSendEvent;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
public class MessageChannel extends AbstractAggregateRoot<MessageChannel> {

    @Id
    @GeneratedValue
    private String id;

    @OneToMany
    private Set<Member> members = new HashSet<>();
    @OneToMany
    private List<Message> messages = new LinkedList<>();



    void handle(final ChannelValidator validator, final MessageSendEvent event) {
        checkAccessToChannel(validator, event);

        final var message = new Message(event);
        this.messages.add(message);

        registerEvent(new MessageRegisteredEvent(this.id, event.getSenderId()));
    }

    private void checkAccessToChannel(final ChannelValidator validator, final MessageSendEvent event) {
        validator.checkChannelId(this.id, event.getChannelId());
        validator.checkChannelMembership(this.id, getMembersIds(), event.getSenderId());
    }

    private Set<String> getMembersIds() {
        return this.members
                .stream()
                .map(Member::getId)
                .collect(Collectors.toUnmodifiableSet());
    }

}
