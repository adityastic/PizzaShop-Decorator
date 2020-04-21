package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Topping;
import com.adityagupta.pizzashop.decorators.ToppingDecorator;

public class OnionTopping extends ToppingDecorator {

    public OnionTopping(Pizza pizza) {
        super(pizza, new Topping(1, "Onion"));
    }
}