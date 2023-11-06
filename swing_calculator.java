import javax.swing.*;
import java.awt.event.*;
public class swing_calculator implements ActionListener
{
	JTextField tf1,tf2,tf3;
	JButton b1,b2,b3,b4;
	
	swing_calculator()    //default constructor called when obj is created
	{ 
		JFrame f=new JFrame();
		
		//For Frame setting
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		
		//making text field and setting properties
		tf1=new JTextField();
		tf1.setBounds(100,30,200,45);
		
		tf2=new JTextField();
		tf2.setBounds(100,100,200,45);
		
		tf3=new JTextField();
		tf3.setBounds(100,200,200,45);
		tf3.setEditable(false);
		
		//Making button and its properties
		b1=new JButton("+");
		b1.setBounds(100,300,50,35);
		
		b2=new JButton("-");
		b2.setBounds(180,300,50,35);
		
		b3=new JButton("*");
		b3.setBounds(260,300,50,35);
		
		b4=new JButton("/");
		b4.setBounds(360,300,50,35);
		
		f.add(tf1); f.add(tf2); f.add(tf3); 
		f.add(b1); f.add(b2); f.add(b3); f.add(b4);
		
		//Adding actionlistener which needs action performed funtion.
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	} 
	
	public void actionPerformed(ActionEvent e)
	{
		String s1=tf1.getText();
		String s2=tf2.getText();
		
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=0;
		
		if(e.getSource()==b1)
			c=a+b;
		else if(e.getSource()==b2)
		{
			if(a>b)
				c=a-b;
			else
				c=b-a;
		} 
		else if(e.getSource()==b3)
			c=a*b;
		else if(e.getSource()==b4)
			c=a/b;
		
		String result=String.valueOf(c);
		tf3.setText(result);
	}  
	
	public static void main(String ar[])
	{
		swing_calculator obj=new swing_calculator();
	}
}
		