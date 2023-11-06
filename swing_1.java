//Status-Successfully made the button and added to frame

import javax.swing.*;
public class swing_1
{
	public static void main(String ar[])
	{
		JFrame f=new JFrame();
		JButton b=new JButton("Click Here");     //Creating Frame
		b.setBounds(50,100,100,35);		//x-axis ,y-axis , width ,height
		
		f.add(b);  	//Adding button to frame
		f.setSize(800,800);  //width,height
		f.setLayout(null);	//Using no layout managers
		f.setVisible(true);	//making the frame visible
	}
}