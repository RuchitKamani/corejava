package tops.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class EditMenuEx implements ActionListener
{
	
	JFrame frame;
	JMenuBar menuBar;
	JMenu Edit;
	JMenuItem cut,copy,paste,selectall;
	JTextArea ta;    
	public EditMenuEx() 
	{
		// TODO Auto-generated constructor stub
	
			frame= new JFrame();
			menuBar=new JMenuBar();
			Edit=new JMenu("Edit");
			cut=new JMenuItem("Cut");
			copy=new JMenuItem("Copy");
			paste=new JMenuItem("Paste");
			selectall=new JMenuItem("SelectAll");
			ta=new JTextArea();    
			ta.setBounds(5,5,360,320);  
			
			cut.addActionListener(this);
			copy.addActionListener(this);
			paste.addActionListener(this);
			selectall.addActionListener(this);
			
			Edit.add(cut);
			Edit.add(copy);
			Edit.add(paste);
			Edit.add(selectall);
			menuBar.add(Edit);			
			frame.setSize(500,500);
			frame.add(ta);
			frame.setJMenuBar(menuBar);
			frame.setLayout(null);
			frame.setVisible(true);
	}
	public static void main(String[] args)
	{
		new EditMenuEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==cut)
		{
			ta.cut();
		}
		if(e.getSource()==copy)
		{
			ta.copy();
		}
		if(e.getSource()==paste)
		{
			ta.paste();
		}
		if(e.getSource()==selectall)
		{
			ta.selectAll();
		}
	}
}
