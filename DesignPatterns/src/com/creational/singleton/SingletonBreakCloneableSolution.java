package com.creational.singleton;


/*
 * Cloning: Cloning is a concept to create duplicate objects. Using clone we can create copy of object. 
 * Suppose, we ceate clone of a singleton object, then it wil create a copy that is there are two instances of a singleton class, 
 * hence the class is no more singleton.
 * */
class ClassSingleton implements Cloneable
{
private static ClassSingleton singletonInstance;

	private ClassSingleton(){}

public static ClassSingleton getInstance()
{
	if(singletonInstance==null)
	{
		singletonInstance= new ClassSingleton();
				
	}
	return singletonInstance;
}

@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
	throw new CloneNotSupportedException();
	}
}

public class SingletonBreakCloneableSolution {
public static void main(String[] args) throws CloneNotSupportedException {
	ClassSingleton singleton = ClassSingleton.getInstance();
	
	ClassSingleton singleton2 = (ClassSingleton) singleton.clone();
	
	System.out.println(singleton+" "+ singleton2);
}
}
