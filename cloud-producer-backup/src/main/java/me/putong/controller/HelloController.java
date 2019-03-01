package me.putong.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
	
	@Value("${producer.instance}")
	private String instance;

	@GetMapping("/hello")
	public String hello(@RequestParam("name") String name) {
		return "From produce " + instance + ": Hello " + name + " " + new Date();
	}
}
