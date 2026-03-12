package coreJavaBasics;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This is 'Ankur Goyal' Login page";
		String[] str1=str.split("'"); //at 0th index we get This is - and at 1st index we get Ankur Goyal- Login Page
		System.out.println(str1[1]);
		String[] finalStr=str1[1].split("-");//at 0th Ankur Goyal at 1st - login page
		//System.out.println(finalStr[1]);
	}

}
