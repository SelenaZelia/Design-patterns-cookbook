package com.zelia.factory;

import com.zelia.factory.factories.HumanFactory;
import com.zelia.factory.unites.UniteType;

/*
 * Factory pattern
 */
public class FactoryPattern {
	public static void main(String[] args) {
		HumanFactory hf = new HumanFactory();
		AbstractUnite unite = hf.enrollUnite(UniteType.Soldier); 
		System.out.println(unite.getName());
		AbstractUnite unite2 = hf.enrollUnite(UniteType.Rogue); 
		System.out.println(unite2.getName());
	}
}
