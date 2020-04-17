package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.BasePizza;
import com.adityagupta.pizzashop.PizzaDecorator;

public class OnionTopping extends PizzaDecorator {

    int toppingPrice = 1;

    public OnionTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + toppingPrice;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "\nTopping: Onion";
    }
}
