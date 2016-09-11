package com.wjk.test;

import com.wjk.pizzastyle.ChicagoStyleCheesePizza;
import com.wjk.pizzastyle.ChicagoStyleClamPizza;
import com.wjk.pizzastyle.ChicagoStylePepperoniPizza;
import com.wjk.pizzastyle.ChicagoStyleVeggiePizza;
import com.wjk.pizzastyle.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	public Pizza creatPizza(String Type) {
		if(Type.equals("cheese")){
			return new ChicagoStyleCheesePizza();
		}else if(Type.equals("veggie")){
			return new ChicagoStyleVeggiePizza();
		}else if(Type.equals("clam")){
			return new ChicagoStyleClamPizza();
		}else if(Type.equals("pepperoni")){
			return new ChicagoStylePepperoniPizza();
		}
		return null;
	}

}
