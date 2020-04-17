package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.BasePizza;
import com.adityagupta.pizzashop.PizzaDecorator;

public class RegularSauce extends PizzaDecorator {

    int saucePrice = 0;

    public RegularSauce(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + saucePrice;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "\nSauce: Regular";
    }
}
