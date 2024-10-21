package com.ms.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ms.email.utils.EnvLoader;

@SpringBootApplication
public class EmailApplication {

	public static void main(String[] args) {
		EnvLoader.loadEnv();
		SpringApplication.run(EmailApplication.class, args);
	}

}
