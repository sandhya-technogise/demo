package com.example.SQSDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SqsDemoApplication {
	@Autowired
	private Environment environment;
//	@Autowired
//	private SqsProducer sqsProducer;

	public static void main(String[] args) {
		SpringApplication.run(SqsDemoApplication.class, args);
	}
//	public void runProducer() {
//		sqsProducer.SendSQS();
//	}
}
