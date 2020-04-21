package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Sauce;
import com.adityagupta.pizzashop.decorators.SauceDecorator;

public class HummusSauce extends SauceDecorator {

    public HummusSauce(Pizza pizza) {
        super(pizza, new Sauce(2, "Hummus"));
    }
}
