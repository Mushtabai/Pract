package ru.mirea.it.ivbo01;
import javax.swing.*;

public class point_2 extends JComponent {
    JFrame jf = new JFrame("TEST");
    point_GUI task;


    point_2(String[] args) {


        task = new point_GUI(args);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500, 500);
        jf.add(task);

        jf.pack();
        jf.setLayout(null);
        jf.setVisible(true);
    }

    public static void main(String[] args) {

        new point_2(args);
    }
}