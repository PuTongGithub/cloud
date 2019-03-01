package me.putong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.putong.feign.client.ProducerRemote;

@RestController
@RequestMapping("/api")
public class HelloController {
	
	@Autowired
	private ProducerRemote producerRemote;

	@GetMapping("/myHello")
	public String myHello(@RequestParam("name") String name) {
		return producerRemote.hello("#" + name);
	}
}
