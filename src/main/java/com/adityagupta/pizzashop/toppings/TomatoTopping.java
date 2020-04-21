package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.ToppingDecorator;
import com.adityagupta.pizzashop.base.Pizza;

public class TomatoTopping extends ToppingDecorator {

    public TomatoTopping(Pizza pizza) {
        super(pizza, 3, "Tomato");
    }
}