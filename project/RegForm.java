import java.awt.*;
import javax.swing.*;

public class RegForm
{
	JFrame f;
	JPanel p;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2,t3,t4,t5;
	JPasswordField pwd1,pwd2;
	JButton b1,b2,b3;

	//constructor

	public RegForm()
	{
		//creating objects for each component

		f=new JFrame("Registration Form");
		p=new JPanel();
		l1=new JLabel("First Name");
		l2=new JLabel("Middle Name");
		l3=new JLabel("Last Name");
		l4=new JLabel("D.O.B");
		l5=new JLabel("Email Id");
		l6=new JLabel("Password");
		l7=new JLabel("Confirm Password");
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();
		pwd1=new JPasswordField();
		pwd2=new JPasswordField();
		b1=new JButton("Register");
		b2=new JButton("Reset");
		b3=new JButton("Back");

		f.setSize(1000,1000);
		f.add(p);
		p.setLayout(null);
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(t1);
		p.add(t2);
		p.add(t3);
		p.add(l4);
		p.add(t4);
		p.add(l5);
		p.add(t5);
		p.add(l6);
		p.add(pwd1);
		p.add(l7);
		p.add(pwd2);
		p.add(b1);
		p.add(b2);
		p.add(b3);

		l1.setBounds(100,50,100,20);
		l2.setBounds(250,50,100,20);
		l3.setBounds(400,50,100,20);
		t1.setBounds(100,80,100,20);
		t2.setBounds(250,80,100,20);
		t3.setBounds(400,80,100,20);
		l4.setBounds(100,120,50,20);
		t4.setBounds(210,120,150,20);
		l5.setBounds(100,150,190,20);
		t5.setBounds(210,150,150,20);
		l6.setBounds(100,180,100,20);
		pwd1.setBounds(210,180,150,20);
		l7.setBounds(100,210,170,20);
		pwd2.setBounds(210,210,150,20);
		b1.setBounds(120,270,100,30);
		b2.setBounds(240,270,100,30);
		b3.setBounds(370,270,100,30);

		f.setVisible(true);
	}
	public static void main(String s[])
	{
		new RegForm();
	}
}