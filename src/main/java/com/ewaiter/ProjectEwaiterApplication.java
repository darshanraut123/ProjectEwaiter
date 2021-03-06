package com.ewaiter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.ewaiter.*")
@SpringBootApplication
public class ProjectEwaiterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectEwaiterApplication.class, args);
	}

}
