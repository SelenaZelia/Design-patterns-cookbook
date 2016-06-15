package com.zelia.observer;

import com.zelia.observer.observable.GPS;
import com.zelia.observer.observers.LongPositionDisplayer;
import com.zelia.observer.observers.ShortPositionDisplayer;

/*
 * The observer pattern is used for event handling
 * An object (observable) notifies a list of observers when
 * an event happens (usually data change, input from user, ...)
 * Note that this pattern is the core of the MVC 
 * (model view controller) pattern.
 */
public class ObserverPattern {
	// For our example, we'll use a GPS system,
	// firing the event to two displays 
	public static void main(String[] args) {
		// We instantiate our observable (GPS)
		GPS g = new GPS();
		
		// We instantiate 2 observers (SPD & LPD)
		ShortPositionDisplayer spd = new ShortPositionDisplayer();
		LongPositionDisplayer lpd = new LongPositionDisplayer();
		
		// We subscribe our observers to the GPS
		g.addObserver(spd);
		g.addObserver(lpd);
		
		// When changing our observable state,
		// the observers get notified
		System.out.println("\nChanging position");
		g.setPosition("N 39°59°993 / W 123°00°000");
		System.out.println("\nChanging Precision");
		g.setPrecision(59);
		System.out.println("\nChanging position");
		g.setPosition("N 39°59°903 / W 120°00°000");
		
		// We can delete an observer from our observable list
		g.deleteObserver(spd);
		System.out.println("\nShort Position Displayer removed");
		g.setPrecision(42); 
	}
}
