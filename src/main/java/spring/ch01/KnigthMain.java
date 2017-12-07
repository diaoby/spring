package spring.ch01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class KnigthMain {

	public static void main(String[] args) {
		//基于xml配置
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/ch01/knight.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
		//基于java 配置
		ApplicationContext ctx =  new AnnotationConfigApplicationContext(KnightConfig.class);
		Knight knight2 = ctx.getBean(Knight.class);
		knight2.embarkOnQuest();
		
		//从文件中拿
//		FileSystemXmlApplicationContext fileContex = new FileSystemXmlApplicationContext("src\\main\\java\\spring\\ch01\\knight.xml");
		FileSystemXmlApplicationContext fileContex = new FileSystemXmlApplicationContext("classpath:spring/ch01/knight.xml");
		Knight knight3 = fileContex.getBean(Knight.class);
		knight3.embarkOnQuest();
		fileContex.close();
	}

}
