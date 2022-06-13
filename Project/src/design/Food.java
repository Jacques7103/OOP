package design;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.text.*;

public class Food {
    private int wcount = 0;
    private int wecount = 0;
    private int scount = 0;
    private int bcount = 0;
    private double wingprice = 8.19;
    private double wedgeprice = 6.35;
    private double steakprice = 18.49;
    private double burgerprice = 13.29;
    private int margin = 35;
    private int margin2 = 0;
    Button button = new Button();
    private static Map<Integer, JLabel> ilist = new HashMap<Integer, JLabel>();
    private static Map<Integer, JLabel> nlist = new HashMap<Integer, JLabel>();
    private static ArrayList<JLabel> rilist = new ArrayList<JLabel>();
    private static ArrayList<JLabel> rnlist = new ArrayList<JLabel>();
    private int qcount = 0;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public JPanel panelFood(){
        JPanel pfood = new JPanel();
        pfood.setPreferredSize(new Dimension(600, 600));
        pfood.setBackground(new Color(228, 233, 236));
        pfood.setBounds(0, 0, 600, 600);
        pfood.setLayout(null);

        pfood.add(createWings());
        pfood.add(createWNums());
        pfood.add(createWedges());
        pfood.add(createWeNums());
        pfood.add(createSteak());
        pfood.add(createSNums());
        pfood.add(createBurger());
        pfood.add(createBNums());

        return pfood;
    }

    public JLabel createWings(){
        //https://www.mashed.com/img/gallery/chicken-wings-are-more-nutritious-than-you-thought/how-to-get-the-most-nutrition-out-of-a-chicken-wing-1605217268.jpg
        ImageIcon wing = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Forum Exercise/Project/wings2.jpg");
        JLabel wings = new JLabel();
        wings.setIcon(wing);
        //https://www.britannica.com/topic/buffalo-wings
        wings.setText("<html><span style='font-size:15px'>Chicken Wings</span><br><span style='font-size:10px'>$ 8.19</span><br><span style='font-size:10px'>Deep fried chicken wings coated with a vinegar and cayenne pepper hot sauce mixed with butter.</span><html>");
        wings.setHorizontalAlignment(JLabel.CENTER);
        wings.setVerticalAlignment(JLabel.CENTER);
        wings.setBounds(30, -20, 450, 200);
        wings.setIconTextGap(15);
        wings.setVerticalTextPosition(JLabel.TOP);
        wings.setHorizontalTextPosition(JLabel.RIGHT);

        return wings;
    }

    public JLabel createWedges(){
        //https://www.dreamstime.com/photos-images/potato-wedges.html
        ImageIcon wedge = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Forum Exercise/Project/wedges.jpg");
        JLabel wedges = new JLabel();
        wedges.setIcon(wedge);
        //https://www.allrecipes.com/recipe/199575/oven-fresh-seasoned-potato-wedges/
        wedges.setText("<html><span style='font-size:15px'>Potato Wedges</span><br><span style='font-size:10px'>$ 6.35</span><br><span style='font-size:10px'>Unpeeled potato that baked in the oven and seasoned with parmesan, garlic powder, and onion powder. </span><html");
        wedges.setHorizontalAlignment(JLabel.CENTER);
        wedges.setVerticalAlignment(JLabel.CENTER);
        wedges.setBounds(30, (-20 + 100 + margin), 450, 200);
        wedges.setIconTextGap(15);
        wedges.setVerticalTextPosition(JLabel.TOP);
        wedges.setHorizontalTextPosition(JLabel.RIGHT);

        return wedges;
    }

    public JLabel createSteak(){
        //https://stock.adobe.com/id/images/sliced-beef-steak-on-black-plate/235139347
        ImageIcon steak = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Forum Exercise/Project/steaks.jpg");
        JLabel steaks = new JLabel();
        steaks.setIcon(steak);
        //https://guide.michelin.com/en/article/dining-in/restaurant-secrets-how-to-cook-the-perfect-steak
        steaks.setText("<html><span style='font-size:15px'>Beef Steak </span><br><span style='font-size:10px'>$ 18.49</span><br><span style='font-size:10px'>Rib-eye beef steak that has the right amount of fat to meat ratio and comes with every rich marbling. </span><html");
        steaks.setHorizontalAlignment(JLabel.CENTER);
        steaks.setVerticalAlignment(JLabel.CENTER);
        steaks.setBounds(30, (-20 + 200 + (margin * 2)), 450, 200);
        steaks.setIconTextGap(15);
        steaks.setVerticalTextPosition(JLabel.TOP);
        steaks.setHorizontalTextPosition(JLabel.RIGHT);

        return steaks;
    }

    public JLabel createBurger(){
        //https://luxatic.com/the-top-10-most-expensive-burgers-in-the-world/
        ImageIcon burger = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Forum Exercise/Project/burgers.jpg");
        JLabel burgers = new JLabel();
        burgers.setIcon(burger);
        //
        burgers.setText("<html><span style='font-size:15px'>Beef Cheese Burger </span><br><span style='font-size:10px'>$ 13.29</span><br><span style='font-size:10px'>Sandwich consisting ground meat made into a patty, topped with cheese, and placed between two halves of a bun.  </span><html");
        burgers.setHorizontalAlignment(JLabel.CENTER);
        burgers.setVerticalAlignment(JLabel.CENTER);
        burgers.setBounds(30, (-20 + 300 + (margin * 3)), 450, 200);
        burgers.setIconTextGap(15);
        burgers.setVerticalTextPosition(JLabel.TOP);
        burgers.setHorizontalTextPosition(JLabel.RIGHT);

        return burgers;
    }

    public JLabel createWNums(){
        JButton wadd = button.addCart();
        JButton wremove = button.removeCart();

        JLabel wingsnum = new JLabel();
        JLabel wingsprice = new JLabel("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ 0.0</p></html>");
        wingsprice.setFont(new Font("Arial", Font.BOLD, 18));
        wingsprice.setBounds(35, -20, 150, 100);
        wingsnum.setBounds(470, 30, 150, 100);

        JLabel num = new JLabel(String.valueOf(wcount));
        num.setFont(new Font("Arial", Font.PLAIN, 10));
        num.setPreferredSize(new Dimension(25, 25));
        num.setBounds(50, 70, 25, 25);
        num.setBorder(new LineBorder(new Color(102, 102, 102), 1));
        num.setHorizontalAlignment(JLabel.CENTER);
        num.setVerticalAlignment(JLabel.CENTER);

        new Timer(100, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (wcount == 0){
                    "".isEmpty();
                } else if (wcount == 1){
                    double wingprices = wcount * wingprice;
                    wingsprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:1'>$ " + String.valueOf(df.format(wingprices)) + "</p></html>");
                } else if (wcount > 1){
                    double wingprices = wcount * wingprice;
                    wingsprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:-2'>$ " + String.valueOf(df.format(wingprices)) + "</p></html>");
                }
            }
        }).start();

        new Timer(100, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                num.setText(String.valueOf(wcount));
            }
        }).start();

        wadd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                wcount++;
                double wingprices = wcount * wingprice;
                num.setText(String.valueOf(wcount));
                wingsprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ " + String.valueOf(df.format(wingprices)) + "</p></html>");
            }
        });

        wremove.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                if (wcount > 0){
                    wcount--;
                    double wingprices = wcount * wingprice;
                    num.setText(String.valueOf(wcount));
                    wingsprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ " + String.valueOf(df.format(wingprices)) + "</p></html>");
                }
            }
        });

        wingsnum.add(wadd);
        wingsnum.add(wremove);
        wingsnum.add(num);
        wingsnum.add(wingsprice);

        return wingsnum;
    }

    public JLabel createWeNums(){
        JButton weadd = button.addCart();
        JButton weremove = button.removeCart();

        JLabel wedgesnum = new JLabel();
        JLabel wedgesprice = new JLabel("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ 0.0</p></html>");
        wedgesprice.setFont(new Font("Arial", Font.BOLD, 18));
        wedgesprice.setBounds(35, -20, 150, 100);
        wedgesnum.setBounds(470, 165, 150, 100);

        JLabel num2 = new JLabel(String.valueOf(wecount));
        num2.setFont(new Font("Arial", Font.PLAIN, 10));
        num2.setPreferredSize(new Dimension(25, 25));
        num2.setBounds(50, 70, 25, 25);
        num2.setBorder(new LineBorder(new Color(102, 102, 102), 1));
        num2.setHorizontalAlignment(JLabel.CENTER);
        num2.setVerticalAlignment(JLabel.CENTER);

        new Timer(100, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (wecount == 0){
                    "".isEmpty();
                } else if (wecount == 1){
                    double wedgeprices = wecount * wedgeprice;
                    wedgesprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:1'>$ " + String.valueOf(df.format(wedgeprices)) + "</p></html>");
                } else if (wecount > 1){
                    double wedgeprices = wecount * wedgeprice;
                    wedgesprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:-2'>$ " + String.valueOf(df.format(wedgeprices)) + "</p></html>");
                }
            }
        }).start();

        new Timer(100, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                num2.setText(String.valueOf(wecount));
            }
        }).start();

        weadd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                wecount++;
                double wedgeprices = wecount * wedgeprice;
                num2.setText(String.valueOf(wecount));
                wedgesprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:1'>$ " + String.valueOf(df.format(wedgeprices)) + "</p></html>");
            }
        });

        weremove.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                if (wecount > 0){
                    wecount--;
                    double wedgeprices = wecount * wedgeprice;
                    num2.setText(String.valueOf(wecount));
                    wedgesprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:1'>$ " + String.valueOf(df.format(wedgeprices)) + "</p></html>");
                }
            }
        });
        
        wedgesnum.add(num2);
        wedgesnum.add(wedgesprice);
        wedgesnum.add(weadd);
        wedgesnum.add(weremove);

        return wedgesnum;
    }

    public JLabel createSNums(){
        JButton sadd = button.addCart();
        JButton sremove = button.removeCart();

        JLabel steaksnum = new JLabel();
        JLabel steaksprice = new JLabel("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ 0.0</p></html>");
        steaksprice.setFont(new Font("Arial", Font.BOLD, 18));
        steaksprice.setBounds(35, -20, 150, 100);
        steaksnum.setBounds(470, 300, 150, 100);

        JLabel num3 = new JLabel(String.valueOf(scount));
        num3.setFont(new Font("Arial", Font.PLAIN, 10));
        num3.setPreferredSize(new Dimension(25, 25));
        num3.setBounds(50, 70, 25, 25);
        num3.setBorder(new LineBorder(new Color(102, 102, 102), 1));
        num3.setHorizontalAlignment(JLabel.CENTER);
        num3.setVerticalAlignment(JLabel.CENTER);

        new Timer(100, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (scount == 0){
                    "".isEmpty();
                } else if (scount >= 1){
                    double steakprices = scount * steakprice;
                    steaksprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:-2'>$ " + String.valueOf(df.format(steakprices)) + "</p></html>");
                }
            }
        }).start();

        new Timer(100, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                num3.setText(String.valueOf(scount));
            }
        }).start();

        sadd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                scount++;
                double steakprices = scount * steakprice;
                num3.setText(String.valueOf(scount));
                steaksprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ " + String.valueOf(df.format(steakprices)) + "</p></html>");
            }
        });

        sremove.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                if (scount > 0){
                    scount--;
                    double steakprices = scount * steakprice;
                    num3.setText(String.valueOf(scount));
                    steaksprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ " + String.valueOf(df.format(steakprices)) + "</p></html>");
                }
            }
        });
        
        steaksnum.add(num3);
        steaksnum.add(steaksprice);
        steaksnum.add(sadd);
        steaksnum.add(sremove);

        return steaksnum;
    }

    public JLabel createBNums(){
        JButton badd = button.addCart();
        JButton bremove = button.removeCart();

        JLabel burgersnum = new JLabel();
        JLabel burgersprice = new JLabel("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ 0.0</p></html>");
        burgersprice.setFont(new Font("Arial", Font.BOLD, 18));
        burgersprice.setBounds(35, -20, 150, 100);
        burgersnum.setBounds(470, 435, 150, 100);

        JLabel num4 = new JLabel(String.valueOf(scount));
        num4.setFont(new Font("Arial", Font.PLAIN, 10));
        num4.setPreferredSize(new Dimension(25, 25));
        num4.setBounds(50, 70, 25, 25);
        num4.setBorder(new LineBorder(new Color(102, 102, 102), 1));
        num4.setHorizontalAlignment(JLabel.CENTER);
        num4.setVerticalAlignment(JLabel.CENTER);

        new Timer(100, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (bcount == 0){
                    "".isEmpty();
                } else if (bcount >= 1){
                    double burgerprices = bcount * burgerprice;
                    burgersprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:-2'>$ " + String.valueOf(df.format(burgerprices)) + "</p></html>");
                }
            }
        }).start();

        new Timer(100, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                num4.setText(String.valueOf(bcount));
            }
        }).start();

        badd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                bcount++;
                double burgerprices = bcount * burgerprice;
                num4.setText(String.valueOf(bcount));
                burgersprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ " + String.valueOf(df.format(burgerprices)) + "</p></html>");
            }
        });

        bremove.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                if (bcount > 0){
                    bcount--;
                    double burgerprices = bcount * burgerprice;
                    num4.setText(String.valueOf(bcount));
                    burgersprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ " + String.valueOf(df.format(burgerprices)) + "</p></html>");
                }
            }
        });
        
        burgersnum.add(num4);
        burgersnum.add(burgersprice);
        burgersnum.add(badd);
        burgersnum.add(bremove);

        return burgersnum;
    }

    public JPanel panelCart(){
        JPanel pcart = new JPanel();
        pcart.setPreferredSize(new Dimension(600, 600));
        pcart.setBackground(new Color(228, 233, 236));
        pcart.setBounds(0, 0, 600, 600);
        pcart.setLayout(null);

        new Timer(100, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (wcount > 0 && checkItem(ilist, createWings())){
                    "".isEmpty();
                } else if (wcount > 0){
                    qcount++;
                    ilist.put(qcount, createWings());
                    nlist.put(qcount, createWNums());
                } else if (wcount == 0 && checkItem(ilist, createWings())){
                    for (Map.Entry<Integer, JLabel> entry : ilist.entrySet()){
                        if (entry.getValue().getText() == createWings().getText()){
                            rilist.add(ilist.remove(entry.getKey()));
                            rnlist.add(nlist.remove(entry.getKey()));
                            qcount--;
                        }
                    }
                }
                
                if (wecount > 0 && checkItem(ilist, createWedges())){
                    "".isEmpty();
                } else if (wecount > 0){
                    qcount++;
                    ilist.put(qcount, createWedges());
                    nlist.put(qcount, createWeNums());
                } else if (wecount == 0 && checkItem(ilist, createWedges())){
                    for (Map.Entry<Integer, JLabel> entry : ilist.entrySet()){
                        if (entry.getValue().getText() == createWedges().getText()){
                            rilist.add(ilist.remove(entry.getKey()));
                            rnlist.add(nlist.remove(entry.getKey()));
                            qcount--;
                        }
                    }
                }
                
                if (scount > 0 && checkItem(ilist, createSteak())){
                    "".isEmpty();
                } else if (scount > 0){
                    qcount++;
                    ilist.put(qcount, createSteak());
                    nlist.put(qcount, createSNums());
                } else if (scount == 0 && checkItem(ilist, createSteak())){
                    for (Map.Entry<Integer, JLabel> entry : ilist.entrySet()){
                        if (entry.getValue().getText() == createSteak().getText()){
                            rilist.add(ilist.remove(entry.getKey()));
                            rnlist.add(nlist.remove(entry.getKey()));
                            qcount--;
                        }
                    }
                }
                
                if (bcount > 0 && checkItem(ilist, createBurger())){
                    "".isEmpty();
                } else if (bcount > 0){
                    qcount++;
                    ilist.put(qcount, createBurger());
                    nlist.put(qcount, createBNums());
                } else if (bcount == 0 && checkItem(ilist, createBurger())){
                    for (Map.Entry<Integer, JLabel> entry : ilist.entrySet()){
                        if (entry.getValue().getText() == createBurger().getText()){
                            rilist.add(ilist.remove(entry.getKey()));
                            rnlist.add(nlist.remove(entry.getKey()));
                            qcount--;
                        }
                    }
                }
            }
        }).start();

        new Timer(100, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for (int i = 0; i < ilist.size();){
                    if (ilist.get(i + 1) == null){
                        "".isEmpty();
                    } else {
                        ilist.get(i + 1).setBounds(30, -20 + margin2, 450, 200);
                        nlist.get(i + 1).setBounds(470, 30 + margin2, 150, 100);
                        pcart.add(ilist.get(i + 1));
                        pcart.add(nlist.get(i + 1));
                        margin2 += 135;
                        i++;
                    }                    
                }
                margin2 = 0;
            }
        }).start();

        new Timer(100, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for (int i = 0; i < rilist.size(); i++){
                    if (rilist.isEmpty() == false){ 
                        pcart.remove(rilist.get(i));
                        pcart.remove(rnlist.get(i));
                        rilist.clear();
                        rnlist.clear();
                    }
                }
            }
        }).start();

        new Timer(100, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pcart.repaint();
            }
        }).start();

        return pcart;
    }

    public boolean checkItem(Map<Integer, JLabel> list, JLabel label){
        for (int i = 0; i < list.size(); i++){
            if (ilist.get(i + 1).getText() == label.getText()){
                return true;
            }
        }
        return false;
    }
}
