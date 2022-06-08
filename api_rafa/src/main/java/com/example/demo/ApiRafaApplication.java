package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.ApiController;
import com.example.demo.models.Informacao;

@SpringBootApplication
public class ApiRafaApplication {

	public static void main(String[] args) {
		System.out.print("o servidor iniciou novamente....");
		SpringApplication.run(ApiRafaApplication.class, args);
	}

}
