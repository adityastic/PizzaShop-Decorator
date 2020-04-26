package com.adityagupta.pizzashop.data;

import java.io.Serializable;

public class Sauce extends PizzaComponent implements Serializable {
    double saucePrice;
    String name;

    public Sauce() {
    }

    public Sauce(int price, String name) {
        this.saucePrice = price;
        this.name = name;
    }

    public double getPrice() {
        return saucePrice;
    }

    public void setPrice(int price) {
        this.saucePrice = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
