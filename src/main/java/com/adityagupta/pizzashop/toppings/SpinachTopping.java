package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Topping;
import com.adityagupta.pizzashop.decorators.PizzaDecorator;

public class SpinachTopping extends PizzaDecorator<Topping> {

    public SpinachTopping(Pizza pizza) {
        super(pizza, new Topping(5, "Spinach"));
    }
}
