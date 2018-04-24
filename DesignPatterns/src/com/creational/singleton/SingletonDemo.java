package com.creational.singleton;

/*
 * 1.	Eager Initilization
 * 2.	Lasy Initilization 
 * 3.	Static Block Initilization 
 * 4.	Thread Safe (Synchronized) Singleton
 * 5. Double checked Locking Principle - Thread Safe (Synchronized) Singleton 
 * 6. Inner class */


/* 
//Eager Initilization 
class Singleton {
	
	
	private static Singleton singletonObj = new Singleton();
	public String s;

	private Singleton() {
		s = "value set for s in private constructor";
	}

	public static Singleton getInstance() {
	 
		return singletonObj;
	}
}*/

/*
//Lasy Initilization 
class Singleton {
	
	
	private static Singleton singletonObj = null;
	public String s;

	private Singleton() {
		s = "value set for s in private constructor";
	}

	public static Singleton getInstance() {
		if (singletonObj == null)

			singletonObj = new Singleton();

		return singletonObj;
	}
}*/
/*
//Static Block Initilization 
class Singleton {
	
	
	private static Singleton singletonInstance = null;
	public String s;

	static 
	{
		singletonInstance = new Singleton();
		
	}
	private Singleton() {
		s = "value set for s in private constructor";
	}

	public static Singleton getInstance() {

		return singletonInstance;
	}
}*/

/*//Thread Safe (Synchronized) Singleton  
class Singleton {

	private static Singleton singletonInstance = null;
	public String s;

	private Singleton() {
		s = "value set for s in private constructor";
	}

	public static synchronized Singleton getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new Singleton();
		}
		return singletonInstance;
	}
}*/

/*//Double checked Locking Principle - Thread Safe (Synchronized) Singleton  
class Singleton {

	private static Singleton singletonInstance = null;
	public String s;

	private Singleton() {
		s = "value set for s in private constructor";
	}

	public static Singleton getInstance() {
		if (singletonInstance == null) {
			synchronized (Singleton.class) {
				if (singletonInstance == null) {
					singletonInstance = new Singleton();
				}
			}

		}
		return singletonInstance;
	}
}*/

//Inner class 
 class Singleton {

	public String s;

	private Singleton() {
		s = "value set for s in private constructor";
	}

	private static class SingletonHelper {
		private static  Singleton singletonInstance = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonHelper.singletonInstance;

	}
}
 

/*//Enum Singleton
enum Singleton 
{
INSTANCE;
}*/

/*class Singleton {
private static Singleton singletonInstance= null;
public static Singleton getInstance()
{
	 
}*/
//}
public class SingletonDemo {
	public static void main(String args[]) {
		
	/*	Singleton obj1 = Singleton.INSTANCE;
		Singleton obj2 = Singleton.INSTANCE;
		Singleton obj3 = Singleton.INSTANCE;*/
		
	 	Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();
 
		System.out.println(obj1+ " " + obj2 + " " + obj3);
	/*	System.out.println("value of s=" + obj1.s);
		obj1.s = "new value";
		System.out.println("value of s=" + obj2.s);*/

		System.out.println(obj1 + " " + obj2);
	}
}