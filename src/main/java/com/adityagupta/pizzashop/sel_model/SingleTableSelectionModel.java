package com.adityagupta.pizzashop.sel_model;

import javax.swing.DefaultListSelectionModel;
import javax.swing.ListSelectionModel;

public class SingleTableSelectionModel extends DefaultListSelectionModel {

    public SingleTableSelectionModel () {
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    @Override
    public void clearSelection() {
    }

    @Override
    public void removeSelectionInterval(int index0, int index1) {
    }

}