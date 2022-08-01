package tops.example;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameExample 
{
	JFrame frame;//declaration
	JButton btn;
	JLabel l1;
	JTextField t1;
	
	
	public FrameExample() 
	{
		// TODO Auto-generated constructor stub
		
		frame=new JFrame("Tops App");
		
		btn=new JButton("Submit");
		btn.setBounds(165, 111, 113, 48);
		
		l1=new JLabel("Application");
		l1.setBounds(197, 60, 86, 14);
	
		t1 =new JTextField();
		t1.setBounds(175, 170, 86, 20);
		
		frame.add(btn);
		frame.add(l1);
		frame.add(t1);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
	public static void main(String[] args) 
	{
		new FrameExample();
	}
}
