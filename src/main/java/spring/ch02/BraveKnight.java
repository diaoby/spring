package spring.ch02;

public class BraveKnight implements Knight{
	private Quest quest;
	private Minstrel minstrel;
	
	public BraveKnight(Quest quest,Minstrel minstrel) {
		this.quest  = quest;
		this.minstrel = minstrel;
	}
	/**
	 * 没有用aop 直接调用
	 */
	public void embarkOnQuest() {
		minstrel.singBeforeQuest();
		quest.embark();
		minstrel.singAfterQuest();
	}

}
