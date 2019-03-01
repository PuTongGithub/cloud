package me.putong.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import me.putong.feign.hystrix.ProducerRemoteHystrix;

@FeignClient(name = "cloud-producer", fallback = ProducerRemoteHystrix.class)
public interface ProducerRemote {

	@GetMapping("/api/hello")
	String hello(@RequestParam("name") String name);
}
