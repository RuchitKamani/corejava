package tops.example;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Frame1 
{
	
	JFrame frame;
	
	public Frame1() 
	{
		frame=new JFrame("My App");
	
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Frame1();
	}
}
