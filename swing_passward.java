import javax.swing.*;
import java.awt.event.*;
public class swing_passward
{
	JLabel l1;
	JPasswordField pf;
	swing_passward()
	{
		JFrame f=new JFrame();
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		l1=new JLabel("Passward");
		l1.setBounds(100,200,100,50);
		
		pf=new JPasswordField();
		pf.setBounds(200,200,100,50);
		
		f.add(l1);
		f.add(pf);
	}
	public static void main(String ar[])
	{
		swing_passward obj=new swing_passward();
	}
}
	