package com.example;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.example.entity.Phone;
import com.example.entity.PhoneRepository;

@SpringBootApplication
@EnableEurekaClient
public class PhoneServiceApplication {
	
	@Autowired
	PhoneRepository phonerepo;	
	
	@Bean
	CommandLineRunner runner () {
		Arrays.asList(12345, 343453, 3534, 35345).forEach(n -> phonerepo.save(new Phone(n)));
		
		return null;
	} 

    public static void main(String[] args) {
            SpringApplication.run(PhoneServiceApplication.class, args);
    }
    
    
}
