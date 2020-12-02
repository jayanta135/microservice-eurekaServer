package com.clientschoolservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientSchoolServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientSchoolServiceApplication.class, args);
	}

}
