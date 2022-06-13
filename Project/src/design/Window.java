package design;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.*;

public class Window {
    public JFrame createWindow(){
        JFrame thank = new JFrame("Confirm");
        JLabel you = new JLabel("Thank you for your order !!");
        thank.setSize(500, 500);
        thank.setBackground(new Color(228, 233, 236));
        thank.setResizable(false);
        thank.setLayout(null);
        thank.setVisible(true);

        you.setFont(new Font("Arial", Font.PLAIN, 20));
        you.setBounds(10, 10, 490, 30);
        you.setHorizontalAlignment(JLabel.CENTER);
        you.setVerticalAlignment(JLabel.CENTER);

        Icon gif = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Forum Exercise/Project/thankyou.gif");
        JLabel gifs = new JLabel(gif);
        gifs.setBounds(1, 50, 498, 418);

        thank.add(you, BorderLayout.CENTER);
        thank.add(gifs, BorderLayout.CENTER);
        thank.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        return thank;
    }
}
