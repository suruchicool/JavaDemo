import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*

This class is going to contain all the details of the student in a summarised way




*/
public class ApplicationSummaryForm
{
	JFrame f1;
	JPanel p;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2;

	public ApplicationSummaryForm()
	{
		f1=new JFrame("Application Summary Form");
		p=new JPanel();
		l1=new JLabel("Applicant's Name");
		l2=new JLabel("Name of the College");
		l3=new JLabel("Branch");
		l4=new JLabel("Annual Fee");
		t1=new JTextField(15);
		t2=new JTextField(15);
		t3=new JTextField(15);
		t4=new JTextField(15);
		b1=new JButton("Freeze");

		//b1.addActionListener(this);
		b2=new JButton("Submit");
		//b2.addActionListener(this);
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
		p.add(t2,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=0;
		obj.gridy=2;
		p.add(l3,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
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
		p.add(b1,obj);
		obj.fill=GridBagConstraints.HORIZONTAL;
		obj.gridx=1;
		obj.gridy=4;
		obj.insets=new Insets(10,10,10,10);
		p.add(b2,obj);

		f1.setVisible(true);
	}



}