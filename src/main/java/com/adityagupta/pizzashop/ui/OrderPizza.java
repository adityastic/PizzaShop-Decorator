package com.adityagupta.pizzashop.ui;

import com.adityagupta.pizzashop.expections.SelectCrustException;
import com.adityagupta.pizzashop.expections.SelectSauceException;
import com.adityagupta.pizzashop.expections.SelectToppingsException;
import com.adityagupta.pizzashop.sel_model.SingleTableSelectionModel;
import com.adityagupta.pizzashop.ui.utils.PizzaShopUtils;
import com.adityagupta.pizzashop.utils.OfferUtils;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class OrderPizza {

    JFrame frame;
    private DefaultTableModel crustModel;
    private DefaultTableModel sauceModel;
    private DefaultTableModel toppingModel;

    private JLabel lblError;
    private JTable crustList, sauceList, toppingList;

    public OrderPizza() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1000, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel titleLabel = new JLabel("New Order");
        titleLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
        titleLabel.setBounds(446, 25, 149, 39);
        frame.getContentPane().add(titleLabel);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(47, 148, 236, 455);
        frame.getContentPane().add(scrollPane);

        generateCrustList();
        crustList = new JTable(crustModel) {
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        scrollPane.setViewportView(crustList);
        crustList.setSelectionModel(new SingleTableSelectionModel());

        JLabel baseLabel = new JLabel("Pizza Base");
        baseLabel.setBounds(130, 120, 99, 16);
        frame.getContentPane().add(baseLabel);

        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(379, 148, 236, 455);
        frame.getContentPane().add(scrollPane_1);

        generateSauceList();
        sauceList = new JTable(sauceModel) {
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        scrollPane_1.setViewportView(sauceList);
        sauceList.setSelectionModel(new SingleTableSelectionModel());

        JLabel sauceLabel = new JLabel("Sauce Selection");
        sauceLabel.setBounds(446, 120, 99, 16);
        frame.getContentPane().add(sauceLabel);

        JScrollPane scrollPane_2 = new JScrollPane();
        scrollPane_2.setBounds(717, 148, 236, 455);
        frame.getContentPane().add(scrollPane_2);

        generateToppingsList();
        toppingList = new JTable(toppingModel) {
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        scrollPane_2.setViewportView(toppingList);

        JLabel toppingLabel = new JLabel("Topping Selection");
        toppingLabel.setBounds(777, 120, 141, 16);
        frame.getContentPane().add(toppingLabel);

        JButton backButton = new JButton("<");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose();
            }
        });
        backButton.setBounds(47, 46, 51, 29);
        frame.getContentPane().add(backButton);

        JButton orderButton = new JButton("Order");
        orderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    JOptionPane.showMessageDialog(frame, "<html>Your Order : <br>" +
                            PizzaShopUtils.createOrder(getSelectedCrust(), getSelectedSauce(), getSelectedToppings()) +
                            " Euros");
                    frame.setVisible(false);
                    frame.dispose();
                } catch (SelectCrustException | SelectSauceException | SelectToppingsException e1) {
                    lblError.setText(e1.getMessage());
                }

            }
        });
        orderButton.setBounds(836, 46, 117, 29);
        frame.getContentPane().add(orderButton);

        lblError = new JLabel("");
        lblError.setBounds(379, 633, 236, 16);
        frame.getContentPane().add(lblError);
    }

    protected String getSelectedCrust() throws SelectCrustException {
        if (crustList.getSelectedRow() < 0)
            throw new SelectCrustException();
        return "" + crustModel.getValueAt(crustList.getSelectedRow(), 0);
    }

    protected String getSelectedSauce() throws SelectSauceException {
        if (sauceList.getSelectedRow() < 0)
            throw new SelectSauceException();
        return "" + sauceModel.getValueAt(sauceList.getSelectedRow(), 0);
    }

    protected List<String> getSelectedToppings() throws SelectToppingsException {
        ArrayList<String> toppings = new ArrayList<>();
        if (toppingList.getRowCount() > 0) {
            if (toppingList.getSelectedRowCount() > 0) {
                int[] selectedRow = toppingList.getSelectedRows();
                for (int i : selectedRow) {
                    toppings.add("" + toppingList.getValueAt(i, 0).toString());
                }
            } else {
                throw new SelectToppingsException();
            }
        }
        return toppings;
    }

    private void generateCrustList() {
        crustModel = new DefaultTableModel(new Object[][]{}, new String[]{"Item", "Price"});
        crustModel.addRow(new Object[]{"Regular Crust", 2});
        crustModel.addRow(new Object[]{"Thin Crust", 10});
        crustModel.addRow(new Object[]{"Pan Crust", 5});
        crustModel.addRow(new Object[]{"Cast Iron", 3});
        crustModel.addRow(new Object[]{"Flat Bread", 10});
        crustModel.addRow(new Object[]{"Grilled", 9});
        crustModel.addRow(new Object[]{"New York", 9});
        crustModel.addRow(new Object[]{"New England", 4});
        crustModel.addRow(new Object[]{"Stuffed", 7});
    }

    private void generateSauceList() {
        sauceModel = new DefaultTableModel(new Object[][]{}, new String[]{"Item", "Price"});
        sauceModel.addRow(getToppingObject("Hummus", 2));
        sauceModel.addRow(getToppingObject("Pesto", 1));
        sauceModel.addRow(getToppingObject("Regular", 0));
        sauceModel.addRow(getToppingObject("Barbeque", 9));
        sauceModel.addRow(getToppingObject("Buffalo", 4));
        sauceModel.addRow(getToppingObject("Creamy Bechamel", 7));
        sauceModel.addRow(getToppingObject("Garlic Ranch", 5));
        sauceModel.addRow(getToppingObject("Marinara", 1));
        sauceModel.addRow(getToppingObject("White Garlic", 8));
    }

    private void generateToppingsList() {
        toppingModel = new DefaultTableModel(new Object[][]{}, new String[]{"Item", "Price"});
        toppingModel.addRow(getToppingObject("Jalapeno", 2));
        toppingModel.addRow(getToppingObject("Olive", 4));
        toppingModel.addRow(getToppingObject("Onion", 1));
        toppingModel.addRow(getToppingObject("Tomato", 3));
        toppingModel.addRow(getToppingObject("Bacon", 5));
        toppingModel.addRow(getToppingObject("Mushroom", 2));
        toppingModel.addRow(getToppingObject("Pepperoni", 4));
        toppingModel.addRow(getToppingObject("Pineapple", 3));
        toppingModel.addRow(getToppingObject("Sausage", 6));
        toppingModel.addRow(getToppingObject("Spinach", 5));
    }
    
    public Object[] getToppingObject(String name, double price){
    	return new Object[] {name, (OfferUtils.getOffer() > 0)? (price - (price * ((double)OfferUtils.getOffer() / 100))) + " ("+OfferUtils.getOffer()+"% Off) " : price};
    }
}
