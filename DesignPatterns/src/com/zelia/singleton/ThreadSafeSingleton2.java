package com.zelia.singleton;

/* 
 * Second thread safe way to use a singleton
 */
public class ThreadSafeSingleton2 {
	//Contains the unique instance of the class 
	private static ThreadSafeSingleton2 uniqueInstance;

	private ThreadSafeSingleton2() {}

	//Return the unique instance of the class
	// THREAD SAFE : Synchronized makes sure that 
	// two threads can't use the method at the same time, 
	// which fix our problem in SimpleSingletonClass
	// Only cons is that it might affect performance in some cases
	public synchronized static ThreadSafeSingleton2 getInstance() { 
		if (uniqueInstance == null) {
			uniqueInstance = new ThreadSafeSingleton2();
			System.out.println("ThreadSafeSingleton2 : New instance created.");
		}
		return uniqueInstance;
	}

	// Sysout to try out the class
	public void doSomething() {
		System.out.println("ThreadSafeSingleton2 : Hello world");
	}
}
