package ru.mirea.it.ivbo01;
import javax.swing.*;
import java.awt.*;

public class point_3 extends JComponent {
    JFrame jf = new JFrame("TEST");

    point_3() {

        jf.setSize(600,600);
        JLabel jlabel = new JLabel();
        Image image = Toolkit.getDefaultToolkit().createImage("C:\\MIREA\\ok.gif");
        ImageIcon imageIcon = new ImageIcon(image);
        imageIcon.setImageObserver(jlabel);
        jlabel.setIcon(imageIcon);
        jf.add(jlabel);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new point_3();
    }
}