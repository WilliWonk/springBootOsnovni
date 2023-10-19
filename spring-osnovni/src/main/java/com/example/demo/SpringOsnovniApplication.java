package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringOsnovniApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOsnovniApplication.class, args);
	}
	
	//https://www.baeldung.com/spring-boot-angular-web
		
		/*
		@Bean
	    CommandLineRunner init(UserRepository userRepository) {
	        return args -> {
	            Stream.of("John", "Julie", "Jennifer", "Rachel", "Helen").forEach(name -> {
	                User user = new User(name, name.toLowerCase() + "@domain.com");
	                userRepository.save(user);
	            });
	            userRepository.findAll().forEach(System.out::println);
	        };
	    }
	    */
}
