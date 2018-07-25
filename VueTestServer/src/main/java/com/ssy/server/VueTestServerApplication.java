package com.ssy.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) 
public class VueTestServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueTestServerApplication.class, args);
	}
}
