import javax.swing.*;
import java.awt.event.*;
public class swing_6 implements ActionListener
{
	JTextField tf1,tf2,tf3;
	JButton b1,b2;
	swing_6()
	{
		JFrame f=new JFrame();
		f.setSize(200,200);
		f.setVisible(true);
		f.setLayout(null);
		
		tf1=new JTextField();
		tf1.setBounds(100,20,200,50);
		
		tf2=new JTextField();
		tf2.setBounds(100,100,200,50);
		
		tf3=new JTextField();
		tf3.setBounds(100,180,200,50);
		tf3.setEditable(false);
		
		b1=new JButton("+");
		b1.setBounds(100,260,50,50);
		
		b2=new JButton("-");
		b2.setBounds(200,260,50,50);
		
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(b1);
		f.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
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
			c=a-b;
	
		String result=String.valueOf(c);
		tf3.setText(result);
	}
		
	public static void main(String ar[])
	{
		new swing_6();
	}
}
		