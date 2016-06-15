package com.zelia.factory.factories;

import com.zelia.factory.AbstractBuildingFactory;
import com.zelia.factory.AbstractUnit;
import com.zelia.factory.units.UnitRogue;
import com.zelia.factory.units.UnitSoldier;
import com.zelia.factory.units.UnitType;

/**
 * A human factory
 * @author Alex
 *
 */
public class HumanFactory extends AbstractBuildingFactory {
	/**
	 * Creates a new human unit (used in "enrollunit")
	 */
	@Override
	protected AbstractUnit createunit(UnitType type){
		AbstractUnit unit = null;
		
		switch(type){
		case Soldier: unit = new UnitSoldier();break;
		case Rogue  : unit = new UnitRogue();break;
		}
		
		return unit;
	}
}
