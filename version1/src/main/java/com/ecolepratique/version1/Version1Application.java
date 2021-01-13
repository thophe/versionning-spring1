package com.ecolepratique.version1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Version1Application {

	public static void main(String[] args) {
		SpringApplication.run(Version1Application.class, args);
		// Modification 1
		System.out.println("Modification 1");
	}

}
