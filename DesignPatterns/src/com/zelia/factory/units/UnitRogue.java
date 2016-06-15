package com.zelia.factory.units;

import com.zelia.factory.AbstractUnit;

/**
 * A rogue human unit
 * @author Alex 
 *
 */
public class UnitRogue extends AbstractUnit{

	public UnitRogue() {
		name = "Rogue";
	}
	
	@Override
	public void doSomething() {
		System.out.println("Rogue doing smt");
	}

}
