package it.insiel.service2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.insiel.service2.clients.HystrixDefaultFallback;

@Configuration
public class ApplicationConfig {

	@Bean
	public HystrixDefaultFallback hystrixDefaultFallback() {
		return new HystrixDefaultFallback();
	}
}
