package com.wjk.test;

import com.wjk.pizzastyle.Pizza;

public abstract class PizzaStore {

	public abstract Pizza creatPizza(String Type);
	
	//���������า��
	public final Pizza orderPizza(String type){
		Pizza pizza;
		
		pizza=creatPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
}
