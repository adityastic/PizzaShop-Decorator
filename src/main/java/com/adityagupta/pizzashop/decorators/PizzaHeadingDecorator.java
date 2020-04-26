package com.adityagupta.pizzashop.decorators;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.PizzaComponent;
import com.adityagupta.pizzashop.utils.OfferUtils;

import java.io.Serializable;

public abstract class PizzaHeadingDecorator implements Pizza, Serializable {
    protected Pizza pizza;
    protected String heading;

    public PizzaHeadingDecorator(Pizza pizza, String heading) {
        this.pizza = pizza;
        this.heading = heading;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "<br>" + heading + ":<br>";
    }
}
