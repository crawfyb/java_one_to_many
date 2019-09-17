package com.codeclan.example.pirateservice_d1_starter;

import com.codeclan.example.pirateservice_d1_starter.repositories.PirateRepository;
import com.codeclan.example.pirateservice_d1_starter.repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PirateserviceD1StarterApplication {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;


	public static void main(String[] args) {
		SpringApplication.run(PirateserviceD1StarterApplication.class, args);
	}
}
