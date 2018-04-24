package com.structural.fascade;


/* Facade provide a wrapper interface on top of the existing interface to help client application. 
 * It hides the complexities of the system and provides an interface to the client from where the client can access the system.
 * */
 
public class FascadeMain {
	public static void main(String[] args) {
		HotelKeeper keeper = new HotelKeeper();

		VegMenu v = keeper.getVegMenu();
		NonVegMenu nv = keeper.getNonVegMenu();
		Both both = keeper.getVegNonMenu();
		
		System.out.println(v);
		System.out.println(nv);
		System.out.println(keeper);

	}
}
