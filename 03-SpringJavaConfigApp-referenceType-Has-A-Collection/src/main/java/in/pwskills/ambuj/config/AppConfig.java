package in.pwskills.ambuj.config;


import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pwskills.ambuj.bean.Employee;

@Configuration
public class AppConfig {

	static {
		System.out.println("AppConfig.class file is loading...");
	}

	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}

	@Bean(name = "employee")
	public Employee employeeObj() {
		System.out.println("AppConfig.wmgObj():: Creating the object...");
		Employee enployee = new Employee() ;
		enployee.setEid(1);
		enployee.setSalary(5000);
		enployee.setAcountNumbers(Map.of("canara", "12232", "SBI", "333221"));
		enployee.setFriends(List.of("saurav", "dravid", "yuvi"));
		enployee.setPhoneNumbers(Set.of("9998887776", "8887776665", "7776665554"));

		return enployee;
	}

}