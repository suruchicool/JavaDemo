 import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class LoginWindow implements ActionListener
{
	// adding attributes
	JFrame f1;
	JPanel p0,p1,p;
	JLabel l0,l,l1,l2,l3,l4,l5;
	JTextField t1;
	JPasswordField pwd;
	JButton b1,b2;
	Font f;
	JLayeredPane lp;

	// adding constructor

	 public LoginWindow()
	{
		f1=new JFrame("Login Window");
		p=new JPanel();
		p0=new JPanel();
		p1=new JPanel();

		l=new JLabel();
		l0=new JLabel();
		l1=new JLabel("User Id");
		l2=new JLabel("Password");
		l3=new JLabel();
		l4=new JLabel();
		l5=new JLabel("Login As");
		t1=new JTextField();
		pwd=new JPasswordField();
		b1=new JButton("Login");
		b1.addActionListener(this);
		b2=new JButton("New Registration");
		b2.addActionListener(this);
		Color c=new Color(70,30,90);
		Font f=new Font("Comic Sans MS",Font.BOLD,16);
		lp=new JLayeredPane();
		f1.setSize(1000,1000);
		f1.add(lp);
		p1.setOpaque(false);
		p0.setBackground(new Color(255,255,255));


		p.add(l);
		p0.add(l0);
		l.setIcon(new ImageIcon("login2.jpg"));
		l0.setIcon(new ImageIcon("logo.png"));


		p.setBounds(0,150,1000,600);
		p0.setBounds(0,0,1000,400);
		p1.setBounds(500,300,400,400);

		lp.add(p0,new Integer(0));
		lp.add(p,new Integer(1));
		lp.add(p1,new Integer(5));



		p1.setLayout(new GridBagLayout());




		GridBagConstraints obj=new GridBagConstraints();
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=1;
		obj.insets=new Insets(10,10,10,10);
		p1.add(l1,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=2;
		obj.gridy=1;
		p1.add(t1,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=2;
		obj.insets=new Insets(10,10,10,10);
		p1.add(l2,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=2;
		obj.gridy=2;
		p1.add(pwd,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=3;
		obj.insets=new Insets(10,10,10,10);
		p1.add(b1,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=2;
		obj.gridy=3;
		p1.add(b2,obj);


		f1.setVisible(true);
		f1.setResizable(false);



	}

	public void actionPerformed(ActionEvent ae)
	{

		if(ae.getSource()==b1)
		{

			 String x=t1.getText();
			 String y=pwd.getText();

			 	try{

			 			Class.forName("oracle.jdbc.driver.OracleDriver");
			 			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","password");
			 			Statement st=con.createStatement();
			 			ResultSet rs=st.executeQuery("select email_id,pwd from reg");
			 	       	while(rs.next()){

			 				String s1=rs.getString(1);
			 				String s2=rs.getString(2);

			 				if(s1.equals(x) && s2.equals(y)){

			 					System.out.println("Connected to the Database!!"+s1 + s2);
			 					//JOptionPane.showMessageDialog(null,new String("Welcome"+s1));

			 					new College();
			 					f1.setVisible(false);

			 				}


			 			}

			 		}
			 		catch(Exception ex){
			 	       System.err.println(ex);
	                }
		}
		if(ae.getSource()==b2)
		{
			new RegForm();
		}

}

	public static void main(String p[])
	{
		new LoginWindow();
	}
}
