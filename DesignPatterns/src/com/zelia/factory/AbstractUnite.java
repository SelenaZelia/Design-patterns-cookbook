package com.zelia.factory;

/**
 * Abstract class used by every unite
 * @author Alex
 *
 */
public abstract class AbstractUnite {
	protected String name;
	
	public String getName(){
		return name;
	}
	
	public abstract void doSomething();
}
