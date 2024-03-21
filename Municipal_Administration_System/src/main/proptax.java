package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.event.*;
import java.text.*;

class proptax extends JInternalFrame {
	JLabel l1, l2, l3, l4, l5, l6, l7, l8;
	JTextField t1, t2, t3, t4, t5, t6, t7;
	JButton b1, b2, b3;
	dbconn obj;
	JPanel pn1;

	public proptax() {
		pn1 = new JPanel();
		pn1.setLayout(null);
		pn1.setBounds(250, 15, 300, 35);
		pn1.setBackground(Color.white);
		pn1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 0, 0), 2)));
		l8 = new JLabel("PROPERTY         TAX          PAYMENT");
		l8.setBounds(30, 7, 550, 25);
		pn1.add(l8);
		add(pn1);

		l1 = new JLabel("Ward Number");
		l1.setBounds(70, 80, 100, 20);
		add(l1);

		t1 = new JTextField();
		t1.setBounds(210, 80, 160, 20);
		add(t1);

		l2 = new JLabel("Unique House No");
		l2.setBounds(70, 120, 100, 20);
		add(l2);

		t2 = new JTextField();
		t2.setBounds(210, 120, 160, 20);
		add(t2);

		l3 = new JLabel("Tax Amount Per Decimal Per Year (In Rupees)");
		l3.setBounds(70, 160, 300, 20);
		add(l3);

		t3 = new JTextField();
		t3.setBounds(360, 160, 160, 20);
		add(t3);

		b1 = new JButton("Calculate Tax");
		b1.setBounds(70, 200, 120, 20);
		add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b1actionperform(evt);
			}
		});

		l4 = new JLabel("Area Of Plot (In Decimal)");
		l4.setBounds(70, 240, 300, 20);
		add(l4);

		t4 = new JTextField();
		t4.setBounds(340, 240, 160, 20);
		add(t4);

		l5 = new JLabel("Total Amount To Be Paid (In Rupees)");
		l5.setBounds(70, 280, 300, 20);
		add(l5);

		t5 = new JTextField();
		t5.setBounds(340, 280, 160, 20);
		add(t5);

		l6 = new JLabel("Holding No");
		l6.setBounds(420, 80, 100, 20);
		add(l6);

		t6 = new JTextField();
		t6.setBounds(570, 80, 100, 20);
		add(t6);

		l7 = new JLabel("No Of Years");
		l7.setBounds(420, 120, 100, 20);
		add(l7);

		t7 = new JTextField();
		t7.setBounds(570, 120, 100, 20);
		add(t7);

		b2 = new JButton("Pay");
		b2.setBounds(200, 320, 100, 30);
		add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b2actionperformed(evt);
			}
		});

		b3 = new JButton("Cancel");
		b3.setBounds(400, 320, 100, 30);
		add(b3);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b3actionperformed(evt);
			}
		});

		obj = new dbconn();
		obj.loaddriver();
		obj.conn();

		setTitle("Property Tax Payment");
		setLocation(100, 10);
		setLayout(null);
		setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		setSize(750, 450);
		setVisible(true);
	}// end of constructor

	private void b1actionperform(ActionEvent evt) {

	}

	private void b2actionperformed(ActionEvent evt) {

	}

	private void b3actionperformed(ActionEvent evt) {
		this.dispose();
	}
}
