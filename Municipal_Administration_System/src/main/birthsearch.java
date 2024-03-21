package main;

import javax.swing.*;

import org.jdesktop.swingx.JXDatePicker;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class birthsearch extends JInternalFrame {
	JLabel l1, l2, l3, l4, l5, l6, l7;
	JTextField t1, t2, t3, t4;
	JButton b1, b2;
	JRadioButton j1, j2, j3;
	ButtonGroup bg1;
	dbconn obj;
	JXDatePicker jd;

	public birthsearch() {
		setTitle("Birth Search Form");
		l7 = new JLabel("  -  -  -  BIRTH   SEARCH   FORM  -  -  -");
		l7.setBounds(120, 10, 500, 30);
		l7.setOpaque(true);
		l7.setFont(new Font("Algerian New", Font.ITALIC, 24));
		l7.setForeground(Color.RED);
		l7.setBackground(Color.CYAN);
		add(l7);
		l1 = new JLabel("Search By");
		l1.setBounds(130, 60, 100, 20);
		l1.setFont(new Font("Algerian New", Font.BOLD, 16));
		l1.setForeground(Color.RED);
		add(l1);
		l2 = new JLabel("Enter Registration Number");
		l2.setBounds(150, 160, 100, 20);
		add(l2);
		l3 = new JLabel("Applicant Name");
		l3.setBounds(150, 260, 100, 20);
		add(l3);
		l4 = new JLabel("Date Of Birth");
		l4.setBounds(150, 310, 100, 20);
		add(l4);
		l5 = new JLabel("Father Name");
		l5.setBounds(150, 410, 100, 20);
		add(l5);
		l6 = new JLabel("Mother Name");
		l6.setBounds(150, 460, 100, 20);
		add(l6);

		t1 = new JTextField();
		t1.setBounds(350, 160, 150, 20);
		add(t1);
		t2 = new JTextField();
		t2.setBounds(350, 260, 150, 20);
		add(t2);
		t3 = new JTextField();
		t3.setBounds(350, 410, 150, 20);
		add(t3);
		t4 = new JTextField();
		t4.setBounds(350, 460, 150, 20);
		add(t4);

		j1 = new JRadioButton("Registration Number");
		j1.setBounds(130, 110, 200, 20);
		add(j1);
		j2 = new JRadioButton("Applicant Detail");
		j2.setBounds(130, 210, 200, 20);
		add(j2);
		j3 = new JRadioButton("Parents Detail");
		j3.setBounds(130, 360, 200, 20);
		add(j3);
		bg1 = new ButtonGroup();
		bg1.add(j1);
		bg1.add(j2);
		bg1.add(j3);
		j1.setForeground(Color.BLUE);
		j2.setForeground(Color.BLUE);
		j3.setForeground(Color.BLUE);

		jd = new JXDatePicker();
		jd.setDate(Calendar.getInstance().getTime());
		jd.setFormats(new SimpleDateFormat("dd/MM/yyyy"));
		jd.setBounds(350, 310, 150, 20);
		add(jd);

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

	btab obj2 = new btab();

	private void b1actionperformed(ActionEvent evt) {
		if (j1.isSelected()) {
			obj.fetch("select * from birth_reg where reg_no = 't1.getText()' ");
			try {
				while (obj.rs.next()) {
					for (int i = 0; i <= 1; i++) {
						for (int j = 0; j <= 7; j++) {
							obj2.t1.setValueAt(obj.rs.getString(j + 1), i, j);
							this.dispose();
							obj2.setVisible(true);
						}
					}
				}
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(this, e.getMessage());
			}
		} else if (j2.isSelected()) {

		} else if (j3.isSelected()) {

		}

		else {
			JOptionPane.showMessageDialog(this, "First Select The Search Criteria");
		}

	}

	private void b2actionperformed(ActionEvent evt) {
		this.dispose();
	}

}
