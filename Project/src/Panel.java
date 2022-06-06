import java.awt.*;
import javax.swing.*;

public class Panel extends JPanel{
    public JPanel createFRight(){
        JPanel fright = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        fright.setPreferredSize(new Dimension(600, 600));
        fright.setBackground(new Color(153, 153, 153));
        fright.setBounds(200, 0, 600, 600);

        return fright;
    }

    public JPanel createDRight(){
        JPanel dright = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        dright.setPreferredSize(new Dimension(600, 600));
        dright.setBackground(new Color(153, 153, 153));
        dright.setBounds(200, 0, 600, 600);

        return dright;
    }

    public JPanel createCRight(){
        JPanel cright = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        cright.setPreferredSize(new Dimension(600, 600));
        cright.setBackground(new Color(153, 153, 153));
        cright.setBounds(200, 0, 600, 600);

        return cright;
    }
}
