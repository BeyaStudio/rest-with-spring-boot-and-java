package com.beyaStudio.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.beyaStudio.model.Greeting;

// Faz com que a classe seja um controlador REST e possa responder a requisições HTTP
@RestController
public class GreetingController {
	
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting greeting(
			@RequestParam(value = "name", defaultValue = "World")
			String name) {
		
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

}
