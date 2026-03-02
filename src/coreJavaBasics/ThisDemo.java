package coreJavaBasics;

public class ThisDemo {
	int a=2;
	
	public void getData() {
		int a=3;
		int b=a+this.a;
		//this.a=a;//refers to current object - object scope lies in class level
		
		System.out.println(this.a);
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisDemo td=new ThisDemo();
		td.getData();

	}

}
