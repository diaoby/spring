package spring.ch02;

import java.io.PrintStream;

public class Minstrel {
	private PrintStream stream;
	public Minstrel(PrintStream stream) {
		this.stream = stream;
	}
	public void singBeforeQuest() {
		stream.println("Minstrel.singBeforeQuest");
	}
	public void singAfterQuest() {
		stream.println("Minstrel.singAfterQuest");
	}
}
