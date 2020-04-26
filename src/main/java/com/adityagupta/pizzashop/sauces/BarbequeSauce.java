package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Sauce;
import com.adityagupta.pizzashop.decorators.PizzaDecorator;

public class BarbequeSauce extends PizzaDecorator<Sauce> {

    public BarbequeSauce(Pizza pizza) {
        super(pizza, new Sauce(9, "Hummus"));
    }
}
