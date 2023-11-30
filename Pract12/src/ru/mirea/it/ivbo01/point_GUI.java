package ru.mirea.it.ivbo01;
import javax.swing.*;
import java.awt.*;

public class point_GUI extends JComponent {

    Image jack = new ImageIcon("C:\\MIREA\\tho.jpg").getImage();
    point_GUI(String[] args) {
        this.setPreferredSize(new Dimension(500, 500));

    }
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D)g;
        gr.drawImage(jack, 0, 0, 500, 500, null);

    }

}