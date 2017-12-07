package spring.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnigthMain {

	public static void main(String[] args) {
		//基于java 配置-----没有用aop 直接调用
		ApplicationContext ctx =  new AnnotationConfigApplicationContext(KnightConfig.class);
		Knight knight = ctx.getBean(Knight.class);
		knight.embarkOnQuest();
	}

}
