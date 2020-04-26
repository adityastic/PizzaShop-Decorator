package com.adityagupta.pizzashop.data;

import java.io.Serializable;

public class Crust implements Serializable {
    double price;
    String type;

    public Crust() {
    }

    public Crust(double price, String type) {
		this.price = price;
		this.type = type;
	}

	public double getPrice() {
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

	public String getName() {
		return type;
	}
}
