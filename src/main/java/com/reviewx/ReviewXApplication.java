package com.reviewx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ReviewXApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewXApplication.class, args);
	}

}