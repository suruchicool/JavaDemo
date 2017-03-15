import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//import java.sql.*;


/*

This class is going to have summary of the application which has been filled by the student

*/
class ApplicationForm implements ActionListener
{
	JFrame f1;
	JPanel p,p0;
	JLabel l,l1,l2;
	JTextField t1;
	JRadioButton r1,r2;
	JButton b1,b2;
	JLayeredPane lp;
	Font f;

	public ApplicationForm()
	{
		f1=new JFrame("Application Form");
		p=new JPanel();
		p0=new JPanel();
		l=new JLabel();
		l1=new JLabel("Name of the College");
		l2=new JLabel("Select Stream");
		t1=new JTextField(15);
		r1=new JRadioButton("BBA");
		r2=new JRadioButton("BCA");
		b1=new JButton("Next");
		lp=new JLayeredPane();
		f=new Font("Comic Sans MS",Font.ITALIC,16);
		b1.addActionListener(this);
		b2=new JButton("Back");
		b2.addActionListener(this);
		f1.setSize(1000,1000);
		f1.add(lp);
		p0.add(l);
		p.setOpaque(false);
		r1.setOpaque(false);
		r2.setOpaque(false);

		l1.setFont(f);
		l2.setFont(f);
		b1.setFont(f);
		b2.setFont(f);

		l.setIcon(new ImageIcon("workspace_bg4.jpg"));

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
				obj.insets=new Insets(10,10,10,10);
				p.add(t1,obj);
				obj.fill=GridBagConstraints.HORIZONTAL;
				obj.gridx=0;
				obj.gridy=1;
				p.add(l2,obj);
				obj.fill=GridBagConstraints.HORIZONTAL;
				obj.gridx=1;
				obj.gridy=1;
				obj.insets=new Insets(10,10,10,10);
				p.add(r1,obj);
				obj.fill=GridBagConstraints.HORIZONTAL;
				obj.gridx=1;
				obj.gridy=2;
				p.add(r2,obj);
				obj.fill=GridBagConstraints.HORIZONTAL;
				obj.gridx=0;
				obj.gridy=3;
				obj.insets=new Insets(10,10,10,10);
				p.add(b1,obj);
				obj.fill=GridBagConstraints.HORIZONTAL;
				obj.gridx=1;
				obj.gridy=3;
				obj.insets=new Insets(10,10,10,10);
				p.add(b2,obj);

				f1.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			new ApplicationSummaryForm();
			f1.setVisible(false);
		}
		if(e.getSource()==b2)
		{
			new ApplicantEducationForm();
			f1.setVisible(false);
		}
	}

}