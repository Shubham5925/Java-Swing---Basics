//status-completed and inserted textfield and textarea into frame.
//JTextField-It allows writing a single line.
//JTextArea-It allows writting multiple lines.

import javax.swing.*;
public class swing_5
{
	swing_5()
	{
		JFrame f=new JFrame();
		f.setSize(600,500);
		f.setVisible(true);
		f.setLayout(null);
		
		JTextField tf1=new JTextField();
		tf1.setBounds(100,100,100,50);
		
		JTextArea ta1=new JTextArea();
		ta1.setBounds(100,300,100,50);
		
		f.add(tf1);
		f.add(ta1);
	}
	public static void main(String ar[])
	{
		swing_5 obj5=new swing_5();
	}
}