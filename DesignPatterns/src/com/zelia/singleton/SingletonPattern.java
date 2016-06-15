package com.zelia.singleton;

public class SingletonPattern {
	public static void main(String[] args) {
		/*
		 * We got 3 ways to use the singleton design pattern :
		 * 
		 * SimpleSingletonClass : 
		 * ----------------------
		 * 	Easy to use, will instantiate the class only when needed
		 *  but is not thread safe, you should not use this
		 *  (even if your program isn't multithread, it might be when
		 *  it'll get bigger)
		 *  
		 *  ThreadSafeSingleton1 :
		 *  ----------------------
		 *  Instantiate in the beginning of the class, then only 
		 *  return that instantiation. It's a good way to do it,
		 *  but we loose control on the instantiation timing
		 *  
		 *  ThreadSafeSingleton2 :
		 *  ----------------------
		 *  Exactly like the first one, but using "synchronized" keyword,
		 *  which makes it thread safe
		 *  Pros is that you keep the instantiation control
		 *  Cons is that it might slightly affect your performances
		 *  Except if performances are a big aspect of your program, use
		 *  this method, else use the ThreadSafeSingleton1 
		 */
		
		// SimpleSingletonClass : easiest singleton usage
		// <!> Not safe to use with threads (see in class)
		SimpleSingletonClass ssc = SimpleSingletonClass.getInstance();
		ssc.doSomething();
		// Checking if a new instance is created (sysout)
		ssc = SimpleSingletonClass.getInstance();
		ssc.doSomething();
	
		System.out.println();
		
		// ThreadSafeSingleton1
		// Safe to use with threads
		ThreadSafeSingleton1 tss1 = ThreadSafeSingleton1.getInstance();
		tss1.doSomething();
		tss1 = ThreadSafeSingleton1.getInstance();
		tss1.doSomething(); 

		System.out.println();
		
		// ThreadSafeSingleton2
		// Safe to use with threads
		ThreadSafeSingleton2 tss2 = ThreadSafeSingleton2.getInstance();
		tss2.doSomething();
		tss2 = ThreadSafeSingleton2.getInstance();
		tss2.doSomething(); 
		
	}
}
