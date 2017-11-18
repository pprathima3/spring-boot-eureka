package com.example;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.entity.Book;
import com.example.entity.BookRepository;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class BookServiceApplication {
	
	@Autowired
	BookRepository bookrepo;	
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Bean
	CommandLineRunner runner () {
		Arrays.asList("max", "puller", "antony", "rez").forEach(n -> bookrepo.save(new Book(n)));
		//String response = restTemplate.getForObject("http://phone-service/phones", String.class);
		discoveryClient.getInstances("phone-service").forEach(instance -> {
			
			System.out.println(instance.getUri());
			String response = restTemplate.getForObject(instance.getUri()+"/phones", String.class);
			System.out.println("phone response from book service$$$$"+response);
		});
		
		System.out.println("=======================");
		//System.out.println("phone response from book service$$$$"+response);
		System.out.println("=======================");
		return null;
		
	} 

    public static void main(String[] args) {
            SpringApplication.run(BookServiceApplication.class, args);
    }
    
   
}
