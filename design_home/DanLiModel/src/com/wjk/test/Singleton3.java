package com.wjk.test;

public class Singleton3 {
	
	/**
	 * 急切创建实例，保证了线程安全
	 * 依赖JVM在加载这个类时马上创建了此唯一单例
	 * JVM保证任何线程访问uniqueInstance钱，一定先创建此实例
	 * 在程序总是创建并使用单例，或者在创建和运行时负担不太繁重的情况时可以使用
	 */
	private static Singleton3 uniqueInstance=new Singleton3();

	private Singleton3() {

	}

	public static synchronized Singleton3 getInstance() {
		
		return uniqueInstance;
	}

}
