package com.zelia.singleton;

/* 
 * First thread safe way to use a singleton
 */
public class ThreadSafeSingleton1 {
	//Contains the unique instance of the class
	// THREAD SAFE : we instantiate our member only one time, 
	// in the definition, getInstance is just returning our member
	// The cons is that we loose control on the first instantiation
	private static ThreadSafeSingleton1 uniqueInstance = new ThreadSafeSingleton1();

	private ThreadSafeSingleton1() {}

	//Return the unique instance of the class 
	public static ThreadSafeSingleton1 getInstance() { 
		return uniqueInstance;
	}

	// Sysout to try out the class
	public void doSomething() {
		System.out.println("ThreadSafeSingleton1 : Hello world");
	}
}
