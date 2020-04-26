package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Sauce;
import com.adityagupta.pizzashop.decorators.PizzaDecorator;

public class HummusSauce extends PizzaDecorator<Sauce> {

    public HummusSauce(Pizza pizza) {
        super(pizza, new Sauce(2, "Hummus"));
    }
}
