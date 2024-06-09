package com.todos.todolist_solid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TodolistSolidApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistSolidApplication.class, args);
	}

}
