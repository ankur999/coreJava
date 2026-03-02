package coreJavaBasics;


//block of code is executed whenever an object is created
public class ConstructorDemo {
	//Default 
	public ConstructorDemo(){
		
		System.out.println("Constructor this side");	
		
	}
	
	//Parameterized
	public ConstructorDemo(int a,int b) {
		System.out.println("Parametrized Const. this side");
		
	}
	
	//Parameterized
		public ConstructorDemo(String str) {
			System.out.println(str);
			
		}
	
	public void getData() {
		System.out.println("Method this side");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ConstructorDemo dc=new ConstructorDemo();
		ConstructorDemo dc1=new ConstructorDemo(4,5);
		ConstructorDemo dc2=new ConstructorDemo("hello");
		//dc.getData();

	}

}
