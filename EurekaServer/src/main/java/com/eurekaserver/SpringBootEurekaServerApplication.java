package com.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootEurekaServerApplication {

	public static void main(String[] args) { 
		System.out.println();
		SpringApplication.run(SpringBootEurekaServerApplication.class, args);
	}

}
