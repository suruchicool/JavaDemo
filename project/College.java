import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

class College
{


	JFrame f;
	JPanel p,p1;
	JComboBox c1;
	JLayeredPane lp;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	JButton b1;






	// Database connection

	public College()

	{
		f=new JFrame("College Details");
		c1=new JComboBox();
		p=new JPanel();
		p1=new JPanel();
		lp=new JLayeredPane();
		//l0=new JLabel("Select College");
		l1=new JLabel("College ID");
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
		b1=new JButton("Proceed to Admission");

		f.setSize(500,1000);
		f.add(lp);
		p.add(c1);
		p.add(l0);

		lp.add(p, new Integer(0));
		lp.add(p1, new Integer(1));


		p.setBounds(100,100,300,30);
		p1.setBounds(50,200,600,700);

		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		p1.add(l4);
		p1.add(t4);
		p1.add(l5);
		p1.add(t5);
		p1.add(l6);
		p1.add(t6);
		p1.add(l7);
		p1.add(t7);
		p1.add(l8);
		p1.add(t8);
		p1.add(l9);
		p1.add(t9);
		p1.add(l10);
		p1.add(t10);
		p1.add(b1);



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
		b1.setBounds(120,420,200,30);









		//p1.setBackground(new Color(23,45,67));
		try{

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","abc");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select c_name from clg");


		while(rs.next())
			{
				String collegeName=rs.getString(1);
				c1.addItem(collegeName);

				System.out.println(collegeName);
			}
		}catch(Exception e){ e.printStackTrace();}

		p1.setLayout(null);
		f.setVisible(true);
		f.setResizable(false);
	}
	public static void main(String [] ar)
	{
			new College();
	}



	}


