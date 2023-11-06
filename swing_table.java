import javax.swing.*;
public class swing_table
{
	JFrame f;
	swing_table()
	{
		f=new JFrame("Swing table");
		
		
		String data[][]={{"one ","c++"},{"two","java"}};
		String column[]={"Number","language"};
			 
		JTable jt=new JTable(data,column);  //Compulsory sequence(data then,column)
		
		jt.setBounds(10,40,200,300);
		
		JScrollPane sp=new JScrollPane(jt);  //set the scroll to the frame.
		f.add(sp);
		//here f.setLayout will not be set to null.
		f.setSize(500,500);
		f.setVisible(true);
	}
	public static void main(String ar[])
	{
		swing_table object=new swing_table();
	}
} 
		
		