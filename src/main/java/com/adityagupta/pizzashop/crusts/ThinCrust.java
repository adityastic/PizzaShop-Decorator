package com.adityagupta.pizzashop.crusts;

import com.adityagupta.pizzashop.BasePizza;

public class ThinCrust extends BasePizza {
    public ThinCrust() {
        super(10);
    }

    @Override
    public String getDescription() {
        return "Crust : Thin Crust";
    }
}
