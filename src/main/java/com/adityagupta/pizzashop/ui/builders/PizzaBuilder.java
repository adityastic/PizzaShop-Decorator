package com.adityagupta.pizzashop.ui.builders;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.crusts.*;
import com.adityagupta.pizzashop.sauces.*;
import com.adityagupta.pizzashop.toppings.*;

import java.util.List;

public class PizzaBuilder {

    public Pizza pizza;


    public PizzaBuilder buildWithCrust(String selectedCrust) {
        switch (selectedCrust) {
            case "Pan Crust":
                this.pizza = new PanCrust();
                break;
            case "Thin Crust":
                this.pizza = new ThinCrust();
                break;
            case "Cast Iron":
                this.pizza = new CastIron();
                break;
            case "Flat Bread":
                this.pizza = new Flatbread();
                break;
            case "Grilled":
                this.pizza = new Grilled();
                break;
            case "New York":
                this.pizza = new NewYork();
                break;
            case "New England":
                this.pizza = new NewEngland();
                break;
            case "Stuffed":
                this.pizza = new Stuffed();
                break;
            default:
                this.pizza = new RegularCrust();
                break;
        }
        return this;
    }

    public PizzaBuilder buildWithSauce(String selectedSauce) {
        switch (selectedSauce) {
            case "Hummus":
                this.pizza = new HummusSauce(this.pizza);
                break;
            case "Regular":
                this.pizza = new RegularSauce(this.pizza);
                break;
            case "Barbeque":
                this.pizza = new BarbequeSauce(this.pizza);
                break;
            case "Buffalo":
                this.pizza = new BuffaloSauce(this.pizza);
                break;
            case "Creamy Bechamel":
                this.pizza = new CreamyBechSauce(this.pizza);
                break;
            case "Garlic Ranch":
                this.pizza = new GarlicRanchSauce(this.pizza);
                break;
            case "Marinara":
                this.pizza = new MarinaraSauce(this.pizza);
                break;
            case "White Garlic":
                this.pizza = new WhiteGarlicSauce(this.pizza);
                break;
            default:
                this.pizza = new PestoSauce(this.pizza);
                break;
        }
        return this;
    }

    public PizzaBuilder buildWithToppings(List<String> selectedToppings) {
        for (String topping : selectedToppings) {
            switch (topping) {
                case "Jalapeno":
                    this.pizza = new JalapenoTopping(this.pizza);
                    break;
                case "Olive":
                    this.pizza = new OliveTopping(this.pizza);
                    break;
                case "Onion":
                    this.pizza = new OnionTopping(this.pizza);
                    break;
                case "Bacon":
                    this.pizza = new BaconTopping(this.pizza);
                    break;
                case "Mushroom":
                    this.pizza = new MushroomTopping(this.pizza);
                    break;
                case "Pepperoni":
                    this.pizza = new PepperoniTopping(this.pizza);
                    break;
                case "Pineapple":
                    this.pizza = new PineappleTopping(this.pizza);
                    break;
                case "Sausage":
                    this.pizza = new SausageTopping(this.pizza);
                    break;
                case "Spinach":
                    this.pizza = new SpinachTopping(this.pizza);
                    break;
                default:
                    this.pizza = new TomatoTopping(this.pizza);
                    break;
            }
        }
        return this;
    }

    public Pizza build() {
        return this.pizza;
    }
}
