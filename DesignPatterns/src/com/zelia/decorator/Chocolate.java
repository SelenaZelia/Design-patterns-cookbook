package com.zelia.decorator;

/*
 * A chocolate decorator
 */
public class Chocolate extends IngredientDecorator {

	public Chocolate(AbstractDessert d){
		dessert = d;
	}
	
	@Override
	public String getName() {
		return dessert.getName() + ", chocolate";
	}

	@Override
	public double getPrice() {
		return dessert.getPrice() + 0.20;
	}

}
