package com.mycf.sprigcloud.user_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableHystrixDashboard
@EnableCircuitBreaker
@EnableTurbine
@ComponentScan("com.mycf.sprigcloud.user_service")
public class UsersServerApplication {

	public static void main(String[] args) {
		// Will configure using accounts-server.yml
		System.setProperty("spring.config.name", "users-server");

		SpringApplication.run(UsersServerApplication.class, args);
	}
}
