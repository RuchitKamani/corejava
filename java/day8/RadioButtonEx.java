package tops.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx implements ItemListener
{
	
	JFrame frame;
	JRadioButton rb1,rb2;
	//JButton btn;
	
	public RadioButtonEx()
	{
		// TODO Auto-generated constructor stub
	
		frame=new JFrame();

		rb1=new JRadioButton("Java");
		rb1.setBounds(111, 30, 97, 23);
		
		rb2=new JRadioButton("Android");
		rb2.setBounds(111, 80, 97, 23);	
		
		ButtonGroup bg =new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		rb1.addItemListener(this);
		rb2.addItemListener(this);
		
		frame.add(rb1);
		frame.add(rb2);
		//frame.add(btn);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	
	}

	public static void main(String[] args) {
		
		
		new RadioButtonEx();
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		// TODO Auto-generated method stub
			if(e.getSource()==rb1)
			{
				System.out.println("Java");
			}
			if(e.getSource()==rb2)
			{
				System.out.println("Android");
			}
	}
	
}
