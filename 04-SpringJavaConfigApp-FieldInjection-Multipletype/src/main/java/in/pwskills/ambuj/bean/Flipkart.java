package in.pwskills.ambuj.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Flipkart implements ICourier {
	//@Autowired
	//@Qualifier(value = "fedEx")
	@Value("#{DTDC}")
	ICourier courier ;

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + "]";
	}

	@Override
	public String dilvOdr(Integer oid) {
		return null;
	}

	public Flipkart() {
		System.out.println("Flipkart object created") ;
	}

}
