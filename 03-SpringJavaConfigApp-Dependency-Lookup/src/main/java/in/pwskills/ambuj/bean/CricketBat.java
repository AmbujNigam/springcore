package in.pwskills.ambuj.bean;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class CricketBat {
	static {
		System.out.println("CricketBat .class file loading...") ;
	}

	public CricketBat() {
		System.out.println("CricketBat object created") ;
	}
	public int scoreRuns() {
		System.out.println("CricketBat.scoreRuns()");
		return new Random().nextInt(200);
	}
}
