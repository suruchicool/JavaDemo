import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class RegForm implements ActionListener
{
	JFrame f;
	JPanel p;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2,t3,t4,t5;
	JPasswordField pwd1,pwd2;
	JButton b1,b2,b3;


	//constructor

	 RegForm()
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
		t1=new JTextField(15);
		t2=new JTextField(15);
		t3=new JTextField(15);
		t4=new JTextField(15);
		t5=new JTextField(15);
		pwd1=new JPasswordField(15);
		pwd2=new JPasswordField(15);
		b1=new JButton("Register");
		b1.addActionListener(this);
		//lp=new JLayeredPane();

		b2=new JButton("Reset");
		b2.addActionListener(this);
		b3=new JButton("Back");
		b3.addActionListener(this);

		f.setSize(1000,1000);
		f.add(p);

		p.setLayout(new GridBagLayout());

		GridBagConstraints obj=new GridBagConstraints();
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=2;
		obj.insets=new Insets(10,10,10,10);
		p.add(l1,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=2;
		obj.gridy=2;
		obj.insets=new Insets(10,10,10,10);
		p.add(l2,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=3;
		obj.gridy=2;
		obj.insets=new Insets(10,10,10,10);
		p.add(l3,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=3;
		obj.insets=new Insets(10,10,10,10);
		p.add(t1,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=2;
		obj.gridy=3;
		obj.insets=new Insets(10,10,10,10);
		p.add(t2,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=3;
		obj.gridy=3;
		obj.insets=new Insets(10,10,10,10);
		p.add(t3,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=4;
		obj.insets=new Insets(10,10,10,10);
		p.add(l4,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=2;
		obj.gridy=4;
		obj.insets=new Insets(10,10,10,10);
		p.add(t4,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=5;
		obj.insets=new Insets(10,10,10,10);
		p.add(l5,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=2;
		obj.gridy=5;
		obj.insets=new Insets(10,10,10,10);
		p.add(t5,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=6;
		obj.insets=new Insets(10,10,10,10);
		p.add(l6,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=2;
		obj.gridy=6;
		obj.insets=new Insets(10,10,10,10);
		p.add(pwd1,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=7;
		obj.insets=new Insets(10,10,10,10);
		p.add(l7,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=2;
		obj.gridy=7;
		obj.insets=new Insets(10,10,10,10);
		p.add(pwd2,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=8;
		obj.insets=new Insets(10,10,10,10);
		p.add(b1,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=2;
		obj.gridy=8;
		obj.insets=new Insets(10,10,10,10);
		p.add(b2,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=3;
		obj.gridy=8;
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

					}


				}


	}

