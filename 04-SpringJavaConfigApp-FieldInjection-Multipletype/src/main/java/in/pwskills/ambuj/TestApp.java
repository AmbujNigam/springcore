package in.pwskills.ambuj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.ambuj.bean.Flipkart;
import in.pwskills.ambuj.config.AppConfig;

public class TestApp {
	public static void main(String[] args) throws IOException {

		// starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		//Working with bean created by IOC
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		br.readLine() ;
		Flipkart wmg = context.getBean("flipkart", Flipkart.class);
		System.out.println(wmg);

		// close the container
		((AbstractApplicationContext) context).close();

	}
}

