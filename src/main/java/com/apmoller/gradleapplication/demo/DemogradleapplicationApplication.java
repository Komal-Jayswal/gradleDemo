package com.apmoller.gradleapplication.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemogradleapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemogradleapplicationApplication.class, args);
		System.out.println("Demo Application using Gradle");
	}
}
