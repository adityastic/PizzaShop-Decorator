package com.adityagupta.pizzashop.ui.wrappers;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.decorators.PizzaHeadingDecorator;

public class ToppingsWrapper extends PizzaHeadingDecorator {

	public ToppingsWrapper(Pizza pizza) {
		super(pizza, "Toppings");
	}
}
