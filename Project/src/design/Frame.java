package design;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame{
    public void createFrame(){
        JFrame win = new JFrame("Restaurant");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(800, 600);
        win.setResizable(false);

        JPanel left = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        left.setPreferredSize(new Dimension(200, 600));
        left.setBackground(new Color(153, 153, 153));

        ImageIcon img = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Forum Exercise/Project/coffee.png");
        JLabel logo = new JLabel(img);
        logo.setPreferredSize(new Dimension(200, 149));
        logo.setBorder(new LineBorder(new Color(102, 102, 102),1));

        JPanel fright, dright, cright;
        JButton foods, drinks, carts;

        fright = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        fright.setPreferredSize(new Dimension(600, 600));
        fright.setBackground(new Color(228, 233, 236));
        fright.setBounds(200, 0, 600, 600);
        fright.setLayout(null);

        Food food = new Food();
        JPanel pright = food.panelFood();
        fright.add(pright);
        
        dright = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        dright.setPreferredSize(new Dimension(600, 600));
        dright.setBackground(new Color(228, 233, 236));
        dright.setBounds(200, 0, 600, 600);

        cright = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        cright.setPreferredSize(new Dimension(600, 600));
        cright.setBackground(new Color(228, 233, 236));
        cright.setBounds(200, 0, 600, 600);

        //https://www.clipartmax.com/middle/m2i8G6Z5Z5b1b1d3_plate-with-fork-and-knife-cross-vector-food-plate-icon-vector/
        ImageIcon img2 = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Forum Exercise/Project/food.png");
        foods = new JButton("Foods", img2);
        foods.setFont(new Font("Arial", Font.PLAIN, 40));
        foods.setPreferredSize(new Dimension(200, 138));
        foods.setBackground(new Color(153, 153, 153));
        foods.setFocusPainted(false);
        foods.setBorder(new LineBorder(new Color(102, 102, 102),1));
        foods.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                fright.setVisible(true);
                dright.setVisible(false);
                cright.setVisible(false);
            }
        });

        //https://www.vexels.com/png-svg/preview/156834/cocktail-drink-flat-icon
        ImageIcon img3 = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Forum Exercise/Project/drink.png");
        drinks = new JButton("Drinks", img3);
        drinks.setFont(new Font("Arial", Font.PLAIN, 40));
        drinks.setPreferredSize(new Dimension(200, 138));
        drinks.setBackground(new Color(153, 153, 153));
        drinks.setFocusPainted(false);
        drinks.setBorder(new LineBorder(new Color(102, 102, 102),1));
        drinks.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                fright.setVisible(false);
                dright.setVisible(true);
                cright.setVisible(false);
            }
        });

        //https://flyclipart.com/add-to-cart-icons-download-free-png-and-vector-icons-shopping-cart-icon-png-301425
        ImageIcon img4 = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Forum Exercise/Project/cart.png");
        carts = new JButton("Cart", img4);
        carts.setFont(new Font("Arial", Font.PLAIN, 40));
        carts.setPreferredSize(new Dimension(200, 138));
        carts.setBackground(new Color(153, 153, 153));
        carts.setFocusPainted(false);
        carts.setBorder(new LineBorder(new Color(102, 102, 102), 1));
        carts.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                fright.setVisible(false);
                dright.setVisible(false);
                cright.setVisible(true);
            }
        });

        win.add(left, BorderLayout.LINE_START);
        left.add(logo, BorderLayout.PAGE_START);
        left.add(foods, BorderLayout.AFTER_LAST_LINE);
        left.add(drinks, BorderLayout.AFTER_LAST_LINE);
        left.add(carts, BorderLayout.AFTER_LAST_LINE);

        win.add(fright);
        win.add(dright);
        win.add(cright);
        win.setVisible(true);
    }
}
