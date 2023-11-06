//status-completed through JFrame extending to swing_3 class using extends keyword

import javax.swing.*;
public class swing_3 extends JFrame
{
	swing_3()
	{
		JFrame f=new JFrame();
		JButton b=new JButton("Clickhere");
		setSize(500,500);
		setVisible(true);
		setLayout(null);
		add(b);
		
		b.setBounds(100,100,100,100);
	}
	public static void main(String ar[])
	{
		swing_3 obj3=new swing_3();
	}
}
		