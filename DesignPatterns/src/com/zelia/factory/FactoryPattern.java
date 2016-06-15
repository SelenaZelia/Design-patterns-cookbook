package com.zelia.factory;

import com.zelia.factory.factories.HumanFactory;
import com.zelia.factory.unites.UniteType;

/*
 * Factory pattern :
 * -----------------
 * Define an interface for creating an object, 
 * but let subclasses decide which class to 
 * instantiate. The Factory method lets a 
 * class defer instantiation it uses to 
 * subclasses.
 * 
 * > Every unit inherits from AbstractUnite
 * > Every factory inherits from AbstractBuildingFactory
 * > To add a new unite :
 *   - Add a 'name' in the UniteType enum
 *   - Create a new UniteX class, extending AbstractUnite
 *   - Add the instanciation in an existing factory (like HumanFactory)
 *     or create a new factory extending AbstractBuildingFactory
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
