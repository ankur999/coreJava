package coreJavaBasics;

public class SuperChild extends SuperParent{
	
	String name= "Goyal";
	//super use to get value from parent class
	
	
	public SuperChild() {
		super();//will call parent class constructor and it must the the first statement;
		System.out.println("Child class constructor");
		
	}
	
	public void getStringData() {
		System.out.println(name);//from child
		//System.out.println(super.name);//from parent
		
		//super.getStringData();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SuperParent sc=new SuperChild();
		SuperChild sc=new SuperChild();
		//System.out.println(sc.name);
		sc.getStringData();

	}

}
