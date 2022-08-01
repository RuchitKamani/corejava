import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Test implements ActionListener
{
	JFrame frame;
	JButton insertbtn,viewbtn,updatebtn,deletebtn;
	public Test() 
	{
		// TODO Auto-generated constructor stub
		
		frame=new JFrame();
		
		
		insertbtn=new JButton("INSERT");
		viewbtn=new JButton("VIEW");
		updatebtn=new JButton("UPDATE");
		deletebtn=new JButton("DELETE");
		
		
		insertbtn.addActionListener(this);
		viewbtn.addActionListener(this);
		
		
		frame.add(insertbtn);
		frame.add(viewbtn);
		frame.add(updatebtn);
		frame.add(deletebtn);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
		
	}
	
	public static void main(String[] args)
	{
		new Test();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Alloperations a =new Alloperations();
		
		if(e.getSource()==insertbtn)
		{
			a.insertdata();
		}
		if(e.getSource()==viewbtn)
		{
			a.viewdata();
		}
		
	}
	
}

class Alloperations
{
	
	JFrame insertframe;
	JTextField tname,tsurname;
	JButton btnadd;
	
	
	public void insertdata()
	{
		
		insertframe=new JFrame();
		
		tname =new JTextField(20);
		tsurname =new JTextField(20);
		btnadd=new JButton("Add");
		
		btnadd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				String host="jdbc:mysql://localhost:3306/";
				String db="crud8";
				String url=host+db;
				
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con= DriverManager.getConnection(url,"root","");
					
					String name=tname.getText().toString();
					String surname=tsurname.getText().toString();
					
					
					String sql="insert into info values(null,'"+name+"','"+surname+"')";
					
					Statement stmt=con.createStatement();
					
					int data=stmt.executeUpdate(sql);
					
					if(data>0)
					{
						System.out.println("Success");
						insertframe.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
					
					
				
				} 
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
				
				
			}
		});
		
		
		insertframe.add(tname);
		insertframe.add(tsurname);
		insertframe.add(btnadd);
		insertframe.setSize(500,500);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
			
	}
	public void viewdata()
	{
		
		String host="jdbc:mysql://localhost:3306/";
		String db="crud8";
		String url=host+db;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection(url,"root","");
			
			String sql="select * from info";
			
			Statement stmt=con.createStatement();
			
			ResultSet set=stmt.executeQuery(sql);
		
			while(set.next())
			{
						int id=set.getInt(1);
						String name=set.getString(2);
						String surname=set.getString(3);
						
						
						System.out.println(id+" "+name+" "+surname);			
			}
			
			
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
}
