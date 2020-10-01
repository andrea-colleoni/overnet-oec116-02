package it.insiel.service2.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("SERVICE1")
public interface Service1Client {

	@RequestMapping(path = "/greet", method = RequestMethod.GET)
	String greet();
}
