package coreJavaBasics;

public class StaticVar {
	
	String name;//instance variable or class variable
	String address;
	static String city="Banglore";//this variable copy will be shared by all objects as this belong to class but not object
	static int i=0;
	
	public StaticVar(String name, String address) {//local variable
		
		this.name=name;//this refer to current class instance variable
		this.address=address;
		i++;
		System.out.println(i);
		
		
	}
	public void getAddress() {
		
		System.out.println(address+" "+city);
		//return address;
	}
	
	public static void getCity() {//static method will access only static methods/variables
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVar sv=new StaticVar("Bob","Marathali");
		StaticVar sv1=new StaticVar("Raj","Whitefield");
		sv.getAddress();
		sv1.getAddress();
		StaticVar.getCity();//no need to create obj you can call it directly or by using classname

	}
	//static block is used to initialize all you static variable
	
	
	
	/* static string city;
	 * static int i;
	 * static{
	 * 
	 * city=banglaore;
	 * i=0;
	 * 
	 * }
	 * 
	 */

}
