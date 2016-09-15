package com.wjk.test;

public class Singleton1 {

	private static Singleton1 uniqueInstance;
	
	private Singleton1() {

	}
	//多线程使用此方法可能会造成混乱
	public static Singleton1 getInstance(){
		if(uniqueInstance==null){
			uniqueInstance=new Singleton1();
		}
		return uniqueInstance;
	}
	
}
