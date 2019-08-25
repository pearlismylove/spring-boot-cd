package com.tistory.lazyengineer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class NewSpringBootApplication {

	public static final String APPLICATION_LOCATIONS 
	= "spring.config.location="
			+ "classpath:application.properties,"
			+ "/Users/jungjunlee/Downloads/application-set1.properties,"
			+ "/Users/jungjunlee/Downloads/application-set2.properties";

	public static void main(String[] args) {
		SpringApplication.run(NewSpringBootApplication.class, args);
//		new SpringApplicationBuilder(NewSpringBootApplication.class)
//		.properties(APPLICATION_LOCATIONS)
//		.run(args);
	}

}
