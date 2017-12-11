package spring.ch05;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ConcertConfig.class)
/**
 *  自动化装配bean
 * @author Administrator
 *
 */
public class AudicenceTest {
	@Autowired
	private Audience1 dudience1;
	@Autowired
	private Performance performance;

	@Test
	public void test() {
		performance.perform();
	}

}
