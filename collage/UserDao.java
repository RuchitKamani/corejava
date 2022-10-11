
import java.sql.*;
import java.util.*;
import java.util.List;

import com.model.*;
import com.mysql.jdbc.*;

public class UserDao 
{
	public static Connection getconnect()
	{
		Connection con=null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp123","root",""); 
		}
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		
		
		return con;
	}
	public static int savedata(Person m)
	{
		Connection con=UserDao.getconnect();
		int status=0;
		try 
		{
			String sql="insert into person(name,surname) values (?,?)";
			PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, m.getName());
			ps.setString(2, m.getSurname());
			 status=ps.executeUpdate();
		
			
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}

	public static Person getemployeebyid(int id)
	{
		
		Person m =new Person();
		
			Connection con =UserDao.getconnect();
			
			try 
			{
				PreparedStatement ps =(PreparedStatement) con.prepareStatement("select * from person where id=?");
				ps.setInt(1,id);
				ResultSet set=ps.executeQuery();
				
				if(set.next())
				{
					
					m.setId(set.getInt(1));
					m.setName(set.getString(2));
					m.setSurname(set.getString(3));
					
				}
				
			} 
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return m;
		
	}
	
}