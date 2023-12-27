package com.sample.user.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages = { "com.sample.user.management.controller" })
@Configuration
@ComponentScan(basePackages = { "com.sample.user.management.controller", "com.sample.user.management.service",
		"com.sample.user.management.authentication" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
