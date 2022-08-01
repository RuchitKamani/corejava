package tops.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx implements ItemListener
{
	
	JFrame frame;
	JCheckBox chk1,chk2;
	//JButton btn;
	
	public CheckBoxEx()
	{
		// TODO Auto-generated constructor stub
	
		frame=new JFrame();
		
		chk1=new JCheckBox("Java");
		chk1.setBounds(111, 30, 97, 23);
		
		chk2=new JCheckBox("Android");
		chk2.setBounds(111, 80, 97, 23);	
		
		
		chk1.addItemListener(this);
		chk2.addItemListener(this);
		
		//btn=new JButton("Submit");
	//	btn.setBounds(111, 130, 97, 23);
		
		//btn.addActionListener(this);
		
		frame.add(chk1);
		frame.add(chk2);
		//frame.add(btn);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		
		new CheckBoxEx();
		
	}
	/*@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==btn)
		{
			if(chk1.isSelected())
			{
				System.out.println("Java Checked");
			}
			if(chk2.isSelected())
			{
				System.out.println("Android Checked");
			}
		}
	}*/
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==chk1)
		{
			if(chk1.isSelected())
			{
				System.out.println("Java Checked");
			}
		}
		if(e.getSource()==chk2)
		{
			if(chk2.isSelected())
			{
				System.out.println("Android Checked");
			}
		}
	}
}
