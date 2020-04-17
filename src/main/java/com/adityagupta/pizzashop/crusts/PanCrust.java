package com.adityagupta.pizzashop.crusts;

import com.adityagupta.pizzashop.BasePizza;

public class PanCrust extends BasePizza {
    public PanCrust() {
        super(5);
    }

    @Override
    public String getDescription() {
        return "Crust : Pan Crust";
    }
}
