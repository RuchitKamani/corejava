package tops.example;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class EventEx implements ActionListener
{
	JFrame frame;
	JButton b1,b2,b3,b4,b5,b6;
	
	public EventEx() 
	{
		
		frame=new JFrame("My App");
		
		b1 =new JButton("Button 1");
		
		b2 =new JButton("Button 2");
		
		b3 =new JButton("Button 3");
		
		b4 =new JButton("Button 4");
		
		/*b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		*/
		
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		

		
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	
	}
	public static void main(String[] args) 
	{
		new EventEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			new Frame1();
		}
		if(e.getSource()==b2)
		{
			
		}
		if(e.getSource()==b3)
		{
			
		}
		if(e.getSource()==b4)
		{
			
		}
		
	}
}
