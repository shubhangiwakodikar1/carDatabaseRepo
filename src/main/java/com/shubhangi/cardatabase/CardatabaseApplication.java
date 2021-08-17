package com.shubhangi.cardatabase;

import com.shubhangi.cardatabase.domain.Car;
import com.shubhangi.cardatabase.domain.CarRepository;
import com.shubhangi.cardatabase.domain.Owner;
import com.shubhangi.cardatabase.domain.OwnerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CardatabaseApplication {
	@Autowired
	CarRepository carRepository;
	@Autowired
	OwnerRepository ownerRepository;

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

	@Bean
	CommandLineRunner commandLineRunnerCar() {
		return args -> {
			//save demo data in the repository
			Owner owner1 = new Owner("Shubhangi", "Wakodikar");
			Owner owner2 = new Owner("Shubh", "Wakod");
			Owner owner3 = new Owner("Shu", "Wak");
			ownerRepository.save(owner1);
			ownerRepository.save(owner2);
			ownerRepository.save(owner3);

			Car car1 = new Car("Toyota", "Prius", "blue", "DMD 123", 2015,
					12000, "hybrid car", owner1);
			Car car2 = new Car("Tesla", "Model S", "white", "CAM 123", 2025,
					52000, "electric car", owner2);
			Car car3 = new Car("Smart", "fortwo", "white", "DCM 123", 2030,
					30000, "another electric car", owner3);
			Car car4 = new Car("Guddu", "fantasticCar", "white", "GUU 123", 2030,
					30000, "another fantastic electric car", owner1);
			carRepository.save(car1);
			carRepository.save(car2);
			carRepository.save(car3);
			carRepository.save(car4);
		};
	}
}
