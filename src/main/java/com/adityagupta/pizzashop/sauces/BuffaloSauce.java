package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Sauce;
import com.adityagupta.pizzashop.decorators.SauceDecorator;

public class BuffaloSauce extends SauceDecorator {

    public BuffaloSauce(Pizza pizza) {
        super(pizza, new Sauce(4, "Buffalo"));
    }
}
