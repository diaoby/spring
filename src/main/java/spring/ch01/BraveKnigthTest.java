package spring.ch01;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class BraveKnigthTest {
	@Test
	public void knigthSouldEmbarkOnQuest() {
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest,times(1)).embark();
	}
}
