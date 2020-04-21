package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.ToppingDecorator;
import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Topping;

public class TomatoTopping extends ToppingDecorator {

    public TomatoTopping(Pizza pizza) {
        super(pizza, new Topping(3, "Tomato"));
    }
}