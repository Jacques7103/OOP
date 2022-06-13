//Pack the class to the folder design
package design;

//importing modules that are needed
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.*;

public class Window {       //Create the Window class
    public JFrame createWindow(){       //Create the function createWindow() that return JFrame
        JFrame thank = new JFrame("Confirm");       //Create thank frame with title "Confirm"
        JLabel you = new JLabel("Thank you for your order !!"); //Create the label you with text "Thank you for your order !!"
        thank.setSize(500, 500);    //Set the size of the frame thank
        thank.setBackground(new Color(228, 233, 236));  //Set the background color of the frame thank
        thank.setResizable(false);  //Set the thank frame to be unresizeable, so the user can't resize it
        thank.setLayout(null);      //Set the thank frame layout as null
        thank.setVisible(true);     //Set the thank frame to be visible

        you.setFont(new Font("Arial", Font.PLAIN, 20));     //Set the text of you label as Arial with size 20
        you.setBounds(10, 10, 490, 30);         //Set the location (x, y) and size that will be shown for you label
        //Set the alignment to center
        you.setHorizontalAlignment(JLabel.CENTER);
        you.setVerticalAlignment(JLabel.CENTER);

        //Create an gif icon
        Icon gif = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Forum Exercise/Project/thankyou.gif");
        JLabel gifs = new JLabel(gif);      //Create gifs label and add gif icon
        gifs.setBounds(1, 50, 498, 418);        //Set the location (x, y) and size that will be shown for gifs label

        thank.add(you, BorderLayout.CENTER);    //Add you label to the center of thank frame
        thank.add(gifs, BorderLayout.CENTER);   //Add gifs label to the center of thank frame
        thank.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Specify the close button to exit the frame

        return thank;   //Return the frame thank
    }
}
