package com.adityagupta.pizzashop.decorators;

import java.io.Serializable;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Topping;

public abstract class ToppingDecorator implements Pizza, Serializable {
    protected Pizza pizza;
    protected Topping topping;

    public ToppingDecorator(Pizza pizza, Topping topping) {
        this.pizza = pizza;
        this.topping = topping;
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + this.topping.getPrice();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "<br>Topping: " + this.topping.getName();
    }
}
