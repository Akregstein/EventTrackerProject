package com.skilldistillery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MountainTrackerRestApplication extends SpringBootServletInitializer{

	  @Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(MountainTrackerRestApplication.class);
	  }

	  
	
	public static void main(String[] args) {
		SpringApplication.run(MountainTrackerRestApplication.class, args);
	}

}
