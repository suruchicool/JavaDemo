import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*

This class is going to have personal details of the form

*/
public class ApplicantPersonalForm implements ActionListener
{
		JFrame f1;
		JPanel p;
		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
		JTextField t1,t2,t3,t4,t5,t6,t7;
		JRadioButton r1,r2;
		JTextArea ta;
		JButton b1,b2;


		public ApplicantPersonalForm()
		{
					f1=new JFrame("Applicant's Personal Details");
					p=new JPanel();
					l1=new JLabel("Applicant's Name");
					l2=new JLabel("Date of Birth");
					l3=new JLabel("Age");
					l4=new JLabel("Gender");
					l5=new JLabel("Address");
					l6=new JLabel("Contact(Mob)");
					l7=new JLabel("Father's Name");
					l8=new JLabel("Father's Occupation");
					l9=new JLabel("Mother's Name");
					t1=new JTextField(15);
					t2=new JTextField(15);
					t3=new JTextField(15);
					t4=new JTextField(15);
					t5=new JTextField(15);
					t6=new JTextField(15);
					t7=new JTextField(15);
					r1=new JRadioButton("Male");
					r2=new JRadioButton("Female");
					ta=new JTextArea();
					b1=new JButton("Next");
					b1.addActionListener(this);
					b2=new JButton("Back");
					b2.addActionListener(this);
					f1.setSize(1000,1000);
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
					p.add(r1,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=1;
					obj.gridy=4;
					obj.insets=new Insets(10,10,10,10);
					p.add(r2,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=0;
					obj.gridy=5;
					obj.insets=new Insets(10,10,10,10);
					p.add(l5,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=1;
					obj.gridy=5;
					obj.insets=new Insets(10,10,10,10);
					p.add(ta,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=0;
					obj.gridy=6;
					obj.insets=new Insets(10,10,10,10);
					p.add(l6,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=1;
					obj.gridy=6;
					obj.insets=new Insets(10,10,10,10);
					p.add(t4,obj);
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
					p.add(b1,obj);
					obj.fill=GridBagConstraints.HORIZONTAL;
					obj.gridx=1;
					obj.gridy=10;
					obj.insets=new Insets(10,10,10,10);
					p.add(b2,obj);

					f1.setVisible(true);
		}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b1)
			{
				new ApplicantEducationForm();
				f1.setVisible(false);
			}
			if(e.getSource()==b2)
			{
				new College();
				f1.setVisible(false);
			}
		}



}