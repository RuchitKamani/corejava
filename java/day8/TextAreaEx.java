package tops.example;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TextAreaEx 
{
	JFrame frame;
	JTextArea ta;
	JButton btn;
	JLabel l1,l2;
	
	public TextAreaEx() 
	{
		frame=new JFrame("My App");
		
		ta=new JTextArea();
		ta.setBounds(47, 11, 325, 110);
		
		btn=new JButton("Count");
		btn.setBounds(170, 133, 89, 23);
		
		l1=new JLabel();
		l1.setBounds(98, 185, 96, 14);
		
		l2=new JLabel();
		l2.setBounds(285, 185, 96, 14);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
				if(e.getSource()==btn)
				{
					
					String data=ta.getText();
					String words[]=data.split("\\s");
					
					l1.setText("Characters :"+data.length());
					l2.setText("Words: "+words.length);
					
					
				}
				
			}
		});
		
		
		frame.add(ta);
		frame.add(btn);
		frame.add(l1);
		frame.add(l2);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		
		new TextAreaEx();
		
	}
}
