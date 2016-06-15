package com.zelia.factory;

import com.zelia.factory.unites.UniteType;

public abstract class AbstractBuildingFactory {
	public final AbstractUnite enrollUnite(UniteType type){
		AbstractUnite unite = createUnite(type);
		unite.doSomething();
		return unite;
	}
	
	protected abstract AbstractUnite createUnite(UniteType type);
}

