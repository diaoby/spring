package spring.ch08;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AudienceMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/ch08/audience.xml");
		Performance performance = context.getBean(Performance.class);
		performance.perform();
	}

}
