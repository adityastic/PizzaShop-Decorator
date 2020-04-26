package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Topping;
import com.adityagupta.pizzashop.decorators.PizzaDecorator;

public class TomatoTopping extends PizzaDecorator<Topping> {

    public TomatoTopping(Pizza pizza) {
        super(pizza, new Topping(3, "Tomato"));
    }
}