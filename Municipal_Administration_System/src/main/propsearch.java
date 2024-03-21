package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class propsearch extends JInternalFrame {
	JLabel l1, l2, l3, l4, l5, l7;
	JTextField t1, t2, t3, t4;
	JButton b1, b2;
	JRadioButton j1, j2, j3;
	ButtonGroup bg1;
	dbconn obj;

	public propsearch() {
		setTitle("Property Search Form");
		l7 = new JLabel("  -  -  -  PROPERTY   SEARCH   FORM  -  -  -");
		l7.setBounds(100, 10, 550, 30);
		l7.setOpaque(true);
		l7.setFont(new Font("Algerian New", Font.ITALIC, 24));
		l7.setForeground(Color.blue);
		l7.setBackground(Color.lightGray);
		add(l7);
		l1 = new JLabel("Search By");
		l1.setBounds(130, 60, 100, 20);
		l1.setForeground(Color.red);
		add(l1);
		l2 = new JLabel("Unique House Number");
		l2.setBounds(150, 160, 150, 20);
		add(l2);
		l3 = new JLabel("Ward Number");
		l3.setBounds(150, 260, 100, 20);
		add(l3);
		l4 = new JLabel("Holding Number");
		l4.setBounds(150, 310, 100, 20);
		add(l4);
		l5 = new JLabel("Owner Name");
		l5.setBounds(150, 410, 100, 20);
		add(l5);

		t1 = new JTextField();
		t1.setBounds(350, 160, 150, 20);
		add(t1);
		t2 = new JTextField();
		t2.setBounds(350, 260, 150, 20);
		add(t2);
		t3 = new JTextField();
		t3.setBounds(350, 310, 150, 20);
		add(t3);
		t4 = new JTextField();
		t4.setBounds(350, 410, 150, 20);
		add(t4);

		j1 = new JRadioButton("House Number");
		j1.setBounds(130, 110, 150, 20);
		add(j1);
		j2 = new JRadioButton("Ward No & Holding No");
		j2.setBounds(130, 210, 200, 20);
		add(j2);
		j3 = new JRadioButton("Owner Detail");
		j3.setBounds(130, 360, 200, 20);
		add(j3);
		bg1 = new ButtonGroup();
		bg1.add(j1);
		bg1.add(j2);
		bg1.add(j3);
		j1.setForeground(Color.MAGENTA);
		j2.setForeground(Color.MAGENTA);
		j3.setForeground(Color.MAGENTA);

		b1 = new JButton("Search");
		b1.setBounds(250, 510, 100, 20);
		add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b1actionperformed(evt);
			}
		});

		b2 = new JButton("Cancel");
		b2.setBounds(400, 510, 100, 20);
		add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b2actionperformed(evt);
			}
		});

		obj = new dbconn();
		obj.loaddriver();
		obj.conn();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 650);
		setLocation(50, 10);
		setLayout(null);
		setVisible(true);
	}

	private void b1actionperformed(ActionEvent evt) {

	}

	private void b2actionperformed(ActionEvent evt) {
		this.dispose();
	}
}
