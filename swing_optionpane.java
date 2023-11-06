import javax.swing.*;
public class swing_optionpane
{
	swing_optionpane()
	{
		JFrame f=new JFrame("Option pane ");
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		JOptionPane.showMessageDialog(f,"Hello java swing");
		
	}
	public static void main(String ar[])
	{
		swing_optionpane object=new swing_optionpane();
	}
} 