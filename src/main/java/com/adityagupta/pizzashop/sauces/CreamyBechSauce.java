package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Sauce;
import com.adityagupta.pizzashop.decorators.PizzaDecorator;

public class CreamyBechSauce extends PizzaDecorator<Sauce> {

    public CreamyBechSauce(Pizza pizza) {
        super(pizza, new Sauce(7, "Creamy Bechamel"));
    }
}
