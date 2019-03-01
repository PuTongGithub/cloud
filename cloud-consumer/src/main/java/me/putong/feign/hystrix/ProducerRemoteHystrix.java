package me.putong.feign.hystrix;

import org.springframework.stereotype.Component;

import me.putong.feign.client.ProducerRemote;

@Component
public class ProducerRemoteHystrix implements ProducerRemote{

	@Override
	public String hello(String name) {
		return "Hello! From Hystrix!";
	}

}
