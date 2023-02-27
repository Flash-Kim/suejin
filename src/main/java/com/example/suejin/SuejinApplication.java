package com.example.suejin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SuejinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuejinApplication.class, args);
	}

	@RequestMapping("/")
	String home() {
		return "Hello World!! This is new version 23/02/27 15:20";
	}

}
