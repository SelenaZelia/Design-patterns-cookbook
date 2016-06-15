package com.zelia.factory;

import com.zelia.factory.factories.HumanFactory;
import com.zelia.factory.units.UnitType;
 
/*
 * Factory pattern :
 * -----------------
 * Define an interface for creating an object, 
 * but let subclasses decide which class to 
 * instantiate. The Factory method lets a 
 * class defer instantiation it uses to 
 * subclasses.
 * 
 * > Every unit inherits from AbstractUnit
 * > Every factory inherits from AbstractBuildingFactory
 * > To add a new unit :
 *   - Add a 'name' in the UnitType enum
 *   - Create a new unitX class, extending AbstractUnit
 *   - Add the instanciation in an existing factory (like HumanFactory)
 *     or create a new factory extending AbstractBuildingFactory
 */
public class FactoryPattern {
	public static void main(String[] args) {
		HumanFactory hf = new HumanFactory();
		
		AbstractUnit unit = hf.enrollunit(UnitType.Soldier);
		System.out.println(unit.getName());
		
		AbstractUnit unit2 = hf.enrollunit(UnitType.Rogue);
		System.out.println(unit2.getName());
	}
}
