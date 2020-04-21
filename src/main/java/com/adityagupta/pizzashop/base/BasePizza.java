package com.adityagupta.pizzashop.base;

public abstract class BasePizza implements Pizza {
    protected int price;
    protected String crustType;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Crust: " + crustType;
    }
}
