package spring.ch07;

import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements Performance{

	public void perform() {
		System.out.println("=============Performance.perform==============");
	}

}
