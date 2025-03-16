import java.awt.*;
import java.awt.event.*;
class Myclass implements WindowListener
{
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}
class MyFrame extends Frame
{
	public static void main(String[] args)
	{
		MyFrame f = new MyFrame();
		f.setTitle("My AWT Frame");
		f.setSize(400,400);
		f.setVisible(true);
		f.addWindowListener(new Myclass());
	}
}
