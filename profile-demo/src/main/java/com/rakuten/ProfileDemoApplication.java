package com.rakuten;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProfileDemoApplication {

	public static void main(String[] args) {
	    ApplicationContext context = SpringApplication.run(ProfileDemoApplication.class, args);
	    context.getBean(UserService.class);
	}

}
