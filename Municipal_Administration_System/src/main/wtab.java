package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;

public class wtab extends JInternalFrame {
	DefaultTableModel model;
	JTable t1;
	JLabel l1;
	JButton b1, b2;
	JTextField tf1;
	String col[] = { "Name", "Gender", "Date Of Death", "Place Of Death", "Father Name", "Mother Name", "Reg No",
			"Date Of Reg", "Reason" };

	public wtab() {
		JPanel p1 = new JPanel();
		l1 = new JLabel("Enter Ward Number     ");
		l1.setOpaque(true);
		l1.setForeground(Color.blue);
		tf1 = new JTextField();
		tf1.setPreferredSize(new Dimension(150, 20));
		b1 = new JButton("Get List");
		b1.setPreferredSize(new Dimension(100, 20));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b1actionperformed(evt);
			}
		});
		b2 = new JButton("Cancel");
		b2.setPreferredSize(new Dimension(100, 20));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b2actionperformed(evt);
			}
		});
		p1.add(l1);
		p1.add(tf1);
		p1.add(b1);
		p1.add(b2);

		model = new DefaultTableModel(col, 20);
		t1 = new JTable(model) {
			@Override
			public boolean isCellEditable(int arg0, int arg1) {
				return false;
			}
		};
//t1.setValueAt("ved",0,0);

		JScrollPane sp = new JScrollPane(t1);
		setLayout(new BorderLayout(30, 80));
		add("North", p1);
		add("Center", sp);
		setLocation(100, 10);
		setVisible(true);
		setSize(1000, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void b1actionperformed(ActionEvent evt) {

	}

	private void b2actionperformed(ActionEvent evt) {
		this.dispose();
	}
}