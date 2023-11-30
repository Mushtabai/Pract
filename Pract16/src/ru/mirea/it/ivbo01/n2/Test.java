package ru.mirea.it.ivbo01.n2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Текстовый редактор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTextArea textArea = new JTextArea(10, 30);
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu colorMenu = new JMenu("Цвет");
        menuBar.add(colorMenu);

        JMenuItem blueItem = new JMenuItem("Синий");
        JMenuItem redItem = new JMenuItem("Красный");
        JMenuItem blackItem = new JMenuItem("Черный");

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);

        blueItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLUE);
            }
        });

        redItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });

        blackItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLACK);
            }
        });

        JMenu fontMenu = new JMenu("Шрифт");
        menuBar.add(fontMenu);

        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierNewItem = new JMenuItem("Courier New");

        fontMenu.add(timesNewRomanItem);
        fontMenu.add(msSansSerifItem);
        fontMenu.add(courierNewItem);

        timesNewRomanItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
            }
        });

        msSansSerifItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 12));
            }
        });

        courierNewItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Courier New", Font.PLAIN, 12));
            }
        });

        frame.setVisible(true);
    }
}
