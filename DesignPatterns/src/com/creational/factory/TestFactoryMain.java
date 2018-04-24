package com.creational.factory;

/*
 * 
 * Factory design pattern is used when we have a super class with multiple sub-classes and
 *  based on input, we need to return one of the sub-class. This pattern take out the responsibility
 *   of instantiation of a class from client program to the factory class.
 * */
public class TestFactoryMain {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
		
		Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");
		
		System.out.println("Factory PC Config::" + pc);
		System.out.println("Factory Server Config::" + server);
	}

}