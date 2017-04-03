package com.sms;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

import javax.swing.event.*;
import java.awt.event.*;

public class AdminWindow implements ActionListener
{


	JFrame f;
	JPanel p,p0;
    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	JButton b1,b2,b3;
	JLayeredPane lp;


public AdminWindow()
	{
				f=new JFrame("Admin Window");
				p=new JPanel();
				p0=new JPanel();
				l=new JLabel();
				l1=new JLabel("Name of the College");
				t1=new JTextField(15);
				l2=new JLabel("College Address");
				t2=new JTextField(15);
				l3=new JLabel("Email-ID");
				t3=new JTextField(15);
				l4=new JLabel("BBA");
				t4=new JTextField(15);
				l5=new JLabel("BCA");
				t5=new JTextField(15);
				l6=new JLabel("Contact");
				t6=new JTextField(15);
				l7=new JLabel("Placement");
				t7=new JTextField(15);
				l8=new JLabel("Course Fee");
				t8=new JTextField(15);
				l9=new JLabel("Catering Charges");
				t9=new JTextField(15);
				l10=new JLabel("Transportation Fee");
				t10=new JTextField(15);
				lp=new JLayeredPane();
				b1=new JButton("Register");
				b1.addActionListener(this);
				b2=new JButton("Reset");
				b2.addActionListener(this);
				b3=new JButton("Exit");
				b3.addActionListener(this);
				f.setSize(1000,1000);
				f.add(lp);
				p0.add(l);
				p.setOpaque(false);

				l.setIcon(new ImageIcon("E://java/CollegeProject/project/workspace_bg2.jpg"));

					lp.add(p0,new Integer(0));
					lp.add(p,new Integer(1));

					p0.setBounds(0,0,1000,1000);
					p.setBounds(0,0,1000,750);

					p.setLayout(new GridBagLayout());

					GridBagConstraints obj=new GridBagConstraints();
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=0;
					obj.gridy=0;
					obj.insets=new Insets(10,10,10,10);
					p.add(l1,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=1;
					obj.gridy=0;
					p.add(t1,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=0;
					obj.gridy=1;
					obj.insets=new Insets(10,10,10,10);
					p.add(l2,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=1;
					obj.gridy=1;
					p.add(t2,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=0;
					obj.gridy=2;
					obj.insets=new Insets(10,10,10,10);
					p.add(l3,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=1;
					obj.gridy=2;
					p.add(t3,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=0;
					obj.gridy=3;
					obj.insets=new Insets(10,10,10,10);
					p.add(l4,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=1;
					obj.gridy=3;
					obj.insets=new Insets(10,10,10,10);
					p.add(t4,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=0;
					obj.gridy=4;
					obj.insets=new Insets(10,10,10,10);
					p.add(l5,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=1;
					obj.gridy=4;
					obj.insets=new Insets(10,10,10,10);
					p.add(t5,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=0;
					obj.gridy=5;
					obj.insets=new Insets(10,10,10,10);
					p.add(l6,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=1;
					obj.gridy=5;
					obj.insets=new Insets(10,10,10,10);
					p.add(t6,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=0;
					obj.gridy=6;
					obj.insets=new Insets(10,10,10,10);
					p.add(l7,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=1;
					obj.gridy=6;
					obj.insets=new Insets(10,10,10,10);
					p.add(t7,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=0;
					obj.gridy=7;
					obj.insets=new Insets(10,10,10,10);
					p.add(l8,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=1;
					obj.gridy=7;
					obj.insets=new Insets(10,10,10,10);
					p.add(t8,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=0;
					obj.gridy=8;
					obj.insets=new Insets(10,10,10,10);
					p.add(l9,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=1;
					obj.gridy=8;
					obj.insets=new Insets(10,10,10,10);
					p.add(t9,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=0;
					obj.gridy=9;
					obj.insets=new Insets(10,10,10,10);
					p.add(l10,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=1;
					obj.gridy=9;
					obj.insets=new Insets(10,10,10,10);
					p.add(t10,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=0;
					obj.gridy=10;
					obj.insets=new Insets(10,10,10,10);
					p.add(b1,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=1;
					obj.gridy=10;
					obj.insets=new Insets(10,10,10,10);
					p.add(b2,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=0;
					obj.gridy=11;
					obj.insets=new Insets(10,10,10,10);
					p.add(b3,obj);
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
		// show dialog box with a message
			}catch(Exception e)
			{
				e.printStackTrace();
			}

		}
		if(ae.getSource()==b2)
		{
			t1.setText(" ");
			t2.setText(" ");
			t3.setText(" ");
			t4.setText(" ");
			t5.setText(" ");
			t6.setText(" ");
			t7.setText(" ");
			t8.setText(" ");
			t9.setText(" ");
			t10.setText(" ");

		}
		if(ae.getSource()==b3)
		{
			System.exit(0);

		}

	}


}







