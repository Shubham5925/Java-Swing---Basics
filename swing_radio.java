import javax.swing.*;
public class swing_radio
{
	swing_radio()
	{
		JFrame f=new JFrame();
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		JRadioButton b1=new JRadioButton("Male");
		b1.setBounds(100,100,100,45);
		
		JRadioButton b2=new JRadioButton("Female");
		b2.setBounds(100,150,100,45);
		
		f.add(b1);
		f.add(b2);
	}
	public static void main(String ar[])
	{
		swing_radio obj=new swing_radio();
	}
}