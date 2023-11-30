package ru.mirea.it.ivbo01;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Football {
    private JFrame frame;
    private JPanel panel;
    private JButton button1;
    private JLabel label;
    private  int a = 0, b = 0;
    public Football () {

        gui();

    }

    public void gui () {

        JFrame frame = new JFrame("Football");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
        JPanel panel = new JPanel();
        panel.setBackground(Color.YELLOW);
        panel.setPreferredSize(new Dimension(200, 300));

        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        panel.add(button1);
        panel.add(button2);
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxlayout);

        panel.setLayout(new FlowLayout());

        JLabel result = new JLabel("“Result: " + a + "X" + b);
        JLabel lsc = new JLabel("Last Scorer: N/A");
        JLabel winner = new JLabel("Winner: DRAW");
        panel.add(lsc);
        panel.add(result);
        panel.add(winner);
        button1.addActionListener(e -> {
            a++;
            result.setText("Result: " + a + "X" + b );
            lsc.setText("Last Scorer: AC Milan");
            if(a>b)
            {
                winner.setText("Winner: AC Milan");
            }
             else if(b>a)
            {
                winner.setText("Winner: Real Madrid");
            }
             else
                winner.setText("Winner: DRAW");
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b++;
                result.setText("Result: " + a + "X" + b );
                lsc.setText("Last Scorer: Real Madrid");
                if(a>b)
                {
                    winner.setText("Winner: AC Milan");
                }
                else if(b>a)
                {
                    winner.setText("Winner: Real Madrid");
                }
                else
                    winner.setText("Winner: DRAW");
            }
        });

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main (String[] args) {

        new Football();
    }
}
