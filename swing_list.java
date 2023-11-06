import javax.swing.*;
public class swing_list
{
	swing_list()
	{
		JFrame f=new JFrame();
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		DefaultListModel <String> l1=new DefaultListModel <> ();
		
		l1.addElement("item1");
		l1.addElement("item2");
		l1.addElement("item3");
		l1.addElement("item4");
		
		JList <String> list=new JList <>(l1);
		list.setBounds(100,50,200,180);
		
		f.add(list);
	}
	public static void main(String ar[])
	{
		swing_list object=new swing_list();
	}
} 
		