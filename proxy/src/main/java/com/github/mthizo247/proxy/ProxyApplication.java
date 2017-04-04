package com.github.mthizo247.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

import com.github.mthizo247.cloud.netflix.zuul.web.socket.EnableZuulWebSocket;

@SpringBootApplication
@EnableZuulWebSocket
@EnableWebSocketMessageBroker
public class ProxyApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProxyApplication.class, args);
	}
}
