package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Topping;
import com.adityagupta.pizzashop.decorators.ToppingDecorator;

public class TomatoTopping extends ToppingDecorator {

    public TomatoTopping(Pizza pizza) {
        super(pizza, new Topping(3, "Tomato"));
    }
}