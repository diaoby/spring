package spring.ch07;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=EncoreableIntroducerConfig.class)
public class EncoreableIntroducerTest {

	@Autowired
	private Performance performance;
	

	@Test
	public void test() {
		performance.perform();
		//performance 对象具有了 Encoreable 里才有方法的performEncore方法
		Encoreable encoreable = (Encoreable) performance;
		encoreable.performEncore();
	}

}
