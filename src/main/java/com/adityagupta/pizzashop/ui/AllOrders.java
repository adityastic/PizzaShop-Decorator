package com.adityagupta.pizzashop.ui;

import com.adityagupta.pizzashop.base.Pizza;
import com.adityagupta.pizzashop.ui.utils.PizzaShopUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.List;

public class AllOrders {

    JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AllOrders window = new AllOrders();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AllOrders() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(81, 141, 340, 500);
        frame.getContentPane().add(scrollPane);

        JList list = new JList(getAllOrdersListModel());
        scrollPane.setViewportView(list);

        JButton backButton = new JButton("<");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose();
            }
        });
        backButton.setBounds(47, 46, 51, 29);
        frame.getContentPane().add(backButton);

        JLabel lblNewLabel = new JLabel("All Past Orders");
        lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
        lblNewLabel.setBounds(171, 41, 205, 70);
        frame.getContentPane().add(lblNewLabel);
    }

    private DefaultListModel<String> getAllOrdersListModel() {
        DefaultListModel<String> model = new DefaultListModel<>();
        List<Pizza> allPizzas = PizzaShopUtils.getAllPizzas();
        Collections.reverse(allPizzas);
        for (Pizza pizza : allPizzas) {
            model.addElement("<html><pre>" + pizza.getDescription() + "<br>--------------------------------------------</pre></html>");
        }
        return model;
    }
}
