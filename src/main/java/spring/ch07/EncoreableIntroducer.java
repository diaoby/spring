package spring.ch07;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EncoreableIntroducer {
	@DeclareParents(value="spring.ch07.Performance+",
			defaultImpl=DefaultEncoreable.class)
	public Encoreable encoreable;
}
