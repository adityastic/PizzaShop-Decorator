package com.adityagupta.pizzashop.decorators;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Sauce;

import java.io.Serializable;

public abstract class SauceDecorator implements Pizza, Serializable {
    protected Pizza pizza;
    protected Sauce sauce;

    public SauceDecorator(Pizza pizza, Sauce sauce) {
        this.pizza = pizza;
        this.sauce = sauce;
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + this.sauce.getPrice();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "	Sauce: " + this.sauce.getName() + "<br>";
    }
}
