package com.creational.factory2;

public class FactoryDesignMain {
public static void main(String[] args) {
	CurrencyFactory currencyFactory = new CurrencyFactory();
	
	Currency currency = currencyFactory.createCurrency("India");
	System.out.println(currency.getSymbol());
	Currency currency1 = currencyFactory.createCurrency("US");
	System.out.println(currency1.getSymbol());
}
}
