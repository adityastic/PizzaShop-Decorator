package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.SauceDecorator;
import com.adityagupta.pizzashop.base.Pizza;

public class PestoSauce extends SauceDecorator {

    public PestoSauce(Pizza pizza) {
        super(pizza, 1, "Pesto");
    }
}
