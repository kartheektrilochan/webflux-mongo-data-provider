package com.kkt.reactive.learning.datadevelopment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class DataDevelopmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataDevelopmentApplication.class, args);
	}

}
