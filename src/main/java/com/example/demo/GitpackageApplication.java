package com.example.demo;

import com.example.demo.unit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitpackageApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitpackageApplication.class, args);
		Test test = new Test();
		test.display("hi");
	}

}
