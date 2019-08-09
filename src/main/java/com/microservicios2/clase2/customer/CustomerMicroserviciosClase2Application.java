package com.microservicios2.clase2.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class CustomerMicroserviciosClase2Application {

	public static void main(String[] args) {
		SpringApplication.run(CustomerMicroserviciosClase2Application.class, args);
	}

}
