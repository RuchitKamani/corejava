package tops.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CalcEx implements ActionListener
{
	JFrame frame;
	JTextField t1,t2,t3;
	//JPasswordField ps;
	JButton btn1,btn2;
	JLabel l1;
	
	public CalcEx() 
	{
		// TODO Auto-generated constructor stub
		frame=new JFrame();
		
		t1 =new JTextField();
		t1.setBounds(163, 50, 103, 20);
		t2 =new JTextField();
		t2.setBounds(163, 80, 103, 20);
		t3 =new JTextField();
		t3.setBounds(163, 110, 103, 20);
		t3.setEditable(false);
		/*ps=new JPasswordField();
		ps.setBounds(163, 140, 103, 20);*/
		btn1=new JButton("+");
		btn1.setBounds(163, 157, 46, 23);
		btn2=new JButton("-");
		btn2.setBounds(220, 157, 46, 23);
		l1=new JLabel("Calculator");
		l1.setBounds(181, 11, 86, 14);
		
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(btn1);
		frame.add(btn2);
		//frame.add(ps);
		frame.add(l1);
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	
	}
	public static void main(String[] args) {
		
		
		new CalcEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String a=t1.getText().toString();
		String b =t2.getText().toString();
	
		int c=0;
		
		
		if(e.getSource()==btn1)
		{
			//System.out.println(ps.getText().toString());
			c=Integer.parseInt(a)+Integer.parseInt(b);
			
			
		}
		if(e.getSource()==btn2)
		{
			c=Integer.parseInt(a)-Integer.parseInt(b);
		}
		
		t3.setText(String.valueOf(c));
		
	}
}
