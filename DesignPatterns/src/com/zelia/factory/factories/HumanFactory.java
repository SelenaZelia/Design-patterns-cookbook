package com.zelia.factory.factories;

import com.zelia.factory.AbstractBuildingFactory;
import com.zelia.factory.AbstractUnite;
import com.zelia.factory.unites.UniteRogue;
import com.zelia.factory.unites.UniteSoldier;
import com.zelia.factory.unites.UniteType;

public class HumanFactory extends AbstractBuildingFactory {
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
