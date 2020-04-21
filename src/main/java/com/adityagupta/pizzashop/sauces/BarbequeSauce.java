package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Sauce;
import com.adityagupta.pizzashop.decorators.SauceDecorator;

public class BarbequeSauce extends SauceDecorator {

    public BarbequeSauce(Pizza pizza) {
        super(pizza, new Sauce(9, "Hummus"));
    }
}
