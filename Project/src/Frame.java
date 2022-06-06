import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Frame extends JFrame{
    public void createFrame(){
        JFrame win = new JFrame("Restaurant");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(800, 600);
        win.setResizable(false);

        JPanel left = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        left.setPreferredSize(new Dimension(200, 600));
        left.setBackground(new Color(255, 255, 255));

        ImageIcon img = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Project/Project/coffee.png");
        JLabel logo = new JLabel(img);
        logo.setPreferredSize(new Dimension(200, 149));
        logo.setBorder(new LineBorder(new Color(153, 153, 153),1));
        
        Right right = new Right();
        Panel panel = new Panel();

        win.add(left, BorderLayout.LINE_START);
        left.add(logo, BorderLayout.PAGE_START);
        left.add(right.createFood(), BorderLayout.AFTER_LAST_LINE);
        left.add(right.createDrink(), BorderLayout.AFTER_LAST_LINE);
        left.add(right.createCart(), BorderLayout.AFTER_LAST_LINE);

        win.add(panel.createFRight());
        win.add(panel.createDRight());
        win.add(panel.createCRight());
        win.setVisible(true);
    }
}
