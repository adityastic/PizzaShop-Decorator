package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.ToppingDecorator;
import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Topping;

public class OliveTopping extends ToppingDecorator {

    public OliveTopping(Pizza pizza) {
        super(pizza, new Topping(4, "Olive"));
    }
}