package com.zelia.observer.observers;

import com.zelia.observer.observable.GPS;

public class LongPositionDisplayer implements Observer {

	// Actualize is called when the GPS's state changes
	@Override
	public void actualize(Object o) {
		// We check that our object is an instance of GPS
		if (o instanceof GPS) {
			GPS g = (GPS) o;
			System.out.println("LPD : Position : " + g.getPosition() + " " + g.getPrecision());
		}
	}

}
