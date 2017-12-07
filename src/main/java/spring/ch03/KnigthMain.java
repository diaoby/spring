package spring.ch03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.ch03.Knight;

public class KnigthMain {

	public static void main(String[] args) {
		//基于xml配置
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/ch03/knight.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}

}
