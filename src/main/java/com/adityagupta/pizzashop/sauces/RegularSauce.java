package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.SauceDecorator;
import com.adityagupta.pizzashop.base.Pizza;

public class RegularSauce extends SauceDecorator {

    public RegularSauce(Pizza pizza) {
        super(pizza, 0, "Regular");
    }
}
