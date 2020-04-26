package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Sauce;
import com.adityagupta.pizzashop.decorators.PizzaDecorator;

public class RegularSauce extends PizzaDecorator<Sauce> {

    public RegularSauce(Pizza pizza) {
        super(pizza, new Sauce(0, "Regular"));
    }
}
