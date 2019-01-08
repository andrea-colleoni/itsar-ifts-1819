package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public B2 b() {
		return new B2();
	}
	
	@Bean
	public A a() {
		return new A();
	}
	
	@Bean
	public App app() {
		return new App();
	}
	
}
