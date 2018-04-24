package com.creational.abstractfactory;

/*
 * In Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class. 
 * Then an Abstract Factory class that will return the sub-class based on the input factory class. 
 * */
public class TestDesignPatternsMain {

	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));

		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));

		System.out.println("AbstractFactory PC Config::" + pc);

		System.out.println("AbstractFactory Server Config::" + server);
	}
 
}