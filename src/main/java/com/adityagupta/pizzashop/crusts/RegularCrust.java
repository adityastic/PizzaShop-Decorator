package com.adityagupta.pizzashop.crusts;

import com.adityagupta.pizzashop.BasePizza;

public class RegularCrust extends BasePizza {
    public RegularCrust() {
        super(2);
    }

    @Override
    public String getDescription() {
        return "Crust : Regular Crust";
    }
}
