package com.adityagupta.pizzashop.base;

import com.adityagupta.pizzashop.data.Crust;

import java.io.Serializable;

public abstract class BasePizza implements Pizza, Serializable {
    protected Crust crust;

    public BasePizza() {
        this.crust = new Crust();
    }

    public void setCrustType(String crustType) {
        this.crust.setType(crustType);
    }

    @Override
    public double getPrice() {
        return this.crust.getPrice();
    }

    public void setPrice(int price) {
        this.crust.setPrice(price);
    }

    @Override
    public String getDescription() {
        return "<br>Pizza Crust: " + this.crust.getType() + "<br>";
    }
}
