package com.zelia.decorator;

import java.text.NumberFormat;

/*
 * Abstract dessert used by desserts AND ingredients
 */
public abstract class AbstractDessert {
	private String name;
	private double price;
	
	public String getName(){
		return name;
	}
	
	public double getPrice(){
		return price;
	}
	
	protected void setName(String name){
		this.name = name;
	}
	
	protected void setPrice(double price){
		this.price = price;
	}
	
	@Override
	public String toString(){
		// v Singleton pattern ;) v
		NumberFormat format = NumberFormat.getInstance();
		format.setMinimumFractionDigits(2);
		return getName() + " : " + format.format(getPrice() )+ "€";
	}
}
