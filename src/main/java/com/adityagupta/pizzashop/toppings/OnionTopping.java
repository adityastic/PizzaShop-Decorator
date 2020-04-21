package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.ToppingDecorator;
import com.adityagupta.pizzashop.base.Pizza;

public class OnionTopping extends ToppingDecorator {

    public OnionTopping(Pizza pizza) {
        super(pizza, 1, "Onion");
    }
}