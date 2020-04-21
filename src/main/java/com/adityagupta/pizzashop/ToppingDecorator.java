package com.adityagupta.pizzashop;

import com.adityagupta.pizzashop.base.Pizza;

public abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza;
    protected int toppingPrice;
    private String toppingName;

    public ToppingDecorator(Pizza pizza, int toppingPrice, String toppingName) {
        this.pizza = pizza;
        this.toppingPrice = toppingPrice;
        this.toppingName = toppingName;
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + this.toppingPrice;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "\nTopping: " + this.toppingName;
    }
}
