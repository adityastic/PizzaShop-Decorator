package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Sauce;
import com.adityagupta.pizzashop.decorators.PizzaDecorator;

public class GarlicRanchSauce extends PizzaDecorator<Sauce> {

    public GarlicRanchSauce(Pizza pizza) {
        super(pizza, new Sauce(5, "Garlic Ranch"));
    }
}
