package module6;

import org.testng.annotations.Test;

public class Depends_Priority {
	
	@Test(priority = 2)
	public void Pune() {
		System.out.println("This is the Test Case 1");
	}

	@Test(priority = 11)
	public void Banglore() {
		System.out.println("This is the Test Case 2");
	}

	@Test(dependsOnMethods = "Pune")
	public void Mumbai() {
		System.out.println("This is the Test Case 3");
	}

	@Test(dependsOnMethods = "Banglore")
	public void Hyderabad() {
		System.out.println("This is the Test Case 4");
	}
	
	@Test(priority = 3)
	public void Chennai() {
		System.out.println("This is the Test Case 5");
	}	
}