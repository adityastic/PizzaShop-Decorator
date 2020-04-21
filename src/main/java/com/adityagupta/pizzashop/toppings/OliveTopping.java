package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Topping;
import com.adityagupta.pizzashop.decorators.ToppingDecorator;

public class OliveTopping extends ToppingDecorator {

    public OliveTopping(Pizza pizza) {
        super(pizza, new Topping(4, "Olive"));
    }
}