package com.adityagupta.pizzashop.ui;

import javax.swing.*;

import com.adityagupta.pizzashop.utils.OfferUtils;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings {

    JFrame frame;
    private JTextField textField;

    public Settings() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Pizza Ordering System");
        frame.setBounds(100, 100, 300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnPreviousOrders = new JButton("Change Settings");
        btnPreviousOrders.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	OfferUtils.setOffer(Integer.parseInt(textField.getText()));
            }
        });
        btnPreviousOrders.setBounds(66, 160, 146, 29);
        frame.getContentPane().add(btnPreviousOrders);
        
        JButton backButton = new JButton("<");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose();
            }
        });
        backButton.setBounds(18, 19, 51, 29);
        frame.getContentPane().add(backButton);
        
        JLabel lblNewLabel = new JLabel("Toppings Offer (%)");
        lblNewLabel.setBounds(33, 77, 117, 16);
        frame.getContentPane().add(lblNewLabel);
        
        textField = new JTextField();
        textField.setText(""+OfferUtils.getOffer());
        textField.setBounds(152, 72, 130, 26);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
    }
}
