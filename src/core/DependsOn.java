package core;

import org.testng.annotations.Test;

public class DependsOn {
	
//	Login -> From -> To -> Date -> Return -> Date
	@Test
	public void one() {
		System.out.println("Test CAse One");
	}

	@Test (dependsOnMethods = "one")
	public void two() {
		System.out.println("Test CAse Two");
	}

	@Test (dependsOnMethods = "two")
	public void three() {
		System.out.println("Test CAse Three");
	}

	@Test (dependsOnMethods = "three")
	public void four() {
		System.out.println("Test CAse Four");
	}

	@Test (dependsOnMethods = "four")
	public void five() {
		System.out.println("Test CAse Five");
	}

	@Test (dependsOnMethods = "five")
	public void six() {
		System.out.println("Test CAse Six");
	}
}
