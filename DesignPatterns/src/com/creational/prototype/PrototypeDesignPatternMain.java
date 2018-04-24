package com.creational.prototype;

/*
 * Prototype pattern is used when the Object creation is a costly affair and 
 * requires a lot of time and resources and you have a similar object already existing.
 * 
 * Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs. 
 * Prototype design pattern uses java cloning to copy the object.
 * 
 * */

//A Java program to demonstrate working of
//Prototype Design Pattern with example 
//of a ColorStore class to store existing objects.

import java.util.HashMap;
import java.util.Map;

abstract class Color implements Cloneable {

	protected String colorName;

	abstract void addColor();

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class blueColor extends Color {
	public blueColor() {
		this.colorName = "blue";
	}

	@Override
	void addColor() {
		System.out.println("Blue color added");
	}
}

class redColor extends Color {

	public redColor() {
		this.colorName = "red";
	}

	@Override
	void addColor() {
		System.out.println("Red color added");
	}
}

class ColorStore {

	private static Map<String, Color> colorMap = new HashMap<String, Color>();

	static {
		colorMap.put("blue", new blueColor());
		colorMap.put("red", new redColor());
	}

	public static Color getColor(String colorName) throws CloneNotSupportedException {
		Color obj = (Color) colorMap.get(colorName);
		return (Color) obj.clone();

	}
}

public class PrototypeDesignPatternMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		Color obj = ColorStore.getColor("red");
		obj.addColor();
		obj = ColorStore.getColor("blue");
		obj.addColor();
		obj = ColorStore.getColor("blue");
		obj.addColor();

		// ColorStore.getColor("red").addColor();
		// ColorStore.getColor("blue").addColor();
		ColorStore.getColor("red").addColor();
	}
}
