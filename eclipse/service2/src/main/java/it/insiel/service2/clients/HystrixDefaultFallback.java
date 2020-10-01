package it.insiel.service2.clients;

public class HystrixDefaultFallback implements Service1Client {

	@Override
	public String greet() {
		return "fallback";
	}
	
}
