package com.zelia.decorator;

/*
 * The decorator pattern is useful to add functionalities (decorate)
 * objects, without editing the class itself.
 * Useful to add special behavior to an object without impacting 
 * the class ( and objects created from that class)
 * 
 * The pattern is illustrated with the typical Dessert,
 * it shows how easy it is to add new functionalities (ingredients 
 * in our case)
 */
public class DecoratorPattern {

	public static void main(String[] args) {
		//Create the base dessert
		AbstractDessert icecream = new Icecream();
		System.out.println(icecream);
		
		//Decorate  with the chocolate ingredient
		icecream = new Chocolate(icecream);
		System.out.println(icecream);
		
		//Decorate with the strawberry ingredient
		icecream = new Strawberry(icecream);
		System.out.println(icecream);
		
		//You can stack your decorator, since
		//the decorator extends AbstractDessert
		AbstractDessert pancake = new Pancake();
		pancake = new Strawberry(new Chocolate(pancake));
		System.out.println(pancake);
	}

}
