package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Topping;
import com.adityagupta.pizzashop.decorators.PizzaDecorator;

public class PineappleTopping extends PizzaDecorator<Topping> {

    public PineappleTopping(Pizza pizza) {
        super(pizza, new Topping(3, "Pineapple"));
    }
}
