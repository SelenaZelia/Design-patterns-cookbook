package com.zelia.singleton;

/* 
 * Easiest way to use the singleton design pattern
 * Will not be safe to use with threads (see the others classes for 
 * thread safe code) :
 * If thread 1 check that uniqueInstance is null, while thread 2 instantiate
 * unique instance, you'll end up with two instances of uniqueInstance
 */
public class SimpleSingletonClass {
	//Contains the unique instance of the class
	private static SimpleSingletonClass uniqueInstance;

	//We make sure that the default constructor is overriden with
	//an empty one, this way you can't instantiate with "new"
	private SimpleSingletonClass() {}

	//Return the unique instance of the class, if not already
	// instantiated, instantiate uniqueInstance
	public static SimpleSingletonClass getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SimpleSingletonClass();
			System.out.println("SimpleSingletonClass : New instance created.");
		}
		return uniqueInstance;
	}

	// Sysout to try out the class
	public void doSomething() {
		System.out.println("SimpleSingletonClass : Hello world");
	}
}
