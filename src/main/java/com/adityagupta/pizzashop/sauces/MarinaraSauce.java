package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Sauce;
import com.adityagupta.pizzashop.decorators.PizzaDecorator;

public class MarinaraSauce extends PizzaDecorator<Sauce> {

    public MarinaraSauce(Pizza pizza) {
        super(pizza, new Sauce(1, "Marinara"));
    }
}
