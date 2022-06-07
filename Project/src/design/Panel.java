package design;

import java.awt.*;
import javax.swing.*;

public class Panel extends JPanel{
    public JPanel createFRight(){
        JPanel fright = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        fright.setPreferredSize(new Dimension(600, 600));
        fright.setBackground(new Color(228, 233, 236));
        fright.setBounds(200, 0, 600, 600);

        JPanel fright1 = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        JPanel fright2 = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        JPanel fright3 = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        JPanel fright4 = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        fright.add(fright1);
        fright.add(fright2);
        fright.add(fright3);
        fright.add(fright4);

        JScrollPane foods = new JScrollPane(fright);

        return fright;
    }

    public JPanel createDRight(){
        JPanel dright = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        dright.setPreferredSize(new Dimension(600, 600));
        dright.setBackground(new Color(228, 233, 236));
        dright.setBounds(200, 0, 600, 600);

        return dright;
    }

    public JPanel createCRight(){
        JPanel cright = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        cright.setPreferredSize(new Dimension(600, 600));
        cright.setBackground(new Color(228, 233, 236));
        cright.setBounds(200, 0, 600, 600);

        return cright;
    }
}
