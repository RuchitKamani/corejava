package tops.example;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPaneEx 
{
	JFrame f;
	
	public OptionPaneEx() 
	{
		f=new JFrame();
		String name=JOptionPane.showInputDialog(f,"Enter Name");
		System.out.println("Your Name is "+name);
	}
	public static void main(String[] args)
	{
		new OptionPaneEx();
	}
}
