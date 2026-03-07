package coreJavaBasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//takes value in key value pair
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(0, "Java");
		map.put(1, "Automation");
		map.put(2, "Learning");
		map.put(3, "Classes");
		
		//to get value of a specific key
		//if you try to print the value of a key which is not present you will get null in return
		System.out.println(map.get(2));
		//to remove a specific key
		//map.remove(1);
		//System.out.println(map.get(1));
		
		Set es=map.entrySet();//converting hashMap to set
		// to iterate it 
		Iterator itr=es.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			
			Map.Entry mp=(Map.Entry)itr.next();//this will help to separate both key and value
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		//Diff btw HashMap & HashTable
		//Hashmap is not synchronized and not thread safe HashTable is syny as well as thread safe
		//You can use hasmap in case multithreading is not req and hashtable is used for multithreading
		//Hashmap allow one null key and any no of null values but HT doesn't allow null key and null avlue
		//hashmap object value are iterated by using iterator but hashtable is the only class other than vector which uses enumuratir to iterate the values of objec
		
		
		
		

	}

}
