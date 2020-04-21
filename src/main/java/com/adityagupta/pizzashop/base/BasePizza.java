package com.adityagupta.pizzashop.base;

import com.adityagupta.pizzashop.data.Crust;

public abstract class BasePizza implements Pizza {
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
