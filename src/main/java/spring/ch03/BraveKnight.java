package spring.ch03;

public class BraveKnight implements Knight{
	private Quest quest;
	
	public BraveKnight(Quest quest) {
		this.quest  = quest;
	}
	/**
	 * 没有用aop 直接调用
	 */
	public void embarkOnQuest() {
		quest.embark();
	}

}
