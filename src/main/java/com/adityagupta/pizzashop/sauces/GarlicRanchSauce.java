package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Sauce;
import com.adityagupta.pizzashop.decorators.SauceDecorator;

public class GarlicRanchSauce extends SauceDecorator {

    public GarlicRanchSauce(Pizza pizza) {
        super(pizza, new Sauce(5, "Garlic Ranch"));
    }
}
