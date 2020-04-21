package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.ToppingDecorator;
import com.adityagupta.pizzashop.base.Pizza;

public class OliveTopping extends ToppingDecorator {

    public OliveTopping(Pizza pizza) {
        super(pizza, 4, "Olive");
    }
}