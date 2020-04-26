package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Topping;
import com.adityagupta.pizzashop.decorators.PizzaDecorator;

public class OliveTopping extends PizzaDecorator<Topping> {

    public OliveTopping(Pizza pizza) {
        super(pizza, new Topping(4, "Olive"));
    }
}