package spring.ch05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AudicenceMain {

	public static void main(String[] args) {
		ApplicationContext ctx =  new AnnotationConfigApplicationContext(ConcertConfig.class);
		Performance performance = ctx.getBean(Performance.class);
		performance.perform();

	}

}
