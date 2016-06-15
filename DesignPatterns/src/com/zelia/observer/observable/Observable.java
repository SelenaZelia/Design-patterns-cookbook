package com.zelia.observer.observable;

import com.zelia.observer.observers.Observer;

/*
 * The observable interface
 */
public interface Observable {
	// Add/Subscribe an observer
	public void addObserver(Observer o);
	// Delete/Unsubscribe an observer
	public void deleteObserver(Observer o);
	//  Notify every observers that the state changed
	public void notifyObserver();
}
