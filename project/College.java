
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

class College implements ActionListener
{


	JFrame f;
	JPanel p,p1,p2;
	JComboBox c1;
	JLayeredPane lp;
    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	JButton b1;
	Font f1;


	Connection con=null;



	// Database connection

	public College()

	{
		f=new JFrame("College Details");
		c1=new JComboBox();
		c1.addActionListener(this);
		p=new JPanel();
		p1=new JPanel();
		p2=new JPanel();
		lp=new JLayeredPane();
		l=new JLabel();
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
		b1.addActionListener(this);
		f1=new Font("Comic Sans MS",Font.ITALIC,16);

		f.setSize(1000,1000);
		f.add(lp);
		p.add(c1);
		p2.add(l);

		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		l5.setFont(f1);
		l6.setFont(f1);
		l7.setFont(f1);
		l8.setFont(f1);
		l9.setFont(f1);
		l10.setFont(f1);
		b1.setFont(f1);
		c1.setFont(f1);

		p.setOpaque(false);
		p1.setOpaque(false);

		l.setIcon(new ImageIcon("workspace_bg1.jpg"));
		p1.setLayout(new GridBagLayout());

		lp.add(p2, new Integer(0));
		lp.add(p, new Integer(2));
		lp.add(p1, new Integer(5));


		p.setBounds(370,70,250,300);
		p1.setBounds(0,60,1000,900);
		p2.setBounds(0,0,1000,1000);


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



		l1.setBounds(300,70,200,20);
		t1.setBounds(500,70,180,20);
		l2.setBounds(300,110,200,20);
		t2.setBounds(500,110,180,20);
		l3.setBounds(300,160,200,20);
		t3.setBounds(500,160,180,20);
		l4.setBounds(300,210,200,20);
		t4.setBounds(500,210,180,20);
		l5.setBounds(300,260,200,20);
		t5.setBounds(500,260,180,20);
		l6.setBounds(300,310,200,20);
		t6.setBounds(500,310,180,20);
		l7.setBounds(300,360,200,20);
		t7.setBounds(500,360,180,20);
		l8.setBounds(300,410,200,20);
		t8.setBounds(500,410,180,20);
		l9.setBounds(300,460,200,20);
		t9.setBounds(500,460,180,20);
		l10.setBounds(300,510,200,20);
		t10.setBounds(500,510,180,20);
		b1.setBounds(380,560,200,30);









		//p1.setBackground(new Color(23,45,67));
		try{

		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","password");
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
	@Override
	    public void actionPerformed(ActionEvent e) {

			if(e.getSource()==b1)
			{
				new ApplicantPersonalForm();
				f.setVisible(false);
			}
	        //JComboBox combo = (JComboBox) e.getSource();
	        String clg_name = (String) c1.getSelectedItem();

			try {

				Statement st1=con.createStatement();
	            ResultSet rs1=st1.executeQuery("select id,c_add,email,bba,bca,contact,placement,course_fee,canteen,t_fare from clg where c_name='"+clg_name+"'");

				while(rs1.next())
				{

	            t1.setText(rs1.getString(1));
	            t2.setText(rs1.getString(2));
	            t3.setText(rs1.getString(3));
	            t4.setText(rs1.getString(4));
	            t5.setText(rs1.getString(5));
	            t6.setText(rs1.getString(6));
	            t7.setText(rs1.getString(7));
	            t8.setText(rs1.getString(8));
	            t9.setText(rs1.getString(9));
	            t10.setText(rs1.getString(10));
			}

		}catch(Exception e1)
		{
			e1.printStackTrace();
		}
    }





	}


