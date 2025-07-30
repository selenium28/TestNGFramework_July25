package core;

import org.testng.annotations.Test;

public class EnableAndDisable {
	
	@Test(enabled = false)
	public void one() {
		System.out.println("Test CAse One");
	}

	@Test(enabled = false)
	public void two() {
		System.out.println("Test CAse Two");
	}
	
	@Test(enabled = true)
	public void three() {
		System.out.println("Test CAse Three");
	}
	
	@Test(enabled = true)
	public void four() {
		System.out.println("Test CAse Four");
	}
	
	@Test(enabled = true)
	public void five() {
		System.out.println("Test CAse Three");
	}
	
	@Test(enabled = true, priority = 1)
	public void six() {
		System.out.println("Test CAse Four");
	}

}
