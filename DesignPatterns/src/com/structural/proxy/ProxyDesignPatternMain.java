package com.structural.proxy;

/* Proxy pattern intent is to “Provide a placeholder/wrapper for another object to control and manage access to it in order to protect it”.
 * The definition itself is very clear and proxy pattern is used when we want to provide controlled access of a functionality.
 * 
 * A real world example can be a cheque or credit card is a proxy for what is in our bank account. 
 * It can be used in place of cash, and provides a means of accessing that cash when required.
 * 
 * */
public class ProxyDesignPatternMain {
	public static void main(String[] args) {

		Internet internet = new ProxyInternet();
		try {
			internet.connectTo("geeksforgeeks.org");
			internet.connectTo("abc.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
