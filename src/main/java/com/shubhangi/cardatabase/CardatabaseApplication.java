package com.shubhangi.cardatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardatabaseApplication {
	private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
		logger.info("Hello Spring Boot application :) ");
		logger.trace("trace logging");
		logger.debug("debug logging");
		logger.info("info logging");
		logger.warn("warn logging");
		logger.error("error logging");
	}

}
