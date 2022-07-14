package com.sinu.kafka.sinuspringkafka.kafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private static final String topic = "mytopic";
    
    @Autowired
    private  KafkaTemplate<String, String> messageTemplate;

    public void produceTopic(String message){
        System.out.println("Publishing a message :"+ topic );
        this.messageTemplate.send(topic,message);
    }
}
