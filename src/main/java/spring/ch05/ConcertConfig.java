package spring.ch05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {
	@Bean
	public Audience1 gudience() {
		return new Audience1();
	}
	@Bean
	public Performance performance() {
		return new PerformanceImpl();
	}
}
