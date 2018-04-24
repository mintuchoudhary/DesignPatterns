package com.structural.fascade;

class Both extends Menus {

}

public class VegNonBothRestaurant {

	public Menus getMenus() {
		Both b = new Both();
		return b;
	}
}
