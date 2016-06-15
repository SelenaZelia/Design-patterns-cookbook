package com.zelia.factory.factories;

import com.zelia.factory.AbstractBuildingFactory;
import com.zelia.factory.AbstractUnite;
import com.zelia.factory.unites.UniteRogue;
import com.zelia.factory.unites.UniteSoldier;
import com.zelia.factory.unites.UniteType;

/**
 * A human factory
 * @author Alex
 *
 */
public class HumanFactory extends AbstractBuildingFactory {
	/**
	 * Creates a new human unite (used in "enrollUnite")
	 */
	@Override
	protected AbstractUnite createUnite(UniteType type){
		AbstractUnite unite = null;
		
		switch(type){
		case Soldier: unite = new UniteSoldier();break;
		case Rogue  : unite = new UniteRogue();break;
		}
		
		return unite;
	}
}
