package spring.ch05;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience1 {
	
	@Before("execution(** spring.cho5.Performance.perform(..))")
	public void silenceCellPhones() {
		System.out.println("===========表演前关手机1===========");
	}
	@Before("execution(** spring.cho5.Performance.perform(..))")
	public void taskeSeates() {
		System.out.println("===========表演前就坐1===========");
	}
	@AfterReturning("execution(** spring.cho5.Performance.perform(..))")
	public void applause() {
		System.out.println("===========表演后鼓掌1===========");
	}
	@AfterThrowing("execution(** spring.cho5.Performance.perform(..))")
	public void demandRefund() {
		System.out.println("===========表演失败后退票1===========");
	}
}
