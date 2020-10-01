package it.insiel.service2.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "SERVICE1", fallback = HystrixDefaultFallback.class)
public interface Service1Client {

	@RequestMapping(path = "/greet", method = RequestMethod.GET)
	String greet();
}
