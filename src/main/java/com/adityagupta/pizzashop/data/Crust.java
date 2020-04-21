package com.adityagupta.pizzashop.data;

import java.io.Serializable;

public class Crust implements Serializable {
    int price;
    String type;

    public Crust() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String name) {
        this.type = name;
    }
}
