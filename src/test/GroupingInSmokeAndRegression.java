package test;

import org.testng.annotations.Test;

public class GroupingInSmokeAndRegression {
	
	@Test (groups = {"smoke"})
	public void smokeTestingOne() {
		System.out.println("Smoke Testing One");
	}
	
	@Test (groups = {"smoke"})
	public void smokeTestingTwo() {
		System.out.println("Smoke Testing Two");
	}
	
	@Test (groups = {"smoke"})
	public void smokeTestingthree() {
		System.out.println("Smoke Testing Three");
	}
	
	@Test (groups = {"smoke","regression"})
	public void bothSmokeAndRegression() {
		System.out.println("bothSmokeAndRegression");
	}
	
	@Test (groups = {"regression"})
	public void regressionTestingOne() {
		System.out.println("Regression Testing One");
	}
	
	@Test (groups = {"regression"})
	public void regressionTestingTwo() {
		System.out.println("Regression Testing Two");
	}
	
	@Test (groups = {"regression"})
	public void regressionTestingthree() {
		System.out.println("Regression Testing Three");
	}
	
}
