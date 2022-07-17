package com.epam.jmp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients({"com.epam.*"})
@ComponentScan({"com.epam.*"})
public class TwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwoApplication.class, args);

	}

}


