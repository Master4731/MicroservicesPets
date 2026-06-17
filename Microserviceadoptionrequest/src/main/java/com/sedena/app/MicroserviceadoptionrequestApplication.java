package com.sedena.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroserviceadoptionrequestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceadoptionrequestApplication.class, args);
	}

}
