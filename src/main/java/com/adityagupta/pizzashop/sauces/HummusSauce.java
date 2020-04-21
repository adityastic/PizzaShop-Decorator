package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.SauceDecorator;
import com.adityagupta.pizzashop.base.Pizza;

public class HummusSauce extends SauceDecorator {

    public HummusSauce(Pizza pizza) {
        super(pizza, 2, "Hummus");
    }
}
