package com.adityagupta.pizzashop.ui.builders;

import java.util.List;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.crusts.PanCrust;
import com.adityagupta.pizzashop.crusts.RegularCrust;
import com.adityagupta.pizzashop.crusts.ThinCrust;
import com.adityagupta.pizzashop.sauces.HummusSauce;
import com.adityagupta.pizzashop.sauces.PestoSauce;
import com.adityagupta.pizzashop.sauces.RegularSauce;
import com.adityagupta.pizzashop.toppings.JalapenoTopping;
import com.adityagupta.pizzashop.toppings.OliveTopping;
import com.adityagupta.pizzashop.toppings.OnionTopping;
import com.adityagupta.pizzashop.toppings.TomatoTopping;

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
