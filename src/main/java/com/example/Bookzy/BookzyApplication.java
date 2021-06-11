package com.example.Bookzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BookzyApplication extends SpringBootServletInitializer{
	@Override  
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)   
	{  
		return application.sources(BookzyApplication.class);  
	}  

	public static void main(String[] args) {
		SpringApplication.run(BookzyApplication.class, args);
	}

}
