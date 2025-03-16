import java.awt.*;
import javax.swing.*;
class GridLayoutEx extends JFrame
{
GridLayoutEx()
{

Container c=getContentPane();
GridLayout obj=new GridLayout(2,3,50,50);
//Creating Grid layout with 2 rows and 2 coloumns and 50px.

c.setLayout(obj);

JButton b1,b2,b3,b4,b5;
b1=new JButton("Button 1:");
b2=new JButton("Button 2:");
b3=new JButton("Button 3:");
b4=new JButton("Button 4:");
b5=new JButton("Button 5:");

c.add(b1);
c.add(b2);
c.add(b3);
c.add(b4);
c.add(b5);
}

public static void main(String args[])
{

GridLayoutEx obj=new GridLayoutEx();
obj.setSize(500,400);
obj.setTitle("IOT Grid Layout");
obj.setVisible(true);

obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}