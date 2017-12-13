package spring.ch11;

public aspect CriticAspect {
	public CriticAspect() {}
	
	pointcut performance():execution(* perform(..));
	
	void afterReturning():performance(){
		System.out.println(criticismEngine.getCriticism());
	}
	
	private CriticismEngine criticismEngine;
	public void setCriticismEngine(CriticismEngine criticismEngine) {
		this.criticismEngine = criticismEngine;
	}
}
