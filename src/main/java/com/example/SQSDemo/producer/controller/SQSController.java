package com.example.SQSDemo.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SQSController {
    @Autowired
    private QueueMessagingTemplate queueMessagingTemplate;

    @Value("${cloud.aws.endpoint.uri}")
    private String endpoint;


    @GetMapping("/sqs/{message}")
    public void sendMessageToQueue(@PathVariable("message") String message){
        queueMessagingTemplate.send(endpoint, MessageBuilder.withPayload(message).build());
    }

}
