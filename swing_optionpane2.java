import javax.swing.*;
public class swing_optionpane2
{
	swing_optionpane2()
	{
		JFrame f=new JFrame("Option pane ");
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		JOptionPane.showMessageDialog(f,"Welcome to java swing","Alert !!",JOptionPane.WARNING_MESSAGE);
		
	}
	public static void main(String ar[])
	{
		swing_optionpane2 object=new swing_optionpane2();
	}
} 