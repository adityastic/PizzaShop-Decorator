package com.adityagupta.pizzashop.data;

import java.io.Serializable;

public class Topping extends PizzaComponent implements Serializable {
    int price;
    String name;

    public Topping() {
    }

    public Topping(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
