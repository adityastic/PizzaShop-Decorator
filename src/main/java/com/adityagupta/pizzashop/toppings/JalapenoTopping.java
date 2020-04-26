package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Topping;
import com.adityagupta.pizzashop.decorators.PizzaDecorator;

public class JalapenoTopping extends PizzaDecorator<Topping> {

    public JalapenoTopping(Pizza pizza) {
        super(pizza, new Topping(2, "Jalapeno"));
    }
}
