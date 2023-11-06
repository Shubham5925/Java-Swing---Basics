import javax.swing.*;
import java.awt.event.*;
public class swing_user_pass 
{
	public static void main(String ar[])
	{
		JLabel l1,l2,l3;
		JTextField tf1;
		JPasswordField ps1;
		JButton b1;
	
		JFrame f=new JFrame();
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		l1=new JLabel("User :");
		l1.setBounds(100,100,100,50);
		
		tf1=new JTextField();
		tf1.setBounds(250,100,200,50);
		
		l2=new JLabel("Passward :");
		l2.setBounds(100,250,100,50);
		
		ps1=new JPasswordField();
		ps1.setBounds(250,250,200,50);
		
		b1=new JButton("Submit");
		b1.setBounds(120,340,200,50);
		
		l3=new JLabel();
		l3.setBounds(100,420,400,50);
	
		f.add(l1);
		f.add(l2);
		f.add(tf1);
		f.add(ps1);
		f.add(b1);
		f.add(l3);
		
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//Below all method are correct: to display
				
				/*String s1="User Name : " + tf1.getText(); 
				s1+="     		Passward : " +new String(ps1.getPassword());
				l3.setText(s1);*/
				
				String s1="User :"+tf1.getText() + "			Password :"+ ps1.getPassword();
				l3.setText(s1);
				
				
				/*String s1="User : "+tf1.getText();
				String s2="            Passward : "+ps1.getPassword();
				l3.setText(s1+s2);
				*/
			}
		}
		);
	}
}
				
			
				
		
		
		
		
		
		