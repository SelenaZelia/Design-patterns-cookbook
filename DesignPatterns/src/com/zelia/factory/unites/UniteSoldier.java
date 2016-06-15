package com.zelia.factory.unites;

import com.zelia.factory.AbstractUnite;

/**
 * A soldier human unite
 * @author Alex
 *
 */
public class UniteSoldier extends AbstractUnite{

	public UniteSoldier() {
		name = "Soldier";
	}
	
	@Override
	public void doSomething() {
		System.out.println("Soldier doing smt");
	}

}
