//Status-Successfully made the button and added to frame
//Through default constructor :If user does not call the input/obj/method it is called automatically.

import javax.swing.*;
public class swing_2
{
	swing_2()		//default constructor calling
	{
		JFrame f=new JFrame();
		JButton b=new JButton("Click Here");     //Creating Frame
		b.setBounds(50,100,100,35);		//x-axis ,y-axis , width ,height
		
		f.add(b);  	//Adding button to frame
		f.setSize(800,800);  //width,height
		f.setLayout(null);	//Using no layout managers
		f.setVisible(true);	//making the frame visible
	}
	public static void main(String ar[])
	{
		swing_2 obj2=new swing_2();
	}
}