package Singleton;

public class BasicSingleton {

	private String value;
	
	/**
	 * ------creation unique instance's classes-----------
	 * */
	private volatile static BasicSingleton instance = null;
	
	/**
	 * ----------------- we need empty private constructor-----------------
	 * */
	private  BasicSingleton() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	/**
	 * an method that create an object of the class
	 * */
	public static BasicSingleton getInstance() {
		/**
		 * --------if the object no exist create it--------------
		 * */
		if (instance  == null) {
			synchronized (BasicSingleton.class) {
				
			if (instance == null) {
				instance = new BasicSingleton();	
			}
			}
			
		}
		
		return  instance;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}
	
	
	
}
