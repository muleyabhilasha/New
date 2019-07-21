package com.Interface;

public interface A 
{
	
	
	 void print();
	 
	 default void display()
	 {
	 
		 System.out.println("default method called");
	 }
	 
	 static void msg()
	 {
		 System.out.println("static method called");
	 }
}
