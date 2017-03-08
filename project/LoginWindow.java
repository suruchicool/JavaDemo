import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class LoginWindow implements ActionListener
{
	// adding attributes
	JFrame f1;
	JPanel p1,p2,p3,p0;
	JLabel l1,l2,l3,l4;
	JTextField t1;
	JPasswordField pwd;
	JButton b1,b2,b3;
	Font p;
	JLayeredPane lp;

	// adding constructor

	 public LoginWindow()
	{
		f1=new JFrame("Login Window");
		p0=new JPanel();
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();


		l1=new JLabel("User Id");
		l2=new JLabel("Password");
		l3=new JLabel();
		l4=new JLabel();
		t1=new JTextField();
		pwd=new JPasswordField();
		b1=new JButton("Login");
		b1.addActionListener(this);
		b2=new JButton("Forget Password");
		b3=new JButton("New Registration");
		Color c=new Color(70,30,90);
		Font p=new Font("Comic Sans MS",Font.BOLD,14);
		lp=new JLayeredPane();
		f1.setSize(1000,1000);
		f1.add(lp);



		l3.setIcon(new ImageIcon("login1.jpg"));
		l4.setIcon(new ImageIcon("edu_title.jpg"));
		p2.add(l3);
		p3.add(l4);


		p1.setBounds(100,250,500,500);
		b3.setBounds(250,350,70,30);
		p2.setBounds(500,400,400,600);
		p3.setBounds(0,0,1000,300);
		p0.setBounds(0,0,100,700);

		lp.add(p3,new Integer(1));
		lp.add(p0,new Integer(2));
		lp.add(p1,new Integer(3));
		lp.add(p2,new Integer(7));


		p1.setLayout(new GridBagLayout());
		p0.setBackground(new Color(255,255,255));
		p1.setBackground(new Color(255,255,255));
		p2.setBackground(new Color(255,255,255));
		p3.setBackground(new Color(255,255,255));

		b3.addActionListener(this);

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
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=4;
		p1.add(b3,obj);

		f1.setVisible(true);



	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b3)
		{
			new RegForm();
		}
		if(ae.getSource()==b1)
		{
			 conn();
		}

	}
	public void conn(){

				String x=t1.getText();
				String y=pwd.getText();

				try{

					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","Suruchi$123manoj");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select email_id,pwd from reg");
	                   	while(rs.next()){

							String s1=rs.getString(1);
							String s2=rs.getString(2);

							if(s1.equals(x) && s2.equals(y)){

								System.out.println("Connected to the Database!!"+s1 + s2);
								JOptionPane.showMessageDialog(null,new String("Welcome"+s1));

								new College();

							}
							else
							{
								JOptionPane.showMessageDialog(null,new String("Invalid username/password"));

							}

						}
						con.close();
					}
					catch(Exception ex){
	                    System.err.println(ex);
	                }

	}

	public static void main(String p[])
	{
		new LoginWindow();
	}
}
