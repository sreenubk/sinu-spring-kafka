package com.sinu.kafka.sinuspringkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinu.kafka.sinuspringkafka.kafka.Producer;

@RestController
@RequestMapping("/kafka")
public class KafkaMessageProducer {
    
    @Autowired
    private Producer producer;

    @PostMapping("/post")
    public void produceMessage(@RequestParam("msg") String msg){
        producer.produceTopic(msg);
    }

}
