package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.SauceDecorator;
import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Sauce;

public class HummusSauce extends SauceDecorator {

    public HummusSauce(Pizza pizza) {
        super(pizza, new Sauce(2, "Hummus"));
    }
}
