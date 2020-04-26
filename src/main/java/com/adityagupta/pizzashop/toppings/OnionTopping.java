package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Topping;
import com.adityagupta.pizzashop.decorators.PizzaDecorator;

public class OnionTopping extends PizzaDecorator<Topping> {

    public OnionTopping(Pizza pizza) {
        super(pizza, new Topping(1, "Onion"));
    }
}