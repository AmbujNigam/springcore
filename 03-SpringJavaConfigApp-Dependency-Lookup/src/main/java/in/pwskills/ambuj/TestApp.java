package in.pwskills.ambuj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.ambuj.bean.Cricketer;
import in.pwskills.ambuj.config.AppConfig;

public class TestApp {
	public static void main(String[] args) {

		// starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Cricketer cricketer = context.getBean("cricketer",Cricketer.class) ;
		cricketer.fielding();
		cricketer.wicketkeeping();
		cricketer.bowling();
		cricketer.batting();

		// close the container
		((AbstractApplicationContext) context).close();

	}
}

