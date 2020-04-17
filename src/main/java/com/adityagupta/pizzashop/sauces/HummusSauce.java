package com.adityagupta.pizzashop.sauces;

import com.adityagupta.pizzashop.BasePizza;
import com.adityagupta.pizzashop.PizzaDecorator;

public class HummusSauce extends PizzaDecorator {

    int saucePrice = 2;

    public HummusSauce(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + saucePrice;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "\nSauce: Hummus";
    }
}
