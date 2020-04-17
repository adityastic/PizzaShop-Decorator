package com.adityagupta.pizzashop;

public abstract class BasePizza {
    protected int price;

    public BasePizza(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public abstract String getDescription();
}
