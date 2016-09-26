package com.wjk.test;

public class Singleton2 {

	private static Singleton2 uniqueInstance;

	private Singleton2() {

	}

	/**
	 * 使用同步方法，迫使每个线程进入这个方法前，要先等别的线程离开，不会有两个线程同时进入这个方法
	 * 但是只有第一次执行的时候才需要同步，之后每次调用这个方法会降低性能
	 * 
	 * @return
	 */
	public static synchronized Singleton2 getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton2();
		}
		return uniqueInstance;
	}

}
