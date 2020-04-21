package com.adityagupta.pizzashop;

import com.adityagupta.pizzashop.base.Pizza;

public abstract class SauceDecorator implements Pizza {
    protected Pizza pizza;
    protected int saucePrice;
    private String sauceName;

    public SauceDecorator(Pizza pizza, int saucePrice, String sauceName) {
        this.pizza = pizza;
        this.saucePrice = saucePrice;
        this.sauceName = sauceName;
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + this.saucePrice;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "\nSauce: " + this.sauceName;
    }
}
