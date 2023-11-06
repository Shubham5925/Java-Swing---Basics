//status-completed Here making 2labels and adding it to the frame

import javax.swing.*;
public class swing_4
{
	swing_4()
	{
		JFrame f=new JFrame();
		f.setVisible(true);
		f.setSize(600,500);
		f.setLayout(null);
		
		JLabel l1=new JLabel("Name:");
		l1.setBounds(100,100,100,50);
		
		JLabel l2=new JLabel("Section:");
		l2.setBounds(100,150,100,50);
		
		f.add(l1);
		f.add(l2);
	}
	public static void main(String ar[])
	{
		swing_4 obj4=new swing_4();
	}
}