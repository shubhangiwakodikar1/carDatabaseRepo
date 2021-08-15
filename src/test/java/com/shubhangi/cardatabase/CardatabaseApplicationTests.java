package com.shubhangi.cardatabase;

import com.shubhangi.cardatabase.domain.Car;
import com.shubhangi.cardatabase.domain.CarRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CardatabaseApplicationTests {

	@Autowired
	CarRepository carRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testBrands() {
		List<Car> teslaCars = carRepository.findByBrand("Tesla");
		assert teslaCars.size() == 1;
		assert teslaCars.iterator().next().getBrand() == "Tesla";
	}

}
