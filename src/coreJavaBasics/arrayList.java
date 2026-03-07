package coreJavaBasics;

import java.util.ArrayList;
import java.util.List;


//In arrays size is fixed but in array list we can increase and dec size of an array
//all classes(ArrayList, LinkedList, Vector) that implements list interface accepts duplicate values
//also have fixed order
//you can insert and delete value in arrayList but not in arrays
public class arrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ankur");
		list.add("Java");
		
		System.out.println(list);
		list.add(0, "Goyal");//will add element at specific index
		list.add("Goyal");
		System.out.println(list);
		//list.remove(1);//by index
		//list.remove("Java");//by element name
		
		//System.out.println(list);
		
		System.out.println(list.get(2));//to fetch value from index
		//to check string is present in array list or not
		System.out.println(list.contains("Tesy"));
		
		//to get the index of element in an array list
		System.out.println(list.indexOf("Java"));
		// to get size of an array
		System.out.println(list.size());
		
		
//		 ArrayList<String> al=new ArrayList<String>();
//	        
//	        al.add("apple");
//	        al.add("banana");
//	        al.add("cherry");
//	        al.add("mango");
//	        al.add("apple");
//	        
//	        System.out.println(al);
//	        
//	        al.remove(0);
//	        
//	        System.out.println(al);
//	        
//	       if(al.contains("orange")){
//	           System.out.println("Orange is found");
//	       }else{
//	           System.out.println("Orange is not found");
//	       }
//	       
//	       System.out.println(al.size());
//	       
//	       for(String list:al){
//	           System.out.println(list);
//	       }
		
		

	}

}
