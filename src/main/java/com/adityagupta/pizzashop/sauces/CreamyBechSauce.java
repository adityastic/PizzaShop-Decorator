package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Sauce;
import com.adityagupta.pizzashop.decorators.SauceDecorator;

public class CreamyBechSauce extends SauceDecorator {

    public CreamyBechSauce(Pizza pizza) {
        super(pizza, new Sauce(7, "Creamy Bechamel"));
    }
}
