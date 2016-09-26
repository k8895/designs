package com.wjk.test;

public class Singleton4 {

	/**
	 * volatile
	 */
	private volatile static Singleton4 uniqueInstance;

	private Singleton4() {

	}

	/**
	 * 双重检查
	 * 先检查是否已经创建实例，未创建在进入同步，这样保证了只有第一次才会同步
	 * @return
	 */
	public static Singleton4 getInstance() {
		if (uniqueInstance == null) {
			synchronized(Singleton4.class){
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton4();
				}
			}
		}
		return uniqueInstance;
	}

}
