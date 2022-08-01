package tops.example;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ImageEx extends Canvas
{
	
	@Override
	public void paint(Graphics g)
	{
		
		
		  	Toolkit t=Toolkit.getDefaultToolkit();  
	        Image i=t.getImage("E://Photos for Background//a.jpg");  
	        g.drawImage(i, 120,100,this);  
	}
	
	
	public static void main(String[] args) {
		
			ImageEx m=new ImageEx();  
	        JFrame f=new JFrame();  
	        f.add(m);  
	        f.setSize(400,400);  
	        f.setVisible(true);  
	}
}
