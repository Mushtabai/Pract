package ru.mirea.it.ivbo01.n1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Test {
    private static int numberToGuess;
    private static int attempts = 2;
    private static boolean gameEnded = false;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Угадай число");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel();
        JLabel centerLabel = new JLabel("Угадай число от 0 до 20. У тебя 3 попытки.");
        centerPanel.add(centerLabel);
        frame.add(centerPanel, BorderLayout.CENTER);

        JPanel southPanel = new JPanel();
        JButton guessButton = new JButton("Угадать");
        JTextField guessField = new JTextField(5);
        southPanel.add(guessField);
        southPanel.add(guessButton);
        frame.add(southPanel, BorderLayout.SOUTH);

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!gameEnded) {
                    System.out.println(attempts);
                    if (attempts > 0) {
                        try {
                            int guess = Integer.parseInt(guessField.getText());
                            String message;
                            if (guess == numberToGuess) {
                                message = "Поздравляю! Ты угадал число!";
                                attempts = 0; // Завершаем игру
                                gameEnded = true;
                            } else if (guess < numberToGuess) {
                                message = "Число больше.";
                                attempts--;
                            } else {
                                message = "Число меньше.";
                                attempts--;
                            }
                            centerLabel.setText("Угадай число от 0 до 20. У тебя " + (attempts + 1) + " попытки.");
                            JOptionPane.showMessageDialog(frame, message);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(frame, "Пожалуйста, введите число.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame, "Игра окончена. Загаданное число было: " + numberToGuess);
                        gameEnded = true;
                    }
                    guessField.setText("");
                } else {
                    JOptionPane.showMessageDialog(frame, "Добро пожаловать в ...");
                }
            }
        });

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (gameEnded) {
                    Point point = e.getPoint();
                    if (point.x < frame.getWidth() / 5) {
                        JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЗАО");
                    } else if (point.x > 4 * frame.getWidth() / 5) {
                        JOptionPane.showMessageDialog(frame, "Добро пожаловать в ВАО");
                    } else if (point.y < frame.getHeight() / 5) {
                        JOptionPane.showMessageDialog(frame, "Добро пожаловать в САО");
                    } else if (point.y > 4 * frame.getHeight() / 5) {
                        JOptionPane.showMessageDialog(frame, "Добро пожаловать ЮАО");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЦАО");
                    }
                }
            }
        });

        numberToGuess = new Random().nextInt(21); // Загадываем число от 0 до 20

        frame.setVisible(true);
    }
}