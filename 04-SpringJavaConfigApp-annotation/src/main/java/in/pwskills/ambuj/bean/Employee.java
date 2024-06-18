package in.pwskills.ambuj.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component
@PropertySource("application.properties")
public class Employee implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	@Value("${info.emp.eid}")
	private Integer eid ;
	
	@Value("${info.emp.ename}")
	private String ename ;
	
	@Value("${info.emp.eage}")
	private Integer eage ;
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + "]";
	}

	public Employee() {
		super();
	}


}