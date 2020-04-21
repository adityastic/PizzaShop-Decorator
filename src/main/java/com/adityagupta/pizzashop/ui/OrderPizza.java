package com.adityagupta.pizzashop.ui;

import com.adityagupta.pizzashop.expections.SelectCrustException;
import com.adityagupta.pizzashop.expections.SelectSauceException;
import com.adityagupta.pizzashop.expections.SelectToppingsException;
import com.adityagupta.pizzashop.sel_model.SingleTableSelectionModel;
import com.adityagupta.pizzashop.ui.utils.PizzaShopUtils;

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

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    OrderPizza window = new OrderPizza();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

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
        crustModel.addRow(new Object[]{"Thin Crust", 10});
        crustModel.addRow(new Object[]{"Pan Crust", 5});
        crustModel.addRow(new Object[]{"Regular Crust", 2});
    }

    private void generateSauceList() {
        sauceModel = new DefaultTableModel(new Object[][]{}, new String[]{"Item", "Price"});
        sauceModel.addRow(new Object[]{"Hummus", 2});
        sauceModel.addRow(new Object[]{"Pesto", 1});
        sauceModel.addRow(new Object[]{"Regular", 0});
    }

    private void generateToppingsList() {
        toppingModel = new DefaultTableModel(new Object[][]{}, new String[]{"Item", "Price"});
        toppingModel.addRow(new Object[]{"Jalapeno", 2});
        toppingModel.addRow(new Object[]{"Olive", 4});
        toppingModel.addRow(new Object[]{"Onion", 1});
        toppingModel.addRow(new Object[]{"Tomato", 3});
    }
}
