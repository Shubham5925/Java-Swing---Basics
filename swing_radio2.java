import javax.swing.*;
import java.awt.event.*;
public class swing_radio2 extends JFrame implements ActionListener
{
	JRadioButton rb1,rb2;
	JButton b;
	swing_radio2()
	{
		rb1=new JRadioButton("Male");
		rb1.setBounds(100,100,100,45);
		
		rb2=new JRadioButton("Female");
		rb2.setBounds(100,150,100,45);
		
		b=new JButton("Click");
		b.setBounds(100,200,100,35);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		b.addActionListener(this);
		
		add(rb1); add(rb2); add(b);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(rb1.isSelected()){
		JOptionPane.showMessageDialog(this,"You are Male");}
		else if(rb2.isSelected()){
		JOptionPane.showMessageDialog(this,"You are Female");} 
	}
		
	public static void main(String ar[])
	{
		new swing_radio2();
	}
}
			
		