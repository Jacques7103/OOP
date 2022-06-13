//Pack the class to the folder design
package design;

//importing modules that are needed
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.text.*;

public class Food {         //Creating the class Food
    //Creating the variable that are needed
    private int wcount = 0;
    private int wecount = 0;
    private int scount = 0;
    private int bcount = 0;
    private double wingprice = 8.19;
    private double wedgeprice = 6.35;
    private double steakprice = 18.49;
    private double burgerprice = 13.29;
    private static double wingprices, wedgeprices, steakprices, burgerprices, total;
    private int margin = 35;
    private int margin2 = 0;
    Button button = new Button();
    private static Map<Integer, JLabel> ilist = new HashMap<Integer, JLabel>();
    private static Map<Integer, JLabel> nlist = new HashMap<Integer, JLabel>();
    private static ArrayList<JLabel> rilist = new ArrayList<JLabel>();
    private static ArrayList<JLabel> rnlist = new ArrayList<JLabel>();
    private int qcount = 0;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    static Timer timer;
    public JPanel panelFood(){                                            //Create panelFood() function that return JPanel
        JPanel pfood = new JPanel();                                      //Create pfood panel
        pfood.setPreferredSize(new Dimension(600, 600));    //Set the size for pfood panel
        pfood.setBackground(new Color(228, 233, 236));            //Set the background color for pfood panel
        pfood.setBounds(0, 0, 600, 600);               //Set the location (x, y) and size that will be shown for pfood panel
        pfood.setLayout(null);                                       //Set the layout of pfood panel to null

        pfood.add(createWings());       //Add function createWings() that return JLabel into pfood panel
        pfood.add(createWNums());       //Add function createWNums() that return JLabel into pfood panel
        pfood.add(createWedges());      //Add function createWedges() that return JLabel into pfood panel
        pfood.add(createWeNums());      //Add function createWeNums() that return JLabel into pfood panel
        pfood.add(createSteak());       //Add function createSteak() that return JLabel into pfood panel
        pfood.add(createSNums());       //Add function createSNums() that return JLabel into pfood panel
        pfood.add(createBurger());      //Add function createBurger() that return JLabel into pfood panel
        pfood.add(createBNums());       //Add function createBNums() that return JLabel into pfood panel

        return pfood;                   //Return the panel pfood
    }

    public JLabel createWings(){        //Create the function createWings() that return JLabel
        //Creating wing variable and set the icon based on the file wings2.jpg
        //Source : https://www.mashed.com/img/gallery/chicken-wings-are-more-nutritious-than-you-thought/how-to-get-the-most-nutrition-out-of-a-chicken-wing-1605217268.jpg
        ImageIcon wing = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Forum Exercise/Project/wings2.jpg");
        JLabel wings = new JLabel();        //Create wings label
        wings.setIcon(wing);                //Add wing image into wings label
        //Set the text of label wings from source : https://www.britannica.com/topic/buffalo-wings
        wings.setText("<html><span style='font-size:15px'>Chicken Wings</span><br><span style='font-size:10px'>$ 8.19</span><br><span style='font-size:10px'>Deep fried chicken wings coated with a vinegar and cayenne pepper hot sauce mixed with butter.</span><html>");
        //Set the alignment to center
        wings.setHorizontalAlignment(JLabel.CENTER);
        wings.setVerticalAlignment(JLabel.CENTER);
        wings.setBounds(30, -20, 450, 200);     //Set the location (x, y) and size that will be shown for wings label
        wings.setIconTextGap(15);                   //Set the gap between texts that will be shown in wings label
        //Set the text in wings label as top (vertically) and right (horizontally)
        wings.setVerticalTextPosition(JLabel.TOP);
        wings.setHorizontalTextPosition(JLabel.RIGHT);

        return wings;       //return the label wings
    }

    public JLabel createWedges(){       //Create the function createWedges() that return JLabel
        //Creating wedge variable and set the icon based on the file wedges.jpg
        //Source : https://www.dreamstime.com/photos-images/potato-wedges.html
        ImageIcon wedge = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Forum Exercise/Project/wedges.jpg");
        JLabel wedges = new JLabel();       //Create wedges label
        wedges.setIcon(wedge);              //Add wedge image into wedges label
        //Set the text of label wedges from source : https://www.allrecipes.com/recipe/199575/oven-fresh-seasoned-potato-wedges/
        wedges.setText("<html><span style='font-size:15px'>Potato Wedges</span><br><span style='font-size:10px'>$ 6.35</span><br><span style='font-size:10px'>Unpeeled potato that baked in the oven and seasoned with parmesan, garlic powder, and onion powder. </span><html");
        //Set the alignment to center
        wedges.setHorizontalAlignment(JLabel.CENTER);
        wedges.setVerticalAlignment(JLabel.CENTER);
        wedges.setBounds(30, (-20 + 100 + margin), 450, 200);   //Set the location (x, y) and size that will be shown for wedges label
        wedges.setIconTextGap(15);                                  //Set the gap bewtween texts that will be shown in wedges label
        //Set the text in wedges label as top (vertically) and right (horizontally)
        wedges.setVerticalTextPosition(JLabel.TOP);
        wedges.setHorizontalTextPosition(JLabel.RIGHT);

        return wedges;      //return the label wedges
    }

    public JLabel createSteak(){        //Create the function createSteak() that return JLabel
        //Creating steak variable and set the icon based on the file steaks.jpg
        //Source : https://stock.adobe.com/id/images/sliced-beef-steak-on-black-plate/235139347
        ImageIcon steak = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Forum Exercise/Project/steaks.jpg");
        JLabel steaks = new JLabel();       //Create steaks label
        steaks.setIcon(steak);              //Add steak image into steaks label
        //Set the text of label steaks from source : https://guide.michelin.com/en/article/dining-in/restaurant-secrets-how-to-cook-the-perfect-steak
        steaks.setText("<html><span style='font-size:15px'>Beef Steak </span><br><span style='font-size:10px'>$ 18.49</span><br><span style='font-size:10px'>Rib-eye beef steak that has the right amount of fat to meat ratio and comes with every rich marbling. </span><html");
        //Set the alignment to center
        steaks.setHorizontalAlignment(JLabel.CENTER);
        steaks.setVerticalAlignment(JLabel.CENTER);
        steaks.setBounds(30, (-20 + 200 + (margin * 2)), 450, 200);     //Set the location (x, y) and size that will be shown for steaks label
        steaks.setIconTextGap(15);                                          //Set the gap bewtween texts that will be shown in steaks label
        //Set the text in steaks label as top (vertically) and right (horizontally)
        steaks.setVerticalTextPosition(JLabel.TOP);
        steaks.setHorizontalTextPosition(JLabel.RIGHT);

        return steaks;      //return the label steaks
    }

    public JLabel createBurger(){       //Create the function createBurger() that return JLabel
        //Creating burger variable and set the icon based on the file burgers.jpg
        //https://luxatic.com/the-top-10-most-expensive-burgers-in-the-world/
        ImageIcon burger = new ImageIcon("C:/Users/ferdi/OneDrive/Desktop/Binus/2nd Semester/Object Oriented Programming/Forum Exercise/Project/burgers.jpg");
        JLabel burgers = new JLabel();      //Create burgers label
        burgers.setIcon(burger);            //Add burger image into burgers label
        //Set the text of label burgers from source : https://www.recipetips.com/glossary-term/t--36063/cheeseburger.asp#:~:text=A%20traditional%20grilled%20sandwich%20that,create%20this%20favorite%20international%20food.
        burgers.setText("<html><span style='font-size:15px'>Beef Cheese Burger </span><br><span style='font-size:10px'>$ 13.29</span><br><span style='font-size:10px'>Sandwich consisting ground meat made into a patty, topped with cheese, and placed between two halves of a bun.  </span><html");
        //Set the alignment to center
        burgers.setHorizontalAlignment(JLabel.CENTER);
        burgers.setVerticalAlignment(JLabel.CENTER);
        burgers.setBounds(30, (-20 + 300 + (margin * 3)), 450, 200);        //Set the location (x, y) and size that will be shown for burgers label
        burgers.setIconTextGap(15);                                             //Set the gap bewtween texts that will be shown in steaks label
        //Set the text in burgers label as top (vertically) and right (horizontally)
        burgers.setVerticalTextPosition(JLabel.TOP);
        burgers.setHorizontalTextPosition(JLabel.RIGHT);

        return burgers;     //return the label burgers
    }

    public JLabel createWNums(){        //Create the function createWNums() that return JLabel
        JButton wadd = button.addCart();            //Create the button wadd that run the function addCart() from Button.java
        JButton wremove = button.removeCart();      //Create the button wremove that run the function removeCart() from Button.java

        JLabel wingsnum = new JLabel();     //Create the label wingsnum
        //Create the label wingsprice with text that is helped with html format
        JLabel wingsprice = new JLabel("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ 0.0</p></html>");
        wingsprice.setFont(new Font("Arial", Font.BOLD, 18));       //Set the font for wingsprice label as Arial with size 18
        wingsprice.setBounds(35, -20, 150, 100);              //Set the location (x, y) and size that will be shown for wingsprice label
        wingsnum.setBounds(470, 30, 150, 100);              //Set the location (x, y) and size that will be shown for wingsnum label

        JLabel num = new JLabel(String.valueOf(wcount));                       //Create the label num that will show the text of "wcount"
        num.setFont(new Font("Arial", Font.PLAIN, 10));             //Set the font for num label as Arial with size 10
        num.setPreferredSize(new Dimension(25, 25));             //Set the size of num label
        num.setBounds(50, 70, 25, 25);                      //Set the location (x, y) and size that will be shown for num label
        num.setBorder(new LineBorder(new Color(102, 102, 102), 1)); //Set the color and thickness for num's border
        //Set the alignment to center
        num.setHorizontalAlignment(JLabel.CENTER);
        num.setVerticalAlignment(JLabel.CENTER);

        new Timer(100, new ActionListener(){        //Create a timer with delay 100 milliseconds
            public void actionPerformed(ActionEvent e){   //Function that will be run by the timer
                if (wcount == 0){       //Show the text if wcount is 0
                    wingsprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ 0.0</p></html>");
                } else if (wcount == 1){        //Show the text and calculate the price of wings if wcount is 1
                    wingprices = wcount * wingprice;
                    wingsprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:1'>$ " + String.valueOf(df.format(wingprices)) + "</p></html>");
                } else if (wcount > 1){         //Show the text and calculate the price of wings the price if wcount is greater than 1
                    wingprices = wcount * wingprice;
                    wingsprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:-2'>$ " + String.valueOf(df.format(wingprices)) + "</p></html>");
                }
            }
        }).start();     //Start the timer

        new Timer(100, new ActionListener(){        //Create a timer with delay 100 milliseconds to keep updating the text of num label
            public void actionPerformed(ActionEvent e){
                num.setText(String.valueOf(wcount));
            }
        }).start();     //Start the timer

        wadd.addActionListener(new ActionListener(){        //Set the function that will run if wadd button is clicked

            @Override   //Override the function
            public void actionPerformed(ActionEvent e){
                wcount++;       //Add wcount with 1
                wingprices = wcount * wingprice;    //Calculate the price for wings
                num.setText(String.valueOf(wcount));    //Update the text of num label
                //Update the text of wingsprice
                wingsprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ " + String.valueOf(df.format(wingprices)) + "</p></html>");
            }
        });

        wremove.addActionListener(new ActionListener(){     //Set the function that will run if wremove button is clicked

            @Override   //Override the function
            public void actionPerformed(ActionEvent e){
                if (wcount > 0){    //Run the code below if wcount is greater than 0
                    wcount--;       //reduce wcount with 1
                    wingprices = wcount * wingprice;    //Calculate the price for wings
                    num.setText(String.valueOf(wcount));    //Update the text of num label
                    //Update the text of wingsprice
                    wingsprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ " + String.valueOf(df.format(wingprices)) + "</p></html>");
                }
            }
        });

        wingsnum.add(wadd);     //Add the button wadd to wingsnum label
        wingsnum.add(wremove);  //Add the button wremove to wingsnum label
        wingsnum.add(num);      //Add the num label to wingsnum label
        wingsnum.add(wingsprice);   //Add wingsprice label to wingsnum label

        return wingsnum;    //return the label wingsnum
    }

    public JLabel createWeNums(){       //Create the function createWeNums() that return JLabel
        JButton weadd = button.addCart();       //Create the button weadd that run the function addCart() from Button.java
        JButton weremove = button.removeCart(); //Create the button weremove that run the function removeCart() from Button.java

        JLabel wedgesnum = new JLabel();    //Create the label wedgesnum
        //Create the label wedgesprice with text that is helped with html format
        JLabel wedgesprice = new JLabel("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ 0.0</p></html>");
        wedgesprice.setFont(new Font("Arial", Font.BOLD, 18));      //Set the text of wedgesprice as Arial with size 18
        wedgesprice.setBounds(35, -20, 150, 100);             //Set the location (x, y) and size that will be shown for wedgesprice label
        wedgesnum.setBounds(470, 165, 150, 100);           //Set the location (x, y) and size that will be shown for wedgesnum label

        JLabel num2 = new JLabel(String.valueOf(wecount));              //Create the label num2 that will show the text of "wecount"
        num2.setFont(new Font("Arial", Font.PLAIN, 10));    //Set the text of num2 label as Arial with size 10
        num2.setPreferredSize(new Dimension(25, 25));     //Set the size of num2 label
        num2.setBounds(50, 70, 25, 25);             //Set the location (x, y) and size that will be shown for num2 label
        num2.setBorder(new LineBorder(new Color(102, 102, 102), 1));    //Set the color and thickness for num2's border
        //Set the alignment to center
        num2.setHorizontalAlignment(JLabel.CENTER);
        num2.setVerticalAlignment(JLabel.CENTER);

        new Timer(100, new ActionListener(){        //Create a timer with delay 100 milliseconds
            public void actionPerformed(ActionEvent e){     //Function that will be run by the timer
                if (wecount == 0){      //Show the text if wecount is 0
                    wedgesprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ 0.0</p></html>");
                } else if (wecount == 1){   //Show the text and calculate the price of wedges if wecount is 1
                    wedgeprices = wecount * wedgeprice;
                    wedgesprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:1'>$ " + String.valueOf(df.format(wedgeprices)) + "</p></html>");
                } else if (wecount > 1){    //Show the text and calculate the price of wedges if wecount is greater than 1
                    wedgeprices = wecount * wedgeprice;
                    wedgesprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:-2'>$ " + String.valueOf(df.format(wedgeprices)) + "</p></html>");
                }
            }
        }).start(); //Start the timer

        new Timer(100, new ActionListener(){        //Create a timer with delay 100 milliseconds to keep updating the text of num2 label
            public void actionPerformed(ActionEvent e){
                num2.setText(String.valueOf(wecount));
            }
        }).start(); //Start the timer

        weadd.addActionListener(new ActionListener(){       //Set the function that will run if weadd button is clicked

            @Override   //Override the function
            public void actionPerformed(ActionEvent e){
                wecount++;      //Add wecount with 1
                wedgeprices = wecount * wedgeprice;     //Calculate the price of wedges
                num2.setText(String.valueOf(wecount));  //Update the text of num2 label
                //Update the text of wedgesprice label
                wedgesprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:1'>$ " + String.valueOf(df.format(wedgeprices)) + "</p></html>");
            }
        });

        weremove.addActionListener(new ActionListener(){    //Set the function that will run if weremove button is clicked

            @Override   //Override the function
            public void actionPerformed(ActionEvent e){
                if (wecount > 0){   //Run the code below if wecount is greater than 0
                    wecount--;  //Reduce wecount with 1
                    wedgeprices = wecount * wedgeprice;     //Calculate the price of wedges
                    num2.setText(String.valueOf(wecount));  //Update the text of num2 label
                    //Update the text of wedgesprice label
                    wedgesprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:1'>$ " + String.valueOf(df.format(wedgeprices)) + "</p></html>");
                }
            }
        });
        
        wedgesnum.add(num2);        //Add num2 label into wedgesnum label
        wedgesnum.add(wedgesprice); //Add wedgesprice label into wedgesnum label
        wedgesnum.add(weadd);       //Add weadd button into wedgesnum label
        wedgesnum.add(weremove);    //Add weremove button into wedgesnum label

        return wedgesnum;   //Return the label wedgesnum
    }

    public JLabel createSNums(){        //Create the function createSNums() that return JLabel
        JButton sadd = button.addCart();        //Create the button sadd that run the function addCart() from Button.java
        JButton sremove = button.removeCart();  //Create the button sremove that run the function removeCart() from Button.java

        JLabel steaksnum = new JLabel();        //Create the label steaksnum
        //Create the label steaksprice with text that is helped by html format
        JLabel steaksprice = new JLabel("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ 0.0</p></html>");
        steaksprice.setFont(new Font("Arial", Font.BOLD, 18));      //Set the text of steaksprice as Arial with size 18
        steaksprice.setBounds(35, -20, 150, 100);             //Set the location (x, y) and size that will be shown for steaksprice label
        steaksnum.setBounds(470, 300, 150, 100);           //Set the location (x, y) and size that will be shown for steaksnum label

        JLabel num3 = new JLabel(String.valueOf(scount));       //Create the label num3 that will show the text "scount"
        num3.setFont(new Font("Arial", Font.PLAIN, 10));        //Set the text of num3 label as Arial with size 10
        num3.setPreferredSize(new Dimension(25, 25));        //Set the size of num3 label
        num3.setBounds(50, 70, 25, 25);                 //Set the location (x, y) and size that will be shown for num3 label
        num3.setBorder(new LineBorder(new Color(102, 102, 102), 1));    //Set the color and thickness of num3's border
        //Set the alignment to center
        num3.setHorizontalAlignment(JLabel.CENTER);
        num3.setVerticalAlignment(JLabel.CENTER);

        new Timer(100, new ActionListener(){        //Create a timer with delay 100 milliseconds
            public void actionPerformed(ActionEvent e){     //Function that will be run by the timer
                if (scount == 0){       //Show the text if scount is 0
                    steaksprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ 0.0</p></html>");
                } else if (scount >= 1){    //Show the text and calculate the price of steaks if scount is greater or equal to 1
                    steakprices = scount * steakprice;
                    steaksprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:-2'>$ " + String.valueOf(df.format(steakprices)) + "</p></html>");
                }
            }
        }).start(); //Start the timer

        new Timer(100, new ActionListener(){        //Create a timer with delay 100 milliseconds to keep updating the text of num3 label
            public void actionPerformed(ActionEvent e){
                num3.setText(String.valueOf(scount));
            }
        }).start(); //Start the timer

        sadd.addActionListener(new ActionListener(){        //Set the function that will run if sadd button is clicked

            @Override   //Override the function
            public void actionPerformed(ActionEvent e){
                scount++;       //Add scount with 1
                steakprices = scount * steakprice;  //Calculate the price for steak
                num3.setText(String.valueOf(scount));   //Update the text of num3 label
                //Update the text of steaksprice label
                steaksprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ " + String.valueOf(df.format(steakprices)) + "</p></html>");
            }
        });

        sremove.addActionListener(new ActionListener(){     //Set the function that will run if sremove button is clicked

            @Override   //Override the function
            public void actionPerformed(ActionEvent e){
                if (scount > 0){    //Run the code below if scount is greater than 0
                    scount--;   //Reduce scount with 1
                    steakprices = scount * steakprice;      //Calculate the price for steak
                    num3.setText(String.valueOf(scount));   //Update the text of num3 label
                    //Update the text of steaksprice label
                    steaksprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ " + String.valueOf(df.format(steakprices)) + "</p></html>");
                }
            }
        });
        
        steaksnum.add(num3);        //Add num3 label to steaksnum label
        steaksnum.add(steaksprice); //Add steaksprice label to steaksnum label
        steaksnum.add(sadd);        //Add sadd button to steaksnum label
        steaksnum.add(sremove);     //Add sremove button to steaksnum label

        return steaksnum;   //Return the label steaksnum
    }

    public JLabel createBNums(){        //Create the function createBNums() that return JLabel
        JButton badd = button.addCart();        //Create the button badd that run the function addCart() from Button.java
        JButton bremove = button.removeCart();  //Create the button bremove that run the function removeCart() from Button.java

        JLabel burgersnum = new JLabel();       //Create the label burgersnum
        //Create the label burgersprice with text that is help by html format
        JLabel burgersprice = new JLabel("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ 0.0</p></html>");
        burgersprice.setFont(new Font("Arial", Font.BOLD, 18));     //Set the text of burgersprice label as Arial with size 18
        burgersprice.setBounds(35, -20, 150, 100);            //Set the location (x, y) and size that will be shown for burgersprice label
        burgersnum.setBounds(470, 435, 150, 100);          //Set the location (x, y) and size that will be shown for burgersnum label

        JLabel num4 = new JLabel(String.valueOf(scount));       //Create the label num4 that will show the text "scount"
        num4.setFont(new Font("Arial", Font.PLAIN, 10));        //Set the text of num4 label as Arial with size 10
        num4.setPreferredSize(new Dimension(25, 25));       //Set the size of num4 label
        num4.setBounds(50, 70, 25, 25);                //Set the location (x, y) and size that will be shown for num4 label
        num4.setBorder(new LineBorder(new Color(102, 102, 102), 1));    //Set the color and thickness of num4's border
        //Set the alignment to center
        num4.setHorizontalAlignment(JLabel.CENTER);
        num4.setVerticalAlignment(JLabel.CENTER);

        new Timer(100, new ActionListener(){        //Create a timer with delay 100 milliseconds
            public void actionPerformed(ActionEvent e){     //Function that will be run by the timer
                if (bcount == 0){   //Show the text if bcount is 0
                    burgersprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ 0.0</p></html>");
                } else if (bcount >= 1){        //Show the text and calculate the price for burgers if bcount is greater or equal to 1
                    burgerprices = bcount * burgerprice;
                    burgersprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:-2'>$ " + String.valueOf(df.format(burgerprices)) + "</p></html>");
                }
            }
        }).start(); //Start the timer

        new Timer(100, new ActionListener(){        //Create a timer with delay 100 milliseconds to keep updating the text of num4 label
            public void actionPerformed(ActionEvent e){
                num4.setText(String.valueOf(bcount));
            }
        }).start(); //Start the timer

        badd.addActionListener(new ActionListener(){    //Set the function that will run if badd button is clicked

            @Override   //Override the function
            public void actionPerformed(ActionEvent e){
                bcount++;   //Add bcount with 1
                burgerprices = bcount * burgerprice;    //Calculate the price for burgers
                num4.setText(String.valueOf(bcount));   //Update the text of num4 label
                //Update the text of burgersprice label
                burgersprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ " + String.valueOf(df.format(burgerprices)) + "</p></html>");
            }
        });

        bremove.addActionListener(new ActionListener(){ //Set the function that will run if bremove button is clicked

            @Override   //Override the function
            public void actionPerformed(ActionEvent e){
                if (bcount > 0){    //Run the code below if bcount is greater than 0
                    bcount--;   //Reduce bcount with 1
                    burgerprices = bcount * burgerprice;    //Calculate the price of burgers
                    num4.setText(String.valueOf(bcount));   //Update the text of num4 label
                    //Update the text of burgersprice label
                    burgersprice.setText("<html><p style='margin-left:2'>Price:</p><p style='margin-top:10;margin-left:5'>$ " + String.valueOf(df.format(burgerprices)) + "</p></html>");
                }
            }
        });
        
        burgersnum.add(num4);           //Add num4 label to burgersnum label
        burgersnum.add(burgersprice);   //Add burgersprice label to burgersnum label
        burgersnum.add(badd);           //Add badd button to burgersnum label
        burgersnum.add(bremove);        //Add bremove button to burgersnum label

        return burgersnum;  //Return the label burgersnum
    }

    public JScrollPane panelCart(){     //Create the function panelCart() that return JScrollPane
        JPanel pcart = new JPanel();    //Create pcart panel
        pcart.setPreferredSize(new Dimension(600, 700));    //Set the size for pcart panel
        pcart.setBackground(new Color(228, 233, 236));      //Set the background color for pcart panel
        pcart.setLayout(null);      //Set the layout of pcart panel as null
        //Create scart scroll panel that has been add with pcart panel. Set the vertical scrollbar to always shown and set the horizontal scrollbar to never
        JScrollPane scart = new JScrollPane(pcart, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scart.setPreferredSize(new Dimension(600, 600));    //Set the size of scart scroll panel
        
        JPanel check = new JPanel();    //Create the panel check
        check.setPreferredSize(new Dimension(600, 100));    //Set the size of check panel
        check.setBounds(0, 600, 600, 100);      //Set the location (x, y) and size that will be shown for check panel
        check.setBackground(new Color(228, 233, 236));     //Set the background color for check panel
        check.setLayout(null);                                //Set the layout of check panel as null
        pcart.add(check, BorderLayout.PAGE_END);                  //Add check panel to pcart panel and set it shown at the end of the page

        JLabel tprice = new JLabel();       //Create tprice label
        //Set the text of tprice
        tprice.setText("<html><span style='font-size:14px'>Total : " + String.valueOf(df.format(total)) + "</span><html>");
        tprice.setBounds(30, 0, 300, 50);   //Set the location (x, y) and size that will be shown for tprice label
        JButton checkout = new JButton("Checkout");     //Create the checkout button with text Checkout
        checkout.setFont(new Font("Arial", Font.PLAIN, 30));    //Set the text of checkout button as Arial with size 30
        checkout.setFocusPainted(false);                    //To remove the blue focus ring around checkout button
        checkout.setBackground(new Color(153, 153, 153));       //Set the background color of checkout button
        checkout.setBounds(400, 0, 170, 50);        //Set the location (x, y) and size that will be shown for checkout button

        new Timer(100, new ActionListener(){        //Create a timer with delay 100 milliseconds
            public void actionPerformed(ActionEvent e){     //Function that will be run by the timer
                if (wcount > 0 && checkItem(ilist, createWings())){     //Check if wcount is greater than 0 and function checkItem() return true
                    "".isEmpty();   //do nothing
                } else if (wcount > 0){     //Check if wcount is greater than 0
                    qcount++;   //Add qcount with 1
                    ilist.put(qcount, createWings());   //Put qcount as key and createWings() function as value in ilist map
                    nlist.put(qcount, createWNums());   //Put qcount as key and createWNums() function as value in nlist map
                } else if (wcount == 0 && checkItem(ilist, createWings())){     //Check if wcount is equal to 0 and function checkItem() return true
                    for (Map.Entry<Integer, JLabel> entry : ilist.entrySet()){  //Iterate the key and value of ilist to entry variable
                        if (entry.getValue().getText() == createWings().getText()){     //Check if the text of entry's value is equal to the text function createWings()
                            rilist.add(ilist.remove(entry.getKey()));   //Remove the value by key from ilist and added it to rilist arraylist
                            rnlist.add(nlist.remove(entry.getKey()));   //Remove the value by key from nlist and added it to rnlist arraylist
                            qcount--;   //Reduce qcount with 1
                        }
                    }
                }
                
                if (wecount > 0 && checkItem(ilist, createWedges())){   //Check if wecount is greater than 0 and function checkItem() return true
                    "".isEmpty();   //do nothing
                } else if (wecount > 0){    //Check if wecount is greater than 0
                    qcount++;   //Add qcount with 1
                    ilist.put(qcount, createWedges());  //Put qcount as key and createWedges() function as value in ilist map
                    nlist.put(qcount, createWeNums());  //Put qcount as key and createWeNums() function as value in nlist map
                } else if (wecount == 0 && checkItem(ilist, createWedges())){   //Check if wecount is equal to 0 and function checkItem() return true
                    for (Map.Entry<Integer, JLabel> entry : ilist.entrySet()){  //Iterate the key and value of ilist to entry variable
                        if (entry.getValue().getText() == createWedges().getText()){    //Check if the text of entry's value is equal to the text function createWedges()
                            rilist.add(ilist.remove(entry.getKey()));   //Remove the value by key from ilist and added it to rilist arraylist
                            rnlist.add(nlist.remove(entry.getKey()));   //Remove the value by key from nlist and added it to rnlist arraylist
                            qcount--;   //Reduce qcount with 1
                        }
                    }
                }
                
                if (scount > 0 && checkItem(ilist, createSteak())){     //Check if scount is greater than 0 and function checkItem() return true
                    "".isEmpty();   //do nothing
                } else if (scount > 0){     //Check if scount is greater than 0
                    qcount++;   //Add qcount with 1
                    ilist.put(qcount, createSteak());   //Put qcount as key and createSteak() function as value in ilist map
                    nlist.put(qcount, createSNums());   //Put qcount as key and createSNums() function as value in nlist map
                } else if (scount == 0 && checkItem(ilist, createSteak())){     //Check if scount is equal to 0 and function checkItem() return true
                    for (Map.Entry<Integer, JLabel> entry : ilist.entrySet()){  //Iterate the key and value of ilist to entry variable
                        if (entry.getValue().getText() == createSteak().getText()){     //Check if the text of entry's value is equal to the text function createSteak()
                            rilist.add(ilist.remove(entry.getKey()));   //Remove the value by key from ilist and added it to rilist arraylist
                            rnlist.add(nlist.remove(entry.getKey()));   //Remove the value by key from nlist and added it to rnlist arraylist
                            qcount--;   //Reduce qcount with 1
                        }
                    }
                }
                
                if (bcount > 0 && checkItem(ilist, createBurger())){    //Check if bcount is greater than 0 and function checkItem() return true
                    "".isEmpty();   //do nothing
                } else if (bcount > 0){     //Check if bcount is greater than 0
                    qcount++;   //Add qcount with 1
                    ilist.put(qcount, createBurger());  //Put qcount as key and createBurger() function as value in ilist map
                    nlist.put(qcount, createBNums());   //Put qcount as key and createBNums() function as value in nlist map
                } else if (bcount == 0 && checkItem(ilist, createBurger())){    //Check if bcount is equal to 0 and function checkItem() return true
                    for (Map.Entry<Integer, JLabel> entry : ilist.entrySet()){  //Iterate the key and value of ilist to entry variable
                        if (entry.getValue().getText() == createBurger().getText()){    //Check if the text of entry's value is equal to the text function createBurger()
                            rilist.add(ilist.remove(entry.getKey()));   //Remove the value by key from ilist and added it to rilist arraylist
                            rnlist.add(nlist.remove(entry.getKey()));   //Remove the value by key from nlist and added it to rnlist arraylist
                            qcount--;   //Reduce qcount with 1
                        }
                    }
                }
            }
        }).start(); //Start the timer

        new Timer(100, new ActionListener(){        //Create a timer with delay 100 milliseconds
            public void actionPerformed(ActionEvent e){     //Function that will be run by the timer
                for (int i = 0; i < ilist.size();){     //Create a loop that has the condition i has to be less than the size of ilist
                    if (ilist.get(i + 1) == null){      //Do nothing if the value is null
                        "".isEmpty();
                    } else {    //Or else
                        ilist.get(i + 1).setBounds(30, -20 + margin2, 450, 200);    //Set the value's the location (x, y) and size that will be shown
                        nlist.get(i + 1).setBounds(470, 30 + margin2, 150, 100);    //Set the value's the location (x, y) and size that will be shown
                        pcart.add(ilist.get(i + 1));    //Add the value to pcart panel
                        pcart.add(nlist.get(i + 1));    //Add the value to pcart panel
                        margin2 += 135; //Add margin2 with 135
                        i++;    //Add i with 1
                    }                    
                }
                margin2 = 0;    //Set margin2 into 0
            }
        }).start(); //Start the timer

        new Timer(100, new ActionListener(){        //Create a timer with delay 100 milliseconds
            public void actionPerformed(ActionEvent e){     //Function that will be run by the timer
                for (int i = 0; i < rilist.size(); i++){    //Create a loop that has the condition i has to be less than the size of rilist
                    if (rilist.isEmpty() == false){     //Run the code below if rilist is not empty
                        pcart.remove(rilist.get(i));    //Remove the element of rilist from pcart
                        pcart.remove(rnlist.get(i));    //Remove the element of rnlist from pcart
                        rilist.clear();     //Clear rilist ArrayList
                        rnlist.clear();     //Clear rnlist ArrayList
                    }
                }
            }
        }).start(); //Start the timer

        Food.timer = new Timer(3000, new ActionListener(){      //Create a timer with delay 100 milliseconds
            public void actionPerformed(ActionEvent e){                 //Function that will be run by the timer
                    if (ilist.size() != 0){     //Run the code below if the size of ilist is not 0
                        checkout.addActionListener(new ActionListener(){    //Set the function that will run if checkout button is clicked

                            @Override   //Override the function
                            public void actionPerformed(ActionEvent e){
                                if (checkout.isEnabled()){      //Run the code below if checkout button is enabled
                                    Window newWindow = new Window();    //Create newWindow variable from Window.java
                                    newWindow.createWindow();           //Run the function createWindow from Window.java
                                    checkout.setEnabled(false);      //Disable the checkout button
                                }
                            }
                        });
                    } else {
                        for (ActionListener current : checkout.getActionListeners()){   //Iterate the actionlistener to current variable
                            checkout.removeActionListener(current); //Remove the actionlistener in checkout button
                        }
                        checkout.setEnabled(true);  //Enable the checkout button
                } 
            }
        });
        timer.start();  //Start the timer

        new Timer(100, new ActionListener(){        //Create a timer with delay 100 milliseconds
            public void actionPerformed(ActionEvent e){     //Function that will be run by the timer
                total = wingprices + wedgeprices + steakprices + burgerprices;      //Calculate the total price
                //Update the text of tprice label
                tprice.setText("<html><span style='font-size:14px'>Total : " + String.valueOf(df.format(total)) + "</span><html>");
                scart.repaint();    //Redraw the scart panel
            }
        }).start(); //Start the timer

        check.add(tprice, BorderLayout.PAGE_START);     //Add tprice label at the start of check label
        check.add(checkout);                            //Add checkout button to check label

        return scart;   //Return the panel scart
    }

    public boolean checkItem(Map<Integer, JLabel> list, JLabel label){  //Create a function to check if an item is in the map
        for (int i = 0; i < list.size(); i++){      //Create a for loop that has a condition i has to be less than the size of the map and keep incrementing the i
            if (ilist.get(i + 1).getText() == label.getText()){     //Return true if the text of ilist's value is equal to the text of label
                return true;
            }
        }
        return false;   //Or else return false
    }
}
