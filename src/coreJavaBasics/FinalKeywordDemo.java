package coreJavaBasics;

public class FinalKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int i=4;//once define variable with final you cannot change it again
		//i =5; not able to change 

	}

}

// once define variable with final you cannot change it again
// once class is marked as final you cannot inherit it
// once method is define as final you cannot override it

//package

//they are nothing but set of classes and interfaces
// java.lang is a default package and comes as inbuilt compiler
// java.util all collection interfaces comes from util package
// user defined packages: all TC are inside this for ex: coreJavaBasics is user defined package
// Class A can use class B directly by creating obj if both Class A and Class B belongs to same package
// if classes belong to different package then we need to import the other class package to use its methods
//import package.classname;
