package com.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Serialization:- Serialization can also cause breakage of singleton property of singleton classes. 
 * Serialization is used to convert an object of byte stream and save in a file or send over a network. 
 * Suppose you serialize an object of a singleton class. Then if you de-serialize that object it will create a new instance and hence break the singleton pattern.
 * 
 * */
class SingletonClass implements Serializable {
	 
	/**
	 * 
	 */
	//private static final long serialVersionUID = -5537120765817402440L;
	private static SingletonClass singletonInstance = null;

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new SingletonClass();
		}
		return singletonInstance;
	}
	
 /*	protected Object writeReplace()  //gets called when writeObject
	{
		System.out.println("In write replace");
		return null;
		
	} */ 
	// implement readResolve method
	protected Object readResolve()   //gets called when deserialize
    {
    	System.out.println("in readResolve");
        return singletonInstance;
    }
	


}

public class SingletonBreakSerializableSolution {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		  
		SingletonClass singletonInstance = SingletonClass.getInstance();
		SingletonClass singletonInstance2 = SingletonClass.getInstance();
		SingletonClass singletonInstance3 = SingletonClass.getInstance();
		System.out.println(" All object reference is same = "+singletonInstance+" "+singletonInstance2 +" "+ singletonInstance3);
 
		
		FileOutputStream fos = new FileOutputStream("savesingletonObject.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(singletonInstance);
		
	  	FileInputStream fis = new FileInputStream("savesingletonObject.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		 
	 	SingletonClass singletonInstSerializable = (SingletonClass) ois.readObject(); 
	 	System.out.println(" Compare original  = "+singletonInstance+"  "+ singletonInstSerializable); //Will show different reference if readResolve () is not  implemented
	}

}
