package coreJavaBasics;

import java.util.HashSet;
import java.util.Iterator;

//HashSet, LinkedHashSet, TreeSet classes implemented by Set Interface
//Set doesn't contains duplicate values
//also doesn't maintain insertion order


public class hashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<String>();
		set.add("USA");
		set.add("UK");
		set.add("India");
		set.add("USA");
		System.out.println(set);
		//set.remove("UK");
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set);
		System.out.println(set.isEmpty());
		
		//to iterate in hasSet there is an interface called iterator which helps to traverse through each and every element present in the set 
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		

	}

}
