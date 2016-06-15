package com.zelia.observer.observers;

/*
 * The observer interface
 */
public interface Observer {
	// Called when the observable's state changes
	public void actualize(Object o);
}