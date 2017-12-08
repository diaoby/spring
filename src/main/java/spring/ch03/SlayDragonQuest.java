package spring.ch03;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {

	private PrintStream stream;
	
	public SlayDragonQuest( PrintStream stream) {
		this.stream = stream;
	}
	
	public void embark() {
		stream.println("SlayDragonQuest");
	}

}
