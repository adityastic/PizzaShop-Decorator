package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Sauce;
import com.adityagupta.pizzashop.decorators.PizzaDecorator;

public class PestoSauce extends PizzaDecorator<Sauce> {

    public PestoSauce(Pizza pizza) {
        super(pizza, new Sauce(1, "Pesto"));
    }
}
