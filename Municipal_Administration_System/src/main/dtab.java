package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;

public class dtab extends JFrame {
	DefaultTableModel model;
	JTable t1;
	JLabel l1;
	String col[] = { "Name", "Gender", "Date Of Death", "Place Of Death", "Father Name", "Mother Name", "Reg No",
			"Date Of Reg", "Reason" };

	public dtab() {
		l1 = new JLabel("                   -  -  -  DEATH   SEARCH   RESULT  -  -  -");
		l1.setOpaque(true);
		l1.setFont(new Font("Algerian New", Font.BOLD, 24));
		l1.setForeground(Color.blue);
		l1.setBackground(Color.yellow);

		model = new DefaultTableModel(col, 12);
		t1 = new JTable(model) {
			@Override
			public boolean isCellEditable(int arg0, int arg1) {
				return false;
			}
		};
//t1.setValueAt("ved",0,0);

		JScrollPane sp = new JScrollPane(t1);
		setLayout(new BorderLayout(30, 80));
		add("North", l1);
		add("Center", sp);
		setLocation(100, 10);
		setVisible(true);
		setSize(1000, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		new dtab();
	}
}