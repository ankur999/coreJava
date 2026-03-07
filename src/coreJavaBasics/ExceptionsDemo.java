package coreJavaBasics;


//one try block can be followed by multiple catch blocks
//catch should be an immediate block after try
//finally block won't be executed if you try to force quit the JVM
public class ExceptionsDemo {
	
	//when you don't know the code might throw an error then you handle those cases using try catch block.
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=4;
		int b=0;
		
		try {
			//int c=a/b;
			int[] arr= {1,2,3,4,5};
			System.out.println(arr[5]);
		}
		
		catch(ArithmeticException at) {
			System.out.println("might throw arithmetic error");
		}
		
		catch(IndexOutOfBoundsException iob) {
			System.out.println("might throw out of bound exception error");
		}
		
		
		catch(Exception e) {
			System.out.println("might throw error");
		}
		
		finally{
			
			System.out.println("This block will be executed irrespective of the execption occur or not");
		}
		
		
		

	}

}
