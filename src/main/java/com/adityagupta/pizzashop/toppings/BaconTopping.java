package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Topping;
import com.adityagupta.pizzashop.decorators.PizzaDecorator;

public class BaconTopping extends PizzaDecorator<Topping> {

    public BaconTopping(Pizza pizza) {
        super(pizza, new Topping(5, "Bacon"));
    }
}
