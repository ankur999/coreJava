package coreJavaBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class parent {
	
	@BeforeMethod
	public void before() {
		System.out.println("will run first");
	}
	
	public void dothis() {
		System.out.println("from Parent");
	}
	
	@AfterMethod
	public void after() {
		System.out.println("will run last");
		System.out.println("will run last last");
		System.out.println("will run last last three");
	}

}
