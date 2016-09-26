package com.wjk.pizzastyle;


public class ChicagoStyleCheesePizza extends Pizza{

	public ChicagoStyleCheesePizza() {
		name="Chicago style deep dish cheese pizza";
		dough="Extra Thick Crust Dough";
		sauce="Plum Tomato Sauce";
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	@Override
	public void cut() {
		System.out.println("ÇÐ³É·½µÄ...");
	}
	
}
