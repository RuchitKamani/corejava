package tops.example;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx 
{
	JFrame frame;
	JMenu menu,submenu;
	JMenuBar menuBar;
	JMenuItem i1,i2,i3,i4,i5;
	
	public MenuEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame=new JFrame();
		menuBar=new JMenuBar();
		menu=new JMenu("menu");
		submenu=new JMenu("submenu");
		i1=new JMenuItem("Item 1");
		i2=new JMenuItem("Item 2");
		i3=new JMenuItem("Item 3");
		i4=new JMenuItem("Item 4");
		i5=new JMenuItem("Item 5");
		
		
		menuBar.add(menu);
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(submenu);
		submenu.add(i4);
		submenu.add(i5);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setJMenuBar(menuBar);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new MenuEx();
	}
}
