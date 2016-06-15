package com.zelia.factory;

import com.zelia.factory.units.UnitType;

/**
 * Abstract class used by every unit building factory
 * @author Alex
 *
 */
public abstract class AbstractBuildingFactory {
	/**
	 * Instantiate a new unit
	 * @param type The type of unit
	 * @return The instantiated unit
	 */
	public final AbstractUnit enrollunit(UnitType type){
		AbstractUnit unit = createunit(type);
		unit.doSomething();
		return unit;
	}
	
	protected abstract AbstractUnit createunit(UnitType type);
}

