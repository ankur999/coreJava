package coreJavaBasics;

public class child2 extends child3{
	int a;
	
	public child2(int a) {
		super(a);//user to invoke parent class constructor
		this.a=a;
		
	}

	public int increment() {
		a=a+1;
		return a;
	}
	
	public int decrement() {
		a=a-1;
		return a;
	}


}
