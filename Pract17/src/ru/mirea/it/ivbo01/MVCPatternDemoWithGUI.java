package ru.mirea.it.ivbo01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MVCPatternDemoWithGUI {
    private Student model;
    private StudentView view;
    private StudentController controller;
    private JTextField nameField;
    private JTextField rollNoField;
    private JLabel nameLabel;
    private JLabel rollNoLabel;

    public MVCPatternDemoWithGUI() {
        model = getStudentFromDatabase();
        view = new StudentView();
        controller = new StudentController(model, view);

        // Create the main JFrame
        JFrame frame = new JFrame("MVC Pattern Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create a text field for entering the name
        nameField = new JTextField(10);

        // Create a text field for entering the roll no
        rollNoField = new JTextField(10);

        // Create a button to set name and roll no
        JButton setValuesButton = new JButton("Set Values");

        setValuesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String rollNo = rollNoField.getText();
                controller.setName(name);
                controller.setRollNo(rollNo);
            }
        });

        // Create a button to update the view
        JButton updateViewButton = new JButton("Update View");

        updateViewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.updateView();
                updateLabels();
            }
        });

        // Create labels for displaying name and roll no
        nameLabel = new JLabel("Name: " + model.getName());
        rollNoLabel = new JLabel("Roll No: " + model.getRollNo());

        // Add components to the frame
        frame.setLayout(new FlowLayout());
        frame.add(nameField);
        frame.add(rollNoField);
        frame.add(setValuesButton);
        frame.add(updateViewButton);
        frame.add(nameLabel);
        frame.add(rollNoLabel);

        frame.setVisible(true);
    }

    private Student getStudentFromDatabase() {
        Student student = new Student();
        student.setName("Andrew");
        student.setRollNo("123");
        return student;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MVCPatternDemoWithGUI();
            }
        });
    }

    public void updateLabels() {
        nameLabel.setText("Name: " + model.getName());
        rollNoLabel.setText("Roll No: " + model.getRollNo());
    }
}