package com.sop.chapter10.discoveryservicelab12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServiceLab12Application {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServiceLab12Application.class, args);
	}

}
