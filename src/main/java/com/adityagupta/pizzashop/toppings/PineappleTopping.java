package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Topping;
import com.adityagupta.pizzashop.decorators.ToppingDecorator;

public class PineappleTopping extends ToppingDecorator {

    public PineappleTopping(Pizza pizza) {
        super(pizza, new Topping(3, "Pineapple"));
    }
}
