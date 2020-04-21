package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Topping;
import com.adityagupta.pizzashop.decorators.ToppingDecorator;

public class PepperoniTopping extends ToppingDecorator {

    public PepperoniTopping(Pizza pizza) {
        super(pizza, new Topping(4, "Pepperoni"));
    }
}
