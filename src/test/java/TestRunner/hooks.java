package TestRunner;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	@Before("net banking")
	public void datase() {
		System.out.println("user enter net banking");
	}
	
	@After("teardown")
	public void close() {
		System.out.println("teardown");
	}

}
