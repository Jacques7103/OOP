package design;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Food {
    public JPanel panelFood(){
        JPanel pright = new JPanel();
        pright.setPreferredSize(new Dimension(600, 600));
        pright.setBackground(new Color(228, 233, 236));
        pright.setBounds(0, 0, 600, 600);
        pright.setLayout(null);

        //https://www.mashed.com/img/gallery/chicken-wings-are-more-nutritious-than-you-thought/how-to-get-the-most-nutrition-out-of-a-chicken-wing-1605217268.jpg
        ImageIcon wing = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Forum Exercise/Project/wings2.jpg");
        JLabel wings = new JLabel();
        wings.setIcon(wing);
        //https://www.britannica.com/topic/buffalo-wings
        wings.setText("<html><span style='font-size:15px'>Chicken Wings</span><br><br><span style='font-size:10px'>Deep fried chicken wings coated with a vinegar and cayenne pepper hot sauce mixed with butter.</span><html>");
        wings.setHorizontalAlignment(JLabel.CENTER);
        wings.setVerticalAlignment(JLabel.CENTER);
        wings.setBounds(20, -30, 450, 200);
        wings.setIconTextGap(15);
        wings.setVerticalTextPosition(JLabel.TOP);
        wings.setHorizontalTextPosition(JLabel.RIGHT);

        //https://www.dreamstime.com/photos-images/potato-wedges.html
        ImageIcon wedge = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Forum Exercise/Project/wedges.jpg");
        JLabel wedges = new JLabel();
        wedges.setIcon(wedge);
        //https://www.allrecipes.com/recipe/199575/oven-fresh-seasoned-potato-wedges/
        wedges.setText("<html><span style='font-size:15px'>Potato Wedges</span><br><br><span style='font-size:10px'>Baked in the oven and seasoned with parmesan, garlic powder, and onion powder. </span><html");
        wedges.setHorizontalAlignment(JLabel.CENTER);
        wedges.setVerticalAlignment(JLabel.CENTER);
        wedges.setBounds(20, 100, 450, 200);
        wedges.setIconTextGap(15);
        wedges.setVerticalTextPosition(JLabel.TOP);
        wedges.setHorizontalTextPosition(JLabel.RIGHT);
        
        //https://stock.adobe.com/id/images/sliced-beef-steak-on-black-plate/235139347
        ImageIcon steak = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Forum Exercise/Project/steaks.jpg");
        JLabel steaks = new JLabel();
        steaks.setIcon(steak);
        //
        steaks.setText("<html><span style='font-size:15px'>Beef Steak</span><br><br><span style='font-size:10px'>Baked in the oven and seasoned with parmesan, garlic powder, and onion powder. </span><html");
        steaks.setHorizontalAlignment(JLabel.CENTER);
        steaks.setVerticalAlignment(JLabel.CENTER);
        steaks.setBounds(20, 240, 450, 200);
        steaks.setIconTextGap(15);
        steaks.setVerticalTextPosition(JLabel.TOP);
        steaks.setHorizontalTextPosition(JLabel.RIGHT);

        pright.add(wings);
        pright.add(wedges);
        pright.add(steaks);

        return pright;
    }
}
