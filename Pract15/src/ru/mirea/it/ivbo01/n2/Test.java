package ru.mirea.it.ivbo01.n2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Выбор меню");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel countryLabel = new JLabel("Выберите страну:");
        panel.add(countryLabel);

        String[] countries = {"Australia", "China", "England", "Russia"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);
        panel.add(countryComboBox);

        JLabel infoLabel = new JLabel("");
        panel.add(infoLabel);

        frame.add(panel);

        frame.setVisible(true);

        countryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryComboBox.getSelectedItem();
                String info = getInfoForCountry(selectedCountry);
                infoLabel.setText(info);
            }
        });
    }

    private static String getInfoForCountry(String country) {
        switch (country) {
            case "Australia":
                return "Информация о Австралии";
            case "China":
                return "Информация о Китае";
            case "England":
                return "Информация о Англии";
            case "Russia":
                return "Информация о России";
            default:
                return "";
        }
    }
}