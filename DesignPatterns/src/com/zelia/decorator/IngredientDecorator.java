package com.zelia.decorator;

/*
 * The decorator pattern, every ingredients inherit from it
 */
public abstract class IngredientDecorator extends AbstractDessert {
	//Contains the dessert getting decorated
	protected AbstractDessert dessert;

	public abstract String getName();
	public abstract double getPrice(); 
}
