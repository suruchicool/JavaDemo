import javax.swing.*;
import java.awt.*;
import java.sql.*;

import javax.swing.event.*;
import java.awt.event.*;

public class AdminWindow implements ActionListener
{


	JFrame f;
	JPanel p;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	JButton b1,b2,b3;


public AdminWindow()
	{
		f=new JFrame();
		p=new JPanel();
				l1=new JLabel("Name of the College");
				t1=new JTextField();
				l2=new JLabel("College Address");
				t2=new JTextField();
				l3=new JLabel("Email-ID");
				t3=new JTextField();
				l4=new JLabel("BBA");
				t4=new JTextField();
				l5=new JLabel("BCA");
				t5=new JTextField();
				l6=new JLabel("Contact");
				t6=new JTextField();
				l7=new JLabel("Placement");
				t7=new JTextField();
				l8=new JLabel("Course Fee");
				t8=new JTextField();
				l9=new JLabel("Catering Charges");
				t9=new JTextField();
				l10=new JLabel("Transportation Fee");
				t10=new JTextField();
				b1=new JButton("Register");
				b1.addActionListener(this);
				b2=new JButton("Reset");
				b3=new JButton("Exit");
				f.setSize(500,1000);
				f.add(p);

						p.add(l1);
						p.add(t1);
						p.add(l2);
						p.add(t2);
						p.add(l3);
						p.add(t3);
						p.add(l4);
						p.add(t4);
						p.add(l5);
						p.add(t5);
						p.add(l6);
						p.add(t6);
						p.add(l7);
						p.add(t7);
						p.add(l8);
						p.add(t8);
						p.add(l9);
						p.add(t9);
						p.add(l10);
						p.add(t10);
						p.add(b1);
						p.add(b2);
		                p.add(b3);

								l1.setBounds(60,0,140,20);
								t1.setBounds(210,0,180,20);
								l2.setBounds(60,40,140,20);
								t2.setBounds(210,40,180,20);
								l3.setBounds(60,80,140,20);
								t3.setBounds(210,80,180,20);
								l4.setBounds(60,120,140,20);
								t4.setBounds(210,120,180,20);
								l5.setBounds(60,160,140,20);
								t5.setBounds(210,160,180,20);
								l6.setBounds(60,200,140,20);
								t6.setBounds(210,200,180,20);
								l7.setBounds(60,240,140,20);
								t7.setBounds(210,240,180,20);
								l8.setBounds(60,280,140,20);
								t8.setBounds(210,280,180,20);
								l9.setBounds(60,320,140,20);
								t9.setBounds(210,320,180,20);
								l10.setBounds(60,360,140,20);
								t10.setBounds(210,360,180,20);
								b1.setBounds(70,420,80,30);
								b2.setBounds(140,420,80,30);
								b3.setBounds(210,420,80,30);


		p.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			try{

				Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","password");
						PreparedStatement ps=con.prepareStatement("insert into clg(c_name,c_add,email,bba,bca,contact,placement,course_fee,canteen,t_fare) values(?,?,?,?,?,?,?,?,?,?)");

						ps.setString(1,t1.getText().toString());
						ps.setString(2,t2.getText().toString());
						ps.setString(3,t3.getText().toString());
						ps.setString(4,t4.getText().toString());
						ps.setString(5,t5.getText().toString());
						ps.setString(6,t6.getText().toString());
						ps.setString(7,t7.getText().toString());
						ps.setString(8,t8.getText().toString());
						ps.setString(9,t9.getText().toString());
						ps.setString(10,t10.getText().toString());

		int i=ps.executeUpdate();
		System.out.println(i+"record inserted");
			}catch(Exception e)
			{
				e.printStackTrace();
			}

		}
		if(ae.getSource()==b2)
				{

		}
		if(ae.getSource()==b3)
				{


		}

	}
public static void main(String str[])
{
	AdminWindow an=new AdminWindow();
}

}







