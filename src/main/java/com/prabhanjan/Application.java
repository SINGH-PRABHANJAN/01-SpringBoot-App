package com.prabhanjan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		final String nameofCountry="IND";
		final String url="https://abi/getindex";
		ConfigurableApplicationContext run= SpringApplication.run(Application.class, args);
		run.close();
	}

}
