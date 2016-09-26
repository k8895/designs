package com.wjk.test;

public abstract class CaffeineBeverage {

	// 模板方法
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (isNeedCondiments()) {
			addCondiments();
		}
	}

	protected void boilWater() {
		System.out.println("烧开水");
	}

	protected abstract void brew();

	protected void pourInCup() {
		System.out.println("倒入杯中");
	}

	protected abstract void addCondiments();

	//钩子，由子类重写可控制流程
	protected boolean isNeedCondiments() {
		return true;
	}

}
