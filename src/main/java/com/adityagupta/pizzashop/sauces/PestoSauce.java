package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Sauce;
import com.adityagupta.pizzashop.decorators.SauceDecorator;

public class PestoSauce extends SauceDecorator {

    public PestoSauce(Pizza pizza) {
        super(pizza, new Sauce(1, "Pesto"));
    }
}
