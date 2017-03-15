
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
/*

This class is going to contain all the details of the application previous educational detail such as
matriculation, intermediate,  or any other education




*/
public class ApplicantEducationForm implements ActionListener
{
	JFrame f1;
	JPanel p,p0;
	JLabel l,l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField t0,t1,t2,t3,t4,t5,t6,t7,t8;
	JButton b1,b2;
	JLayeredPane lp;
	Font f;

	public ApplicantEducationForm()
	{
		f1=new JFrame("Applicant's Educational Details");
		p=new JPanel();
		p0=new JPanel();
		l=new JLabel();
		l0=new JLabel("Applicant ID");
		l1=new JLabel("Matriculation Details:");
		l2=new JLabel("Xth Percentage");
		l3=new JLabel("Xth Board");
		l4=new JLabel("Year of Passing");
		l5=new JLabel("Name of the School");
		l6=new JLabel("Intermediate Details:");
		l7=new JLabel("XIIth Percentage");
		l8=new JLabel("XIIth Board");
		l9=new JLabel("Year of Passing");
		l10=new JLabel("Name of the School/College");
		t0=new JTextField(15);
		t1=new JTextField(15);
		t2=new JTextField(15);
		t3=new JTextField(15);
		t4=new JTextField(15);
		t5=new JTextField(15);
		t6=new JTextField(15);
		t7=new JTextField(15);
		t8=new JTextField(15);
		b1=new JButton("Next");
		b1.addActionListener(this);
		b2=new JButton("Back");
		lp=new JLayeredPane();
		f=new Font("Comic Sans MS",Font.ITALIC,16);
		b2.addActionListener(this);
		f1.setSize(1000,1000);
		f1.add(lp);
		p0.add(l);
		p.setOpaque(false);

		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);
		l5.setFont(f);
		l6.setFont(f);
		l7.setFont(f);
		l8.setFont(f);
		l9.setFont(f);
		l10.setFont(f);
		b1.setFont(f);
		b2.setFont(f);

		l.setIcon(new ImageIcon("workspace_bg3.jpg"));

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
		p.add(l0,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=0;
		obj.insets=new Insets(10,10,10,10);
		p.add(t0,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=0;
		obj.gridy=1;
		obj.insets=new Insets(10,10,10,10);
		p.add(l1,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=0;
		obj.gridy=2;
		p.add(l2,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=2;
		obj.insets=new Insets(10,10,10,10);
		p.add(t1,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=0;
		obj.gridy=3;
		p.add(l3,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=3;
		obj.insets=new Insets(10,10,10,10);
		p.add(t2,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=0;
		obj.gridy=4;
		p.add(l4,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=4;
		obj.insets=new Insets(10,10,10,10);
		p.add(t3,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=0;
		obj.gridy=5;
		obj.insets=new Insets(10,10,10,10);
		p.add(l5,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=5;
		obj.insets=new Insets(10,10,10,10);
		p.add(t4,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=0;
		obj.gridy=6;
		obj.insets=new Insets(10,10,10,10);
		p.add(l6,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=0;
		obj.gridy=7;
		obj.insets=new Insets(10,10,10,10);
		p.add(l7,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=7;
		obj.insets=new Insets(10,10,10,10);
		p.add(t5,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=0;
		obj.gridy=8;
		obj.insets=new Insets(10,10,10,10);
		p.add(l8,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=8;
		obj.insets=new Insets(10,10,10,10);
		p.add(t6,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=0;
		obj.gridy=9;
		obj.insets=new Insets(10,10,10,10);
		p.add(l9,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=9;
		obj.insets=new Insets(10,10,10,10);
		p.add(t7,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=0;
		obj.gridy=10;
		obj.insets=new Insets(10,10,10,10);
		p.add(l10,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=10;
		obj.insets=new Insets(10,10,10,10);
		p.add(t8,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=0;
		obj.gridy=11;
		obj.insets=new Insets(10,10,10,10);
		p.add(b1,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=11;
		obj.insets=new Insets(10,10,10,10);
		p.add(b2,obj);

		f1.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			//new ApplicationForm();
		//	f1.setVisible(false);

			try{

									Class.forName("oracle.jdbc.driver.OracleDriver");
									Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","password");
									PreparedStatement ps=con.prepareStatement("insert into educational_details(id,xth_percentage,xth_board,xth_year,xthschool_name,xiith_percentage,xiith_board,xiith_year,xiithschool_name) values(?,?,?,?,?,?,?,?,?)");

									ps.setString(1,t0.getText().toString());
									ps.setString(2,t1.getText().toString());
									ps.setString(3,t2.getText().toString());
									ps.setString(4,t3.getText().toString());
									ps.setString(5,t4.getText().toString());
									ps.setString(6,t5.getText().toString());
									ps.setString(7,t6.getText().toString());
									ps.setString(8,t7.getText().toString());
									ps.setString(9,t8.getText().toString());

									int i=ps.executeUpdate();
							System.out.println(i+"record inserted");
							 new ApplicationForm();
							f1.setVisible(false);
						}
						catch(Exception ae)
						{
							ae.printStackTrace();
			}
		}
		if(e.getSource()==b2)
		{
			new ApplicantEducationForm();
			f1.setVisible(false);
		}
	}
	public static void main(String s[])
	{
		ApplicantEducationForm ob=new ApplicantEducationForm();
	}


}