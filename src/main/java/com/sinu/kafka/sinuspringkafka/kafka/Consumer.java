package com.sinu.kafka.sinuspringkafka.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    public static final String topic = "mytopic";

    @KafkaListener(topics=topic, groupId = "firstgroup")
    public void consume(String message){

        System.out.println( message);
    }
    
}
