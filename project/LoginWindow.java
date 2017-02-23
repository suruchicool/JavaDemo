import java.awt.*;
import javax.swing.*;

public class LoginWindow
{
	// adding attributes
	JFrame f1;
	JPanel p1;
	JLabel l1,l2;
	JTextField t1;
	JPasswordField pwd;
	JButton b1,b2,b3;
	Font p;
	
	// adding constructor

	public LoginWindow()
	{
		f1=new JFrame("Login Window");
		p1=new JPanel();
		l1=new JLabel("User Id");
		l2=new JLabel("Password");
		t1=new JTextField();
		pwd=new JPasswordField();
		b1=new JButton("Login");
		b2=new JButton("Forget Password");
		b3=new JButton("New Registration");
		Color c=new Color(70,30,90);
		Font p=new Font("Comic Sans MS",Font.BOLD,14);
		f1.setSize(500,500);
		f1.add(p1);
		p1.setLayout(new GridBagLayout());

		GridBagConstraints obj=new GridBagConstraints();
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=2;
		obj.insets=new Insets(10,10,10,10);
		p1.add(l1,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=3;
		obj.gridy=2;
		p1.add(t1,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=4;
		obj.insets=new Insets(10,10,10,10);
		p1.add(l2,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=3;
		obj.gridy=4;
		p1.add(pwd,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=7;
		obj.insets=new Insets(10,10,10,10);
		p1.add(b1,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=3;
		obj.gridy=7;
		p1.add(b2,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=5;
		obj.gridy=7;
		p1.add(b3,obj);
		
		f1.setVisible(true);
		
	}
	public static void main(String p[])
	{
		LoginWindow ob=new LoginWindow();
	}
}
