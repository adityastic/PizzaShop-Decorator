package com.adityagupta.pizzashop;

public abstract class PizzaDecorator extends BasePizza {
    protected BasePizza pizza;

    public PizzaDecorator(BasePizza pizza) {
        super(pizza.price);
        this.pizza = pizza;
    }

    public abstract int getPrice();
}
