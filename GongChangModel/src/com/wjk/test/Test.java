package com.wjk.test;

import com.wjk.pizzastyle.Pizza;

public class Test {
	public static void main(String[] args) {

		PizzaStore nyStore=new NYPizzaStore();
		PizzaStore chicagoStore=new ChicagoPizzaStore();
		
		Pizza pizza;
		pizza=nyStore.orderPizza("cheese");
		System.out.println("1∂©π∫¡À£∫"+pizza.getName());
		
		pizza=chicagoStore.orderPizza("cheese");
		System.out.println("2∂©π∫¡À£∫"+pizza.getName());
		
	}
}
