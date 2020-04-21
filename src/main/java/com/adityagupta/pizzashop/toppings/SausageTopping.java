package com.adityagupta.pizzashop.toppings;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.Topping;
import com.adityagupta.pizzashop.decorators.ToppingDecorator;

public class SausageTopping extends ToppingDecorator {

    public SausageTopping(Pizza pizza) {
        super(pizza, new Topping(6, "Sausage"));
    }
}
