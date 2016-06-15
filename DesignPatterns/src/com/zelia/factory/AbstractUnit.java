package com.zelia.factory;

/**
 * Abstract class used by every unit
 * @author Alex
 *
 */
public abstract class AbstractUnit {
	protected String name;
	
	public String getName(){
		return name;
	}
	
	public abstract void doSomething();
}
