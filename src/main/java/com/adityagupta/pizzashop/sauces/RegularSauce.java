package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.SauceDecorator;
import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Sauce;

public class RegularSauce extends SauceDecorator {

    public RegularSauce(Pizza pizza) {
        super(pizza, new Sauce(0, "Regular"));
    }
}
