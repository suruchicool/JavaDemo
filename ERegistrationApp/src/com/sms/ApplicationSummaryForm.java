package com.sms;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*

This class is going to contain all the details of the student in a summarised way




*/
public class ApplicationSummaryForm
{
	JFrame f1;
	JPanel p,p0;
	JLabel l,l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2;
	JLayeredPane lp;
	Font f;

	public ApplicationSummaryForm()
	{
		f1=new JFrame("Application Summary Form");
		p=new JPanel();
		p0=new JPanel();
		l=new JLabel();
		l1=new JLabel("Applicant's Name");
		l2=new JLabel("Name of the College");
		l3=new JLabel("Branch");
		l4=new JLabel("Annual Fee");
		t1=new JTextField(15);
		t2=new JTextField(15);
		t3=new JTextField(15);
		t4=new JTextField(15);
		b1=new JButton("Freeze");
		lp=new JLayeredPane();
		f=new Font("Comic Sans MS",Font.ITALIC,16);
		//b1.addActionListener(this);
		b2=new JButton("Submit");
		//b2.addActionListener(this);
		f1.setSize(1000,1000);
		f1.add(lp);
		f1.add(lp);
		p0.add(l);
		p.setOpaque(false);

		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);

		l.setIcon(new ImageIcon("E://java/CollegeProject/project/workspace_bg5.jpg"));

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