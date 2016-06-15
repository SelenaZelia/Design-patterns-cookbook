package com.zelia.observer.observable;

import java.util.ArrayList;

import com.zelia.observer.observers.Observer;

/*
 * A GPS observable class
 */
public class GPS implements Observable {
	private String position;
	private int precision;

	// Contains every subscribed observers
	private ArrayList<Observer> observers;

	public GPS() {
		position = "undefined";
		precision = 0;
		observers = new ArrayList<>();
	}

	// Add a new observer that'll be notified when
	// our position changes
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	// Delete an observer from the list
	// This part is important to avoid the 
	// lapsed listener problem, a memory leak and
	// a performance degradation
	@Override
	public void deleteObserver(Observer o) {
		observers.remove(o);
	}

	// Notify every subscribed observers
	@Override
	public void notifyObserver() {
		for (Observer o : observers) {
			o.actualize(this);
		}
	}

	// Set a new position, then notify the observers
	public void setPosition(String position) {
		this.position = position;
		notifyObserver();
	}

	// Set a new precision, then notify the observers
	public void setPrecision(int precision) {
		this.precision = precision;
		notifyObserver();
	}

	// Retrieve the position
	public String getPosition() {
		return position;
	}

	// Retrieve the precision
	public int getPrecision() {
		return precision;
	}
}
