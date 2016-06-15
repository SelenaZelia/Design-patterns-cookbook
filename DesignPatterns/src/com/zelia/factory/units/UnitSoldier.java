package com.zelia.factory.units;

import com.zelia.factory.AbstractUnit;

/**
 * A soldier human unit
 * @author Alex
 *
 */
public class UnitSoldier extends AbstractUnit{

	public UnitSoldier() {
		name = "Soldier";
	}
	
	@Override
	public void doSomething() {
		System.out.println("Soldier doing smt");
	}

}
