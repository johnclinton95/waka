package com.mboa.waka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("modele")
public class WakaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WakaApplication.class, args);
	}

}
