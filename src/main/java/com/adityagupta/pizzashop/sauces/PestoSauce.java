package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.BasePizza;
import com.adityagupta.pizzashop.PizzaDecorator;

public class PestoSauce extends PizzaDecorator {

    int saucePrice = 1;

    public PestoSauce(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + saucePrice;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "\nSauce: Pesto";
    }
}
