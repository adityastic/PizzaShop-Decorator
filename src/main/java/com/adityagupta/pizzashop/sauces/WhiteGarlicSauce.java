package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Sauce;
import com.adityagupta.pizzashop.decorators.PizzaDecorator;

public class WhiteGarlicSauce extends PizzaDecorator<Sauce> {

    public WhiteGarlicSauce(Pizza pizza) {
        super(pizza, new Sauce(8, "White Garlic"));
    }
}
