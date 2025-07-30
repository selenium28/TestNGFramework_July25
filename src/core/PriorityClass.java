package core;

import org.testng.annotations.Test;

public class PriorityClass {

	@Test (priority = 1)
	public void one() {
		System.out.println("Test CAse One");
	}

	@Test (priority = 2)
	public void two() {
		System.out.println("Test CAse Two");
	}
	
	@Test (priority = 0)
	public void three() {
		System.out.println("Test CAse Three");
	}
	
	@Test (priority = -4)
	public void four() {
		System.out.println("Test CAse Four");
	}
}
