package coreJavaBasics;

import org.testng.annotations.Test;

public class child extends parent{
	
	@Test
	public void testRun() {
		
		child2 c2=new child2(3);
		child3 c3=new child3(3);
		
		//int a=3;
		dothis();
		
		System.out.println(c2.increment());
		System.out.println(c2.decrement());
		
		System.out.println(c3.multiplyTwo());
		System.out.println(c2.multiplyThree());
		System.out.println(c2.multiplyFour());
		
	}

}
