package com.apress.todo.todointegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.apress.todo"})
public class TodoIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoIntegrationApplication.class, args);
	}

}
