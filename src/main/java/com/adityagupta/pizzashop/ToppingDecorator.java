package com.adityagupta.pizzashop;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Topping;

public abstract class ToppingDecorator implements Pizza {
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
        return pizza.getDescription() + "\nTopping: " + this.topping.getName();
    }
}
