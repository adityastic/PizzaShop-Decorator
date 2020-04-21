package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.SauceDecorator;
import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Sauce;

public class PestoSauce extends SauceDecorator {

    public PestoSauce(Pizza pizza) {
        super(pizza, new Sauce(1, "Pesto"));
    }
}
