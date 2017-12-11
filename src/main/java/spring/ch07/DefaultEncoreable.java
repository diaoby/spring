package spring.ch07;

import org.springframework.stereotype.Component;

@Component
public class DefaultEncoreable implements Encoreable {

	public void performEncore() {
		System.out.println("DefaultEncoreable.performEncore");
	}

}
