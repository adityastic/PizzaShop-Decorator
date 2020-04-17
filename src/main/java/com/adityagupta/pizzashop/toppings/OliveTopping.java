package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.BasePizza;
import com.adityagupta.pizzashop.PizzaDecorator;

public class OliveTopping extends PizzaDecorator {

    int toppingPrice = 4;

    public OliveTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + toppingPrice;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "\nTopping: Olive";
    }
}
