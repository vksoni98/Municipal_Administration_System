package main;

import javax.swing.*;

import org.jdesktop.swingx.JXDatePicker;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.*;
import java.util.Calendar;

class birthreg extends JInternalFrame {
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
	JTextField t1, t2, t3, t4, t5;
	JButton b1, b2;
	JRadioButton j1, j2;
	ButtonGroup bg1;
	dbconn obj;
	JXDatePicker jd1, jd2;

	public birthreg() {
		setTitle("Birth Registration Form");
		l9 = new JLabel("  -  -  -  BIRTH   REGISTRATION   FORM  -  -  -");
		l9.setBounds(100, 40, 550, 30);
		l9.setOpaque(true);
		l9.setFont(new Font("Algerian New", Font.ITALIC, 24));
		l9.setForeground(Color.RED);
		l9.setBackground(Color.CYAN);
		add(l9);
		l1 = new JLabel("Applicant Name");
		l1.setBounds(150, 100, 100, 20);
		add(l1);
		l2 = new JLabel("Gender");
		l2.setBounds(150, 150, 100, 20);
		add(l2);
		l3 = new JLabel("Date Of Birth");
		l3.setBounds(150, 200, 100, 20);
		add(l3);
		l4 = new JLabel("Place Of Birth");
		l4.setBounds(150, 250, 100, 20);
		add(l4);
		l5 = new JLabel("Father Name");
		l5.setBounds(150, 300, 100, 20);
		add(l5);
		l6 = new JLabel("Mother Name");
		l6.setBounds(150, 350, 100, 20);
		add(l6);
		l7 = new JLabel("Registration Number");
		l7.setBounds(150, 400, 150, 20);
		add(l7);
		l8 = new JLabel("Date Of Registration");
		l8.setBounds(150, 450, 150, 20);
		add(l8);

		t1 = new JTextField();
		t1.setBounds(350, 100, 150, 20);
		add(t1);
		t2 = new JTextField();
		t2.setBounds(350, 250, 150, 20);
		add(t2);
		t3 = new JTextField();
		t3.setBounds(350, 300, 150, 20);
		add(t3);
		t4 = new JTextField();
		t4.setBounds(350, 350, 150, 20);
		add(t4);
		t5 = new JTextField();
		t5.setBounds(350, 400, 150, 20);
		add(t5);

		j1 = new JRadioButton("Male");
		j1.setBounds(350, 150, 80, 20);
		add(j1);
		j2 = new JRadioButton("Female");
		j2.setBounds(450, 150, 80, 20);
		add(j2);
		bg1 = new ButtonGroup();
		bg1.add(j1);
		bg1.add(j2);

		jd1 = new JXDatePicker();
		jd1.setDate(Calendar.getInstance().getTime());
		jd1.setFormats(new SimpleDateFormat("dd/MM/yyyy"));
		jd1.setBounds(350, 200, 150, 20);
		add(jd1);
		jd2 = new JXDatePicker();
		jd2.setDate(Calendar.getInstance().getTime());
		jd2.setFormats(new SimpleDateFormat("dd/MM/yyyy"));
		jd2.setBounds(350, 450, 150, 20);
		add(jd2);

		b1 = new JButton("Save");
		b1.setBounds(250, 500, 100, 20);
		add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b1actionperformed(evt);
			}
		});

		b2 = new JButton("CANCEL");
		b2.setBounds(400, 500, 100, 20);
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
		setSize(900, 600);
		setLocation(50, 50);
		setLayout(null);
		setVisible(true);
	}

	private void b1actionperformed(ActionEvent evt) {
		SimpleDateFormat ft = new SimpleDateFormat("dd-MMM-yy");
		String dob = ft.format(jd1.getDate());
		String dor = ft.format(jd2.getDate());
		String gender;
		if (j1.isSelected())
			gender = "Male";
		else
			gender = "Female";
		String qry = "insert into birth_reg values('" + t1.getText() + "','" + gender + "','" + dob + "','"
				+ t2.getText() + "','" + t3.getText() + "','" + t4.getText() + "','" + t5.getText() + "','" + dor
				+ "')";
		try {
			obj.st.executeUpdate(qry);
			JOptionPane.showMessageDialog(this, "Registered Successfully");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
		}

	}

	private void b2actionperformed(ActionEvent evt) {
		this.dispose();
	}

}
