package com.github.mthizo247.hello;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@Autowired
	SimpMessagingTemplate messagingTemplate;

	@Scheduled(fixedDelay = 1000L)
	public void time() {
		Greeting greeting = new Greeting(new Date().toString());
		messagingTemplate.convertAndSend("/topic/time", greeting);
	}
}
