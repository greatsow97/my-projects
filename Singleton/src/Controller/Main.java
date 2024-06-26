package Controller;

import Singleton.BasicSingleton;

public class Main {

	 public static void main(String[] args) {
		 
		BasicSingleton foo = BasicSingleton.getInstance();
		
		BasicSingleton woo = BasicSingleton.getInstance();
		
		foo.setValue("i'm the foo instance");
		
		System.out.println(woo.getValue());
		 
		 
		
		 
		 
		 
	 }
	
}
