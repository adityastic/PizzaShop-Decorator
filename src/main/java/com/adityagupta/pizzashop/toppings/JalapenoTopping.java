package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Topping;
import com.adityagupta.pizzashop.decorators.ToppingDecorator;

public class JalapenoTopping extends ToppingDecorator {

    public JalapenoTopping(Pizza pizza) {
        super(pizza, new Topping(2, "Jalapeno"));
    }
}
