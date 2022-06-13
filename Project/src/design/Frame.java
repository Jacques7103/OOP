//Pack the class to the folder design
package design;

//importing modules that are needed
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame{      //Create the class Frame that inherit from JFrame class
    public void createFrame(){          //Create the function createFrame() that return nothing
        JFrame win = new JFrame("Restaurant");           //Create the frame to store all the panels and buttons with title Restaurant
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //Specify the close button to exit the frame
        win.setSize(810, 600);                   //Set the size for the frame
        win.setResizable(false);                    //Set the frame to be unresizeable, so the user can't resize it

        JPanel left = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));        //Create the panel left to store the Items that will be shown on the left side
        left.setPreferredSize(new Dimension(200, 600));                      //Set the size for the left panel
        left.setBackground(new Color(153, 153, 153));                               //Set the background color for panel size 

        //Creating img variable and set the icon based on the file restaurant.jpg
        //Source : https://graphiccloud.net/restaurant-logo-design/
        ImageIcon img = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Forum Exercise/Project/restaurant.jpg");
        JLabel logo = new JLabel(img);                                                    //Create logo label and put the image
        logo.setPreferredSize(new Dimension(200, 149));                     //Set the size for the logo
        logo.setBorder(new LineBorder(new Color(102, 102, 102),1));     //Set the color and thickness of border for the logo

        JPanel fright, cright;      //Creating panel fright (food in right) and cright (cart in right)
        JButton foods, carts;       //Creating the button foods and carts

        fright = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));     //Create the panel fright
        fright.setPreferredSize(new Dimension(600, 600));            //Set the size for the fright panel
        fright.setBackground(new Color(228, 233, 236));                    //Set the background color for fright panel
        fright.setBounds(200, 0, 600, 600);                     //Set the location (x, y) and size that will be shown for fright panel
        fright.setLayout(null);                                               //Set the layout for fright panel into null

        Food food = new Food();                 //Create the food variable from Food.java
        JPanel pfood = food.panelFood();        //Create the pfood panel to run the function panelFood() from Food.java
        fright.add(pfood);                      //Add pfood panel into fright panel
        fright.setVisible(true);         //Set fright panel to be visible

        cright = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));     //Create the panel cright
        cright.setPreferredSize(new Dimension(600, 600));            //Set the size for the cright panel
        cright.setBackground(new Color(228, 233, 236));                     //Set the background color for fright panel
        cright.setBounds(200, 0, 600, 600);                     //Set the location (x, y) and size that will be shown for cright panel

        JScrollPane pcart = food.panelCart();       //Create pcart variable that run the function panelCart() from Food.java
        cright.add(pcart);                          //Add pcart scroll panel into cright panel
        cright.setVisible(false);            //Set cright visibility as false, so it won't show once the function runs

        //Creating img2 variable and set the icon based on the file food.png
        //Source : https://www.clipartmax.com/middle/m2i8G6Z5Z5b1b1d3_plate-with-fork-and-knife-cross-vector-food-plate-icon-vector/
        ImageIcon img2 = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Forum Exercise/Project/food.png");
        foods = new JButton("Foods", img2);                                         //Create the button foods with text Foods and image from img2 variable
        foods.setFont(new Font("Arial", Font.PLAIN, 40));                     //Set the font in foods button as Arial with size 40
        foods.setPreferredSize(new Dimension(200, 138));                   //Set the size for foods button
        foods.setBackground(new Color(153, 153, 153));                            //Set the background color for foods button
        foods.setFocusPainted(false);                                                  //To remove the blue focus ring around foods button
        foods.setBorder(new LineBorder(new Color(102, 102, 102),1));   //Set the color and thickness for foods' border
        foods.addActionListener(new ActionListener(){               //Create the listener for foods button

            @Override
            public void actionPerformed(ActionEvent e){     //Set this function to run when foods button is clicked
                fright.setVisible(true);             //Set fright panel to be visible
                cright.setVisible(false);            //Set cright panel not visible
            }
        });

        //Creating img3 variable and set the icon based on the file cart.png
        //Source : https://flyclipart.com/add-to-cart-icons-download-free-png-and-vector-icons-shopping-cart-icon-png-301425
        ImageIcon img3 = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Forum Exercise/Project/cart.png");
        carts = new JButton("Cart", img3);                                          //Create the button carts with text Cart and image from img3 variable
        carts.setFont(new Font("Arial", Font.PLAIN, 40));                     //Set the font in carts button as Arial with size 40
        carts.setPreferredSize(new Dimension(200, 138));                   //Set the size for carts button
        carts.setBackground(new Color(153, 153, 153));                            //Set the background color for carts button
        carts.setFocusPainted(false);                                                  //To remove the blue focus ring around carts button
        carts.setBorder(new LineBorder(new Color(102, 102, 102), 1));  //Set the color and thickness for carts' border
        carts.addActionListener(new ActionListener(){               //Create the listener for carts button

            @Override
            public void actionPerformed(ActionEvent e){     //Set this function to run when carts button is clicked
                fright.setVisible(false);            //Set fright panel not visible
                cright.setVisible(true);             //Set cright panel to be visible
            }
        });
        
        win.add(left, BorderLayout.LINE_START);             //Add left panel at the start of the window
        left.add(logo, BorderLayout.PAGE_START);            //Add the logo label at the start of the panel
        left.add(foods, BorderLayout.AFTER_LAST_LINE);      //Add foods button after logo label
        left.add(carts, BorderLayout.AFTER_LAST_LINE);      //Add carts button after foods button

        win.add(fright);            //Add fright panel to the frame
        win.add(cright);            //Add cright panel to the frame
        win.setVisible(true);    //Set the win frame to be visible
    }
}
