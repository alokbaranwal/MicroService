package com.project.SpringbootMicroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@ComponentScan
@SpringBootApplication
public class SpringbootMicroServiceApplication {
	@Autowired
	private Configuration configuration;
	
	@Value("${db.username}")
	private String username;
	
	@Value("${db.password}")
	private String password;
	
	@GetMapping("/")
	public String hello(){
		return "Hello,Hi there! "+ configuration.getMinimum() +  ", "+username +", "+password;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicroServiceApplication.class, args);
	}

}

