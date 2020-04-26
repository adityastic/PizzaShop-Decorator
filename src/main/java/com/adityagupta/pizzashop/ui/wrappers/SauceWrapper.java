package com.adityagupta.pizzashop.ui.wrappers;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.decorators.PizzaHeadingDecorator;

public class SauceWrapper extends PizzaHeadingDecorator {

	public SauceWrapper(Pizza pizza) {
		super(pizza, "Sauce");
	}
}
