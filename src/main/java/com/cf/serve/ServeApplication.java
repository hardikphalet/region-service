package com.cf.serve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.trips.*", "com.cf.*"})
public class ServeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServeApplication.class, args);
	}

}
