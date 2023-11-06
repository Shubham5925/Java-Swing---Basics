import javax.swing.*;
public class swing_checkbox
{
	swing_checkbox()
	{
		JFrame f=new JFrame();
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		JCheckBox b1=new JCheckBox("JAVA");
		b1.setBounds(100,100,80,30);
		
		JCheckBox b2=new JCheckBox("C++");
		b2.setBounds(100,200,80,30);
		
		f.add(b1);
		f.add(b2);
	}
	public static void main(String ar[])
	{
		swing_checkbox obj=new swing_checkbox();
	} 
}