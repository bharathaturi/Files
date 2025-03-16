import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseEventsEx extends JFrame implements MouseListener,MouseMotionListener
{
Container c;
JTextArea ta;
String str="";
int x,y;

MouseEventsEx()
{
c=getContentPane();//to create content pane.
c.setLayout(new FlowLayout());
ta=new JTextArea("Click on Mouse",15,20);
ta.setFont(new Font("Arial ",Font.BOLD, 30));

c.add(ta);

ta.addMouseListener(this);
ta.addMouseMotionListener(this);
}

	public void mouseClicked(MouseEvent me)
	{
	int i=me.getButton();
	if(i==1)
	str += "Clicked Button: Left";
	else if(i==2)
	str += "Clicked Button: Middle";
	else if(i==3)
	str += "Clicked Button: Right";
	this.display();
	}
	public void mouseEntered(MouseEvent me)
	{
	str += "Mouse Entered";
	this.display();
	}
	
	public void mouseExited(MouseEvent me)
	{
	str += "Mouse Exited";
	this.display();
	}

	public void mousePressed(MouseEvent me)
	{
	x=me.getX();
	y=me.getY();
	str += "Mouse Pressed at:"+x+y;
	this.display();
	}

	public void mouseReleased(MouseEvent me)
	{
	x=me.getX();
	y=me.getY();
	str += "Mouse Released at:"+x+y;
	this.display();
	}

	public void mouseDragged(MouseEvent me)
	{
	x=me.getX();
	y=me.getY();
	str += "Mouse Dragged at:"+x+y;
	this.display();
	}

	public void mouseMoved(MouseEvent me)
	{
	x=me.getX();
	y=me.getY();
	str += "Mouse Moved at:"+x+y;
	this.display();
	}

	public void display()
	{
	ta.setText(str);
	str="";
	}

public static void main(String args[])
{
MouseEventsEx obj=new MouseEventsEx();
obj.setSize(400,400);

obj.setVisible(true);

obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//For closing Window in JFrame.
}
}