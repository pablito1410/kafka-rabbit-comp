//package com.pablito.messenger.infrastructure.kafka;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Component;
//
//@Component
//@Slf4j
//class TestProducer {
//
//    private final String topic;
//
//    private final KafkaTemplate<String, String> kafkaTemplate;
//
//    TestProducer(@Value(value = "${kafka.testProducer.topic}") final String topic, final KafkaTemplate<String, String> kafkaTemplate) {
//        this.topic = topic;
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    public void sendMessage(final String message) {
//        log.info("Sending message {}", message);
//        kafkaTemplate.send(topic, message);
//    }
//}
