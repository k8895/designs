package com.wjk.test;

public class Tea extends CaffeineBeverage{

	@Override
	protected void brew() {
		System.out.println("泡茶");
	}

	@Override
	protected void addCondiments() {
		System.out.println("加柠檬");
	}

	@Override
	protected boolean isNeedCondiments() {
		return true;
	}
	
}
