//error while compilation: - when we use collection type of work.
// uses unchecked or unsafe operations. recompile with -xlint:unchecked for details. 
//error while compilation 
/*This error occurs when:You will generally get this warning when you are using 
collection without using type specifier(e.g. ArrayList() instead of ArrayList) in your code.
*/

import javax.swing.*;
public class swing_combobox
{
	JFrame f;
	swing_combobox()
	{
		f=new JFrame("ComboBoxEx:");
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
		String s[]={"c++","java","python","c"};
		JComboBox cb=new JComboBox(s);
		cb.setBounds(100,100,100,30);
		
		f.add(cb);
	}
	public static void main(String ar[])
	{
		new swing_combobox();
	}
} 