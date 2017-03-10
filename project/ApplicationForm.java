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
	JPanel p;
	JLabel l1,l2;
	JTextField t1;
	JRadioButton r1,r2;
	JButton b1,b2;

	public ApplicationForm()
	{
		f1=new JFrame("Application Form");
		p=new JPanel();
		l1=new JLabel("Name of the College");
		l2=new JLabel("Select Stream");
		t1=new JTextField(15);
		r1=new JRadioButton("BBA");
		r2=new JRadioButton("BCA");
		b1=new JButton("Next");
		b1.addActionListener(this);
		b2=new JButton("Back");
		b2.addActionListener(this);
		f1.setSize(500,500);
		f1.add(p);

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