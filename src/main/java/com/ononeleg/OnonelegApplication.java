package com.ononeleg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class OnonelegApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnonelegApplication.class, args);
	}

}
