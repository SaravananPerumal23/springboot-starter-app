package com.msajce.web.springbootstarter.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class DefaultController {

	@RequestMapping("/")
	public String sayHelloWorld() {
		return "Hello world!";
	}

	@RequestMapping("/hello")
	public String sayHelloName(@RequestParam(value = "name") String name) {
		return "Hello " + name + "!";
	}
}
