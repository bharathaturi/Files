import java.awt.*;
import javax.swing.*;
class GridBagLayoutEx extends JFrame
{

GridBagLayoutEx()
{

Container c=getContentPane();
GridBagLayout gb=new GridBagLayout();
c.setLayout(gb);

//Creating GridBagConstraint object.

GridBagConstraints gc=new GridBagConstraints(); 


JButton b1,b2,b3,b4,b5;
b1=new JButton("Button 1:");
b2=new JButton("Button 2:");
b3=new JButton("Button 3:");
b4=new JButton("Button 4:");
b5=new JButton("Button 5:");

//for all buttons, use horizontal filling.
gc.fill=GridBagConstraints.HORIZONTAL;
gc.gridx=0;
gc.gridy=0;

gc.weightx=0.7;
gc.weighty=0.7;

gb.setConstraints(b1,gc);

c.add(b1);
//Display button at x,y coordinates at 1,0.
gc.gridx=1;
gc.gridy=0;

gb.setConstraints(b2,gc);
c.add(b2);
gc.gridx=2;
gc.gridy=0;

gb.setConstraints(b3,gc);
c.add(b3);
gc.gridx=0;
gc.gridy=1;

gb.setConstraints(b4,gc);
c.add(b4);
gc.gridx=1;
gc.gridy=2;

gb.setConstraints(b5,gc);
c.add(b5);
gc.gridx=0;
gc.gridy=1;

}

public static void main(String args[])
{
GridBagLayoutEx obj=new GridBagLayoutEx();
obj.setSize(400,400);
obj.setTitle("IOT GridBag Layout");
obj.setVisible(true);

obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}