//Pack the class to the folder design
package design;

//importing modules that are needed
import javax.swing.*;
import java.awt.*;

public class Button {   //Create the class Button
    public JButton addCart(){   //Create the function addCart() that return JButton
        JButton add = new JButton("+");     //Create the button add with text "+"
        add.setFont(new Font("Arial", Font.PLAIN, 10));     //Set the text of add button as Arial with size 10
        add.setFocusPainted(false);                                 //Remove the blue focus ring around add button
        add.setPreferredSize(new Dimension(25, 25));    //Set the size of add button
        add.setMargin(new Insets(0, 0, 0, 0));  //Set the margin of text for the add button
        add.setBounds(75, 70, 25, 25);               //Set the location (x, y) and size that will be shown for add button
        
        return add; //Return the button add
    }

    public JButton removeCart(){    ////Create the function removeCart() that return JButton
        JButton remove = new JButton("-");  //Create the button remove with text "-"
        remove.setFont(new Font("Arial", Font.PLAIN, 10));      //Set the text of remove button as Arial with size 10
        remove.setFocusPainted(false);                                  //Remove the blue focus ring around add button
        remove.setPreferredSize(new Dimension(25, 25));     //Set the size of remove button
        remove.setMargin(new Insets(0, 0, 0, 0));   //Set the margin of text for the remove button
        remove.setBounds(25, 70, 25, 25);                //Set the location (x, y) and size that will be shown for remove button

        return remove;  //Return the button remove
    }
}
