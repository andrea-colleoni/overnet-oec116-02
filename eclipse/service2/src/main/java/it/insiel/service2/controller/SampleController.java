package it.insiel.service2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;

import it.insiel.service2.clients.Service1Client;

@RestController
public class SampleController {
	
//	@Autowired
//	private EurekaClient eurekaClient;
	
	@Autowired
	private Service1Client s1;

	
	@GetMapping("/sample")
	public String sample() {
		return "sample!!";
	}
	
	@GetMapping("/serv1")
	public String serv1() {
//		var app = eurekaClient.getApplication("SERVICE1");
//		var istanze = app.getInstances();
//		for(var i : istanze) {
//			System.out.println(i.getIPAddr() + " - " + i.getPort());
//		}
		return s1.greet();
	}
	
}
