package com.gw.gd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.gw.gd.*"})
public class EcomprojectApplication{

	public static void main(String[] args) {
		SpringApplication.run(EcomprojectApplication.class, args);
	}
	
}
