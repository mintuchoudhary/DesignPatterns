package com.creational.factory2;

public class CurrencyFactory {

	public static Currency createCurrency(String country){
		if(country.equals("India"))		 {
			return new Rupee();
		}
		else if(country.equals("US"))
		{
			return new USDollar();
		}
		return null;
	}
	 
}
