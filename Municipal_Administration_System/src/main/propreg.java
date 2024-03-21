package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.event.*;
import java.text.*;

class propreg extends JInternalFrame {
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18;
	JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15;
	JButton b1, b2;
	JRadioButton j1, j2;
	ButtonGroup bg1;
	dbconn obj;
	JComboBox cb1, cb2, cb3;
	JPanel pn1, pn2, pn3;

	public propreg() {
		pn1 = new JPanel();
		pn1.setLayout(null);
		pn1.setBounds(250, 15, 300, 35);
		pn1.setBackground(Color.white);
		pn1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 0, 0), 2)));
		l18 = new JLabel("PROPERTY         REGISTRATION          FORM");
		l18.setBounds(30, 7, 550, 25);
		pn1.add(l18);
		add(pn1);

		pn2 = new JPanel();
		pn2.setLayout(null);
		pn2.setBounds(15, 80, 830, 330);
		pn2.setBackground(Color.white);
		pn2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 255, 0), 2),
				"BASIC INFORMATION"));

		l1 = new JLabel("Ward Number");
		l1.setBounds(70, 30, 100, 20);
		pn2.add(l1);
		add(pn2);

		t1 = new JTextField();
		t1.setBounds(210, 30, 160, 20);
		pn2.add(t1);

		l2 = new JLabel("Unique House No");
		l2.setBounds(70, 65, 100, 20);
		pn2.add(l2);
		add(pn2);

		t2 = new JTextField();
		t2.setBounds(210, 65, 160, 20);
		pn2.add(t2);

		l3 = new JLabel("Property Type");
		l3.setBounds(70, 100, 100, 20);
		pn2.add(l3);

		cb1 = new JComboBox();
		cb1.addItem("Vacant Land");
		cb1.addItem("Agricultural Land");
		cb1.addItem("Resideantial");
		cb1.addItem("Commercial");
		cb1.setBounds(210, 100, 160, 20);
		cb1.setSelectedItem(null);
		pn2.add(cb1);

		l4 = new JLabel("Address");
		l4.setBounds(70, 135, 100, 20);
		pn2.add(l4);

		t3 = new JTextField();
		t3.setBounds(210, 135, 160, 20);
		pn2.add(t3);

		l5 = new JLabel("Muhalla");
		l5.setBounds(70, 170, 100, 20);
		pn2.add(l5);

		t4 = new JTextField();
		t4.setBounds(210, 170, 160, 20);
		pn2.add(t4);

		l6 = new JLabel("Khata");
		l6.setBounds(70, 205, 100, 20);
		pn2.add(l6);

		t5 = new JTextField();
		t5.setBounds(210, 205, 160, 20);
		pn2.add(t5);

		l7 = new JLabel("Mauja Name");
		l7.setBounds(70, 240, 100, 20);
		pn2.add(l7);

		t6 = new JTextField();
		t6.setBounds(210, 240, 160, 20);
		pn2.add(t6);

		l8 = new JLabel("Width Of Road(in feet)");
		l8.setBounds(70, 275, 100, 20);
		pn2.add(l8);

		t7 = new JTextField();
		t7.setBounds(210, 275, 160, 20);
		pn2.add(t7);

		l9 = new JLabel("Holding No");
		l9.setBounds(500, 30, 100, 20);
		pn2.add(l9);

		t8 = new JTextField();
		t8.setBounds(630, 30, 160, 20);
		pn2.add(t8);

		l10 = new JLabel("Ownership type");
		l10.setBounds(500, 65, 100, 20);
		pn2.add(l10);

		cb2 = new JComboBox();
		cb2.addItem("Sole Ownership");
		cb2.addItem("Joint Tanancy");
		cb2.addItem("Tenancy In Common");
		cb2.addItem("Community Property");
		cb2.setBounds(630, 65, 160, 20);
		cb2.setSelectedItem(null);
		pn2.add(cb2);

		l10 = new JLabel("Thana");
		l10.setBounds(500, 100, 100, 20);
		pn2.add(l10);

		t9 = new JTextField();
		t9.setBounds(630, 100, 160, 20);
		pn2.add(t9);

		l11 = new JLabel("Entry Type");
		l11.setBounds(500, 135, 100, 20);
		pn2.add(l11);

		cb3 = new JComboBox();
		cb3.addItem("Assesment");
		cb3.addItem("Joint Tanancy");
		cb3.addItem("Tenancy In Common");
		cb3.addItem("Community Property");
		cb3.setBounds(630, 135, 160, 20);
		cb3.setSelectedItem(null);
		pn2.add(cb3);

		l12 = new JLabel("Plot Number");
		l12.setBounds(500, 170, 100, 20);
		pn2.add(l12);

		t10 = new JTextField();
		t10.setBounds(630, 170, 160, 20);
		pn2.add(t10);

		l13 = new JLabel("Area Of Plot");
		l13.setBounds(500, 205, 100, 20);
		pn2.add(l13);

		t11 = new JTextField();
		t11.setBounds(630, 205, 160, 20);
		pn2.add(t11);

		l13 = new JLabel("Rainwater    Harvesting   Provision :");
		l13.setBounds(500, 240, 250, 20);
		pn2.add(l13);

		j1 = new JRadioButton("Yes");
		j1.setBounds(550, 275, 50, 20);
		pn2.add(j1);

		j2 = new JRadioButton("No");
		j2.setBounds(650, 275, 50, 20);
		pn2.add(j2);

		bg1 = new ButtonGroup();
		bg1.add(j1);
		bg1.add(j2);

		pn3 = new JPanel();
		pn3.setLayout(null);
		pn3.setBounds(15, 430, 830, 100);
		pn3.setBackground(Color.white);
		pn3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 255, 0), 2),
				"OWNER INFORMATION"));
		add(pn3);

		l14 = new JLabel("Owner Name");
		l14.setBounds(70, 30, 100, 20);
		pn3.add(l14);

		t12 = new JTextField();
		t12.setBounds(210, 30, 160, 20);
		pn3.add(t12);

		l15 = new JLabel("R/W Guardian");
		l15.setBounds(70, 65, 100, 20);
		pn3.add(l15);

		t13 = new JTextField();
		t13.setBounds(210, 65, 160, 20);
		pn3.add(t13);

		l16 = new JLabel("Guardian Name");
		l16.setBounds(500, 30, 100, 20);
		pn3.add(l16);

		t14 = new JTextField();
		t14.setBounds(630, 30, 160, 20);
		pn3.add(t14);

		l17 = new JLabel("Contact No");
		l17.setBounds(500, 65, 100, 20);
		pn3.add(l17);

		t15 = new JTextField();
		t15.setBounds(630, 65, 160, 20);
		pn3.add(t15);

		b1 = new JButton("Register");
		b1.setBounds(450, 550, 100, 30);
		add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b1actionperform(evt);
			}
		});

		b2 = new JButton("Cancel");
		b2.setBounds(600, 550, 100, 30);
		add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b2actionperformed(evt);
			}
		});

		obj = new dbconn();
		obj.loaddriver();
		obj.conn();

		setClosable(true);
		setLocation(50, 10);
		setLayout(null);
		setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		setSize(900, 650);
		setVisible(true);
	}// end of constructor

	private void b1actionperform(ActionEvent evt) {
		String rain;
		if (j1.isSelected())
			rain = "Yes";
		else
			rain = "No";
		String qry = "insert into prop_reg values(" + t1.getText() + ",'" + t2.getText() + "','" + cb1.getSelectedItem()
				+ "','" + t3.getText() + "','" + t4.getText() + "','" + t5.getText() + "','" + t6.getText() + "','"
				+ t7.getText() + "','" + t8.getText() + "','" + cb2.getSelectedItem() + "'," + t9.getText() + ",'"
				+ cb3.getSelectedItem() + "'," + t10.getText() + ",'" + t11.getText() + "','" + rain + "','"
				+ t12.getText() + "','" + t13.getText() + "','" + t14.getText() + "','" + t15.getText() + "')";
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
