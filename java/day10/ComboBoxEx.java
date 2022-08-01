package tops.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;

public class ComboBoxEx extends JFrame
{
	
		JComboBox cb;
		String languages[]={"C","C++","C#","Java","PHP"};   
	public ComboBoxEx()
	{
		// TODO Auto-generated constructor stub
		
		cb=new JComboBox<>(languages);
		
		cb.setBounds(50, 100,90,20); 
		
		 	final JLabel label = new JLabel();          
		    label.setHorizontalAlignment(JLabel.CENTER);  
		    label.setSize(400,100);  
		    
		    JButton b=new JButton("Show");  
		    b.setBounds(200,100,75,20);  
		    b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
					
					String data = "Programming language Selected: "   
							   + cb.getItemAt(cb.getSelectedIndex());  
							label.setText(data);  
					
				}
			});
		    
		add(cb);
		add(label);
		add(b);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	
	}
	
	public static void main(String[] args) 
	{
		
		new ComboBoxEx();
		
	}
}
