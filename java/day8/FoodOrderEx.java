package tops.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FoodOrderEx implements ActionListener
{
	
		JFrame frame;
	    JLabel l;  
	    JCheckBox cb1,cb2,cb3;  
	    JButton b;  
	public FoodOrderEx()
	{
		// TODO Auto-generated constructor stub
			frame=new JFrame();
			
		 	l=new JLabel("Food Ordering System");  
	        l.setBounds(50,50,300,20);  
	        
	        cb1=new JCheckBox("Pizza @ 100");  
	        cb1.setBounds(100,100,150,20);  
	        
	        cb2=new JCheckBox("Burger @ 30");  
	        cb2.setBounds(100,150,150,20);  
	        
	        cb3=new JCheckBox("Tea @ 10");  
	        cb3.setBounds(100,200,150,20);  
	        
	        b=new JButton("Order");  
	        b.setBounds(100,250,80,30);  
	        
	        b.addActionListener(this);
		
	        frame.add(l);
	        frame.add(cb1);
	        frame.add(cb2);
	        frame.add(cb3);
	        frame.add(b);
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	
	}
	public static void main(String[] args) 
	{
		new FoodOrderEx();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		
		float amount=0;  
        String msg="";
		
		
		if(cb1.isSelected())
		{
			amount+=100;
			msg+="Pizza rs.100 \n";
			
			
		}
		
		if(cb2.isSelected())
		{
			amount+=30;
			msg+="Burger rs.30 \n";
			
			
		}
		
		if(cb3.isSelected())
		{
			amount+=10;
			msg+="Tea rs.10 \n";
			
			
		}
		
		
		msg+="-----------------\n";  
		
		JOptionPane.showMessageDialog(frame,msg+"Total: "+amount);
		
		
		
		
		
	}
}
