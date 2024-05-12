package com.example.SQSDemo.consumer;

import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class ListnerForSQS {
    @SqsListener("https://sqs.ap-south-1.amazonaws.com/821747157261/SQSQueue")
    public void displayMessagesFromSQS(String message){
        System.out.println("Queue Messages" + message);
    }
}
