package spring.ch08;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	
	public void silenceCellPhones() {
		System.out.println("===========表演前关手机===========");
	}
	public void taskeSeates() {
		System.out.println("===========表演前就坐===========");
	}
	
	public void applause() {
		System.out.println("===========表演后鼓掌===========");
	}
	public void demandRefund() {
		System.out.println("===========表演失败后退票===========");
	}
	
	public void watchPerformacne(ProceedingJoinPoint jp) {
		try {
			System.out.println("===========Around 表演前关手机===========");
			System.out.println("===========Around 表演前就坐===========");
			jp.proceed();
			System.out.println("===========Around 表演后鼓掌===========");
		} catch (Throwable e) {
			System.out.println("===========Around 表演失败后退票===========");
		}
	}
}
