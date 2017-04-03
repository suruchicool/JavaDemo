package com.sms;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class RegForm implements ActionListener
{
	JFrame f;
	JPanel p,p1,p2;
	JLabel l,l0,l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2,t3,t4,t5;
	JPasswordField pwd1,pwd2;
	JButton b1,b2,b3;
	Font f1;
	JLayeredPane lp;


	//constructor

	 RegForm()
	{
		//creating objects for each component

		f=new JFrame("Registration Form");
		p=new JPanel();
		p1=new JPanel();
		p2=new JPanel();

		l=new JLabel();
		l0=new JLabel();
		l1=new JLabel("First Name");
		l2=new JLabel("Middle Name");
		l3=new JLabel("Last Name");
		l4=new JLabel("D.O.B");
		l5=new JLabel("Email Id");
		l6=new JLabel("Password");
		l7=new JLabel("Confirm Password");
		t1=new JTextField(15);
		t2=new JTextField(15);
		t3=new JTextField(15);
		t4=new JTextField(15);
		t5=new JTextField(15);
		pwd1=new JPasswordField(15);
		pwd2=new JPasswordField(15);
		Font f1=new Font("Comic Sans MS",Font.BOLD,18);
		b1=new JButton("Register");
		b1.addActionListener(this);
		lp=new JLayeredPane();

		b2=new JButton("Reset");
		b2.addActionListener(this);
		b3=new JButton("Back");
		b3.addActionListener(this);
		p.setOpaque(false);

		f.setSize(1000,1000);
		f.add(lp);
		p1.add(l);
		p2.add(l0);

		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		l5.setFont(f1);
		l6.setFont(f1);
		l7.setFont(f1);
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);
		l.setIcon(new ImageIcon("E://java/CollegeProject/project/bglogin.png"));
		l0.setIcon(new ImageIcon("E://java/CollegeProject/project/reg_bg2.jpg"));

		p.setLayout(new GridBagLayout());

		lp.add(p2,new Integer(0));

		lp.add(p1,new Integer(1));
		lp.add(p,new Integer(5));

		p1.setBounds(0,100,1000,700);
		p.setBounds(150,100,700,600);
		p2.setBounds(0,0,1000,200);

		GridBagConstraints obj=new GridBagConstraints();
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=0;
		obj.gridy=1;
		obj.insets=new Insets(10,10,10,10);
		p.add(l1,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=1;
		obj.insets=new Insets(10,10,10,10);
		p.add(l2,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=2;
		obj.gridy=1;
		obj.insets=new Insets(10,10,10,10);
		p.add(l3,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=0;
		obj.gridy=2;
		obj.insets=new Insets(10,10,10,10);
		p.add(t1,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=2;
		obj.insets=new Insets(10,10,10,10);
		p.add(t2,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=2;
		obj.gridy=2;
		obj.insets=new Insets(10,10,10,10);
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
		p.add(pwd1,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=0;
		obj.gridy=6;
		obj.insets=new Insets(10,10,10,10);
		p.add(l7,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=6;
		obj.insets=new Insets(10,10,10,10);
		p.add(pwd2,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=0;
		obj.gridy=7;
		obj.insets=new Insets(10,10,10,10);
		p.add(b1,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=7;
		obj.insets=new Insets(10,10,10,10);
		p.add(b2,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=2;
		obj.gridy=7;
		obj.insets=new Insets(10,10,10,10);
		p.add(b3,obj);




		f.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e){

			String s1=t1.getText();
			String s2=t2.getText();
			String s3=t3.getText();
			String s4=t4.getText();
			String s5=t5.getText();
			String s6=pwd1.getText();
			String s7=pwd2.getText();

			
				if(e.getSource()==b1){
					/*
					 *Applying Validations 
					 * 
					 */
					if(s1.toString().isEmpty() ||s2.toString().isEmpty()||s3.toString().isEmpty()
							||s4.toString().isEmpty()||s5.toString().isEmpty()
							||s6.toString().isEmpty()||s7.toString().isEmpty())
					{
						JOptionPane.showMessageDialog(null,new String("Please Enter all the fields"));
					}

				try{
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","password");
						PreparedStatement rs=con.prepareStatement("insert into reg(id,f_name,m_name,l_name,dob,email_id,pwd,c_pwd,role) values(uid_seq.NEXTVAL,?,?,?,?,?,?,?,?)");

						rs.setString(1,s1);
						rs.setString(2,s2);
						rs.setString(3,s3);
						rs.setString(4,s4);
						rs.setString(5,s5);
						rs.setString(6,s6);
						rs.setString(7,s7);
						rs.setString(8,"ROLE_USER");

						int i=rs.executeUpdate();

						System.out.println("Data inserted successfully");

						con.close();
						}
					catch(Exception ex){
						System.err.println(ex);
			}

					}

				if(e.getSource()==b2){

					t1.setText(" ");
					t2.setText(" ");
					t3.setText(" ");
					t4.setText(" ");
					t5.setText(" ");
					pwd1.setText(" ");
					pwd2.setText(" ");

					}

				if(e.getSource()==b3){

					new LoginWindow();
					f.setVisible(false);

					}


				}
	

	}

