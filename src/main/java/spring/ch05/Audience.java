package spring.ch05;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut("execution(** spring.cho5.Performance.perform(..))")
	public void performance() {}
	
	@Before("performance()")
	public void test1() {
		System.out.println("===========表演第一个顺序？===========");
	}
	
	@Before("performance()")
	public void silenceCellPhones() {
		System.out.println("===========表演前关手机===========");
	}
	@Before("performance()")
	public void taskeSeates() {
		System.out.println("===========表演前就坐===========");
	}
	
	
	@AfterReturning("performance()")
	public void applause() {
		System.out.println("===========表演后鼓掌===========");
	}
	@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("===========表演失败后退票===========");
	}
	@Around("performance()")
	public void watchPerformacne(ProceedingJoinPoint jp) {
		try {
			System.out.println("===========Around 表演前关手机===========");
			System.out.println("===========Around 表演前就坐===========");
			jp.proceed();
			System.out.println("===========Around 表演后鼓掌===========");
		} catch (Throwable e) {
			System.out.println("===========Around 表演失败后退票===========");
			// TODO: handle exception
		}
	}
}
