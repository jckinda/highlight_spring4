package highlight_spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("highlight_spring4.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {

	public AopConfig() {
		// TODO Auto-generated constructor stub
	}

}
