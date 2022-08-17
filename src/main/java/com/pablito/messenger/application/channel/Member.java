package com.pablito.messenger.application.channel;

import lombok.AccessLevel;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Member {

    @Id
    @GeneratedValue
    @Getter(AccessLevel.PACKAGE)
    private String id;
}
