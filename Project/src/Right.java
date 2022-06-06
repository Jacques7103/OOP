import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

class Right extends Panel implements Get{
    Panel panel = new Panel();
    public JButton createFood(){
        JButton foods = new JButton("Foods");
        foods.setPreferredSize(new Dimension(200, 138));
        foods.setContentAreaFilled(false);
        foods.setFocusPainted(false);
        foods.setBorder(new LineBorder(new Color(153, 153, 153),1));
        foods.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                panel.createFRight().setVisible(true);
                panel.createDRight().setVisible(false);
                panel.createCRight().setVisible(false);
            }
        });
        return foods;
    }

    public JButton createDrink(){
        JButton drinks = new JButton("Drinks");
        drinks.setPreferredSize(new Dimension(200, 138));
        drinks.setContentAreaFilled(false);
        drinks.setFocusPainted(false);
        drinks.setBorder(new LineBorder(new Color(153, 153, 153),1));
        drinks.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                panel.createFRight().setVisible(true);
                panel.createDRight().setVisible(false);
                panel.createCRight().setVisible(false);
            }
        });
        return drinks;
    }

    public JButton createCart(){
        JButton carts = new JButton("Cart");
        carts.setPreferredSize(new Dimension(200, 138));
        carts.setContentAreaFilled(false);
        carts.setFocusPainted(false);
        carts.setBorder(new LineBorder(new Color(153, 153, 153),1));
        carts.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                panel.createFRight().setVisible(true);
                panel.createDRight().setVisible(false);
                panel.createCRight().setVisible(false);
            }
        });
        return carts;
    }
}