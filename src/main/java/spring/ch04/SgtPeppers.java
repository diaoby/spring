package spring.ch04;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
	
	private String title ="zhoujielun cd";
	private String artist="mama";

	public void play() {
		System.out.println("Playing "+title+" by "+ artist);
	}

}
