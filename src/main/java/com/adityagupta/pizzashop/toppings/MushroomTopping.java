package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Topping;
import com.adityagupta.pizzashop.decorators.PizzaDecorator;

public class MushroomTopping extends PizzaDecorator<Topping> {

    public MushroomTopping(Pizza pizza) {
        super(pizza, new Topping(2, "Mushroom"));
    }
}
