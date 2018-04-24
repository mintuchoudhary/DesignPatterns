package com.structural.fascade;

class NonVegMenu extends Menus {

}

public class NonVegRestaurant implements Hotel {

	public Menus getMenus() {
		NonVegMenu nv = new NonVegMenu();
		return nv;
	}
}