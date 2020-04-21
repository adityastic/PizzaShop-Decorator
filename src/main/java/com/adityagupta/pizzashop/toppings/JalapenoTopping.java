package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.ToppingDecorator;
import com.adityagupta.pizzashop.base.Pizza;

public class JalapenoTopping extends ToppingDecorator {

    public JalapenoTopping(Pizza pizza) {
        super(pizza, 2, "Jalapeno");
    }
}
