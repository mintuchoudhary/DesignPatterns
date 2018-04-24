package com.structural.fascade;

class VegMenu extends Menus {

}

public class VegRestaurant implements Hotel {

	public Menus getMenus() {

		VegMenu v = new VegMenu();
		return v;
	}
}