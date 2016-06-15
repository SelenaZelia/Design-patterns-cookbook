package com.zelia.factory.unites;

import com.zelia.factory.AbstractUnite;

/**
 * A rogue human unite
 * @author Alex 
 *
 */
public class UniteRogue extends AbstractUnite{

	public UniteRogue() {
		name = "Rogue";
	}
	
	@Override
	public void doSomething() {
		System.out.println("Rogue doing smt");
	}

}
