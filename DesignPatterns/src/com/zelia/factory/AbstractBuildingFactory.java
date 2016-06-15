package com.zelia.factory;

import com.zelia.factory.unites.UniteType;

/**
 * Abstract class used by every unite building factory
 * @author Alex
 *
 */
public abstract class AbstractBuildingFactory {
	/**
	 * Instantiate a new unite
	 * @param type The type of unite
	 * @return The instantiated unite
	 */
	public final AbstractUnite enrollUnite(UniteType type){
		AbstractUnite unite = createUnite(type);
		unite.doSomething();
		return unite;
	}
	
	protected abstract AbstractUnite createUnite(UniteType type);
}

