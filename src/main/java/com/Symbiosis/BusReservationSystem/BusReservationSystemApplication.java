package com.Symbiosis.BusReservationSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.Symbiosis.BusReservationSystem","com.Symbiosis.config","com.Symbiosis.controller","com.Symbiosis.DTO","com.Symbiosis.helper","com.Symbiosis.model","com.Symbiosis.repository","com.Symbiosis.service"})
@EntityScan({"com.Symbiosis.model"})
@EnableJpaRepositories(basePackages="com.Symbiosis.repository")
public class BusReservationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusReservationSystemApplication.class, args);
	}

}
