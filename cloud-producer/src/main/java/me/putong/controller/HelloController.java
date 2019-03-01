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
	
	@Value("${producer.profile:error}")
	private String profileString;

	@GetMapping("/hello")
	public String hello(@RequestParam("name") String name) {
		StringBuilder helloBuilder = new StringBuilder();
		helloBuilder.append("Hello ");
		helloBuilder.append(name);
		helloBuilder.append(" ");
		helloBuilder.append(new Date());
		helloBuilder.append(System.getProperty("line.separator"));
		helloBuilder.append("profile: ");
		helloBuilder.append(profileString);
		return helloBuilder.toString();
	}
}
