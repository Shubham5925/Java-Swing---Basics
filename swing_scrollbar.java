import javax.swing.*;
public class swing_scrollbar
{
	swing_scrollbar()
	{
		JFrame f=new JFrame("Scrollbar view");
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		JScrollBar scroll=new JScrollBar();
		scroll.setBounds(100,100,100,200);
		
		f.add(scroll);
		
	}
	public static void main(String ar[])
	{
		swing_scrollbar obj=new swing_scrollbar();
	}
} 
		
		