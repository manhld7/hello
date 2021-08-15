package me.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping
	public String helloWorld() {
		return "Hello world!";
	}
	
	@GetMapping("/{name}")
	public String helloWorld(@PathVariable String name) {
		return "Hello " + name;
	}
	
	@GetMapping("/hru")
	public String hru() {
		return "How are you?";
	}
}
