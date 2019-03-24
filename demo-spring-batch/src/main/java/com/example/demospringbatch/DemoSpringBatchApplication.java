package com.example.demospringbatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoSpringBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBatchApplication.class, args);
	}

}
