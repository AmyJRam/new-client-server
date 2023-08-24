package com.microservicepractice.cloudconfigmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CloudConfigMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigMicroServiceApplication.class, args);
	}

}
