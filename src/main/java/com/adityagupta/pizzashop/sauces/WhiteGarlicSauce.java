package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Sauce;
import com.adityagupta.pizzashop.decorators.SauceDecorator;

public class WhiteGarlicSauce extends SauceDecorator {

    public WhiteGarlicSauce(Pizza pizza) {
        super(pizza, new Sauce(8, "White Garlic"));
    }
}
