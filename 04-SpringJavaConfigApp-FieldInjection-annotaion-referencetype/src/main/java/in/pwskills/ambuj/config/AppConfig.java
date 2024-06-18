package in.pwskills.ambuj.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.pwskills.ambuj.bean.WishMessageGenerator;

@Configuration
@ComponentScan(basePackages = "in.pwskills.ambuj")
public class AppConfig {

	static {
		System.out.println("AppConfig.class file is loading...");
	}

	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}

	@Bean
	public LocalDateTime ldt() {
		System.out.println("AppConfig.wmgObj():: Creating the object...");

		// Create a Target Object
		LocalDateTime ldt = LocalDateTime.now(); 
		

		return ldt;
	}

}