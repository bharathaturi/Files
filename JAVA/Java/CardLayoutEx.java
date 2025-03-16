import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class CardLayoutEx extends JFrame implements ActionListener
{
JButton b1,b2,b3,b4;
Container c;
CardLayout cl;

CardLayoutEx()
{
 c=getContentPane();

cl=new CardLayout(50,10);

c.setLayout(cl);

b1=new JButton("Button 1:");
b2=new JButton("Button 2:");
b3=new JButton("Button 3:");
b4=new JButton("Button 4:");

c.add("First Card",b1);
c.add("Second Card",b2);
c.add("Third Card",b3);
c.add("Fourth Card",b4);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{
cl.next(c);
cl.show(c, "Third Card");
}

public static void main(String args[])
{
CardLayoutEx obj1=new CardLayoutEx();
obj1.setSize(400,400);
obj1.setTitle("IOT Card Layout");
obj1.setVisible(true);

obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//For closing Window in JFrame.
}
}