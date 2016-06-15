package com.zelia.decorator.ingredients;

import com.zelia.decorator.AbstractDessert;
import com.zelia.decorator.IngredientDecorator;

/*
 * Strawberry ingredient
 */
public class Strawberry extends IngredientDecorator {
	public Strawberry(AbstractDessert d){
		dessert = d;
	}
	
	@Override
	public String getName() {
		return dessert.getName() + ", strawberry";
	}

	@Override
	public double getPrice() {
		return dessert.getPrice() + 0.50;
	}

}
