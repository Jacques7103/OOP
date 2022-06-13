package design;

import javax.swing.*;
import java.awt.*;

public class Button {
    public JButton addCart(){
        JButton add = new JButton("+");
        add.setFont(new Font("Arial", Font.PLAIN, 10));
        add.setFocusPainted(false);
        add.setPreferredSize(new Dimension(25, 25));
        add.setMargin(new Insets(0, 0, 0, 0));
        add.setBounds(75, 70, 25, 25);
        
        return add;
    }

    public JButton removeCart(){
        JButton remove = new JButton("-");
        remove.setFont(new Font("Arial", Font.PLAIN, 10));
        remove.setFocusPainted(false);
        remove.setPreferredSize(new Dimension(25, 25));
        remove.setMargin(new Insets(0, 0, 0, 0));
        remove.setBounds(25, 70, 25, 25);

        return remove;
    }
}
