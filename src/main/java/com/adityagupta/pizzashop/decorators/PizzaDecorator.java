package com.adityagupta.pizzashop.decorators;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.data.PizzaComponent;
import com.adityagupta.pizzashop.utils.OfferUtils;

import java.io.Serializable;

public abstract class PizzaDecorator<T extends PizzaComponent> implements Pizza, Serializable {
    protected Pizza pizza;
    protected T component;

    public PizzaDecorator(Pizza pizza, T component) {
        this.pizza = pizza;
        this.component = component;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 
        		((OfferUtils.getOffer() > 0)
        				? (component.getPrice() - (component.getPrice() * ((double)OfferUtils.getOffer() / 100))) 
        				: component.getPrice());
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + 
        		"	" +
        		this.component.getName() +
        		" : " +
        		((OfferUtils.getOffer() > 0)
        				? (component.getPrice() - (component.getPrice() * ((double)OfferUtils.getOffer() / 100))) 
        				: component.getPrice()) +
        		"<br>";
    }
}
