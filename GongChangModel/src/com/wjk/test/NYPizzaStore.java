package com.wjk.test;

import com.wjk.pizzastyle.NYStyleCheesePizza;
import com.wjk.pizzastyle.NYStyleClamPizza;
import com.wjk.pizzastyle.NYStylePepperoniPizza;
import com.wjk.pizzastyle.NYStyleVeggiePizza;
import com.wjk.pizzastyle.Pizza;

public class NYPizzaStore extends PizzaStore{

	@Override
	public Pizza creatPizza(String Type) {
		if(Type.equals("cheese")){
			return new NYStyleCheesePizza();
		}else if(Type.equals("veggie")){
			return new NYStyleVeggiePizza();
		}else if(Type.equals("clam")){
			return new NYStyleClamPizza();
		}else if(Type.equals("pepperoni")){
			return new NYStylePepperoniPizza();
		}
		return null;
	}

}
