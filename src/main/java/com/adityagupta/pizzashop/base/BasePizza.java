package com.adityagupta.pizzashop.base;

import com.adityagupta.pizzashop.data.Crust;

import java.io.Serializable;

public abstract class BasePizza implements Pizza, Serializable {
    protected Crust crust;

    public BasePizza() {
        this.crust = new Crust();
    }

    public void setPrice(int price) {
        this.crust.setPrice(price);
    }

    public void setCrustType(String crustType) {
        this.crust.setType(crustType);
    }

    @Override
    public int getPrice() {
        return this.crust.getPrice();
    }

    @Override
    public String getDescription() {
        return "Crust: " + this.crust.getType();
    }
}
