package com.wjk.test;

public class Coffee extends CaffeineBeverage{

	@Override
	protected void brew() {
		System.out.println("泡咖啡");
	}

	@Override
	protected void addCondiments() {
		System.out.println("加糖和奶");
	}
	
	@Override
	protected boolean isNeedCondiments() {
		return false;
	}
	
}
