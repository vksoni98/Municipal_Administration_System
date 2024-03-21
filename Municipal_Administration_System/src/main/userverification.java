package main;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

class userverification extends JFrame {
	JLabel l1, l2, l3, l4;
	JTextField t1, t2, t3, t4, t5;
	JButton b1, b2;

	public userverification() {
		Icon icon = new ImageIcon("image1.jpg");
		l4 = new JLabel(icon);
		l4.setBounds(700, 50, 460, 350);
		l4.setOpaque(true);
		l4.setBackground(Color.cyan);
		add(l4);

		l1 = new JLabel("     ADMIN VERIFICATION  ");
		l1.setBounds(250, 20, 150, 30);
		l1.setOpaque(true);
		l1.setBackground(Color.CYAN);
		add(l1);

		l2 = new JLabel("     Company Name  ");
		l2.setBounds(120, 80, 200, 20);
		add(l2);
		t1 = new JTextField();
		t1.setBounds(290, 80, 150, 20);
		add(t1);

		l3 = new JLabel("     Product Key  ");
		l3.setBounds(120, 130, 150, 20);
		add(l3);
		t2 = new JTextField();
		t2.setBounds(290, 130, 50, 20);
		add(t2);
		t2.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				t2keyReleased(evt);
			}
		});

		t3 = new JTextField();
		t3.setBounds(341, 130, 50, 20);
		add(t3);
		t3.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				t3keyReleased(evt);
			}
		});

		t4 = new JTextField();
		t4.setBounds(392, 130, 50, 20);
		add(t4);
		t4.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				t4keyReleased(evt);
			}
		});

		t5 = new JTextField();
		t5.setBounds(444, 130, 50, 20);
		add(t5);
		t5.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				t5keyReleased(evt);
			}
		});

		b1 = new JButton("Ok");
		b1.setBounds(200, 200, 100, 30);
		add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b1actionperformed(evt);
			}
		});

		b2 = new JButton("CANCEL");
		b2.setBounds(350, 200, 100, 30);
		add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b2actionperformed(evt);
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		JFrame frame = new JFrame("Login Form");
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}

	private void t2keyReleased(KeyEvent evt) {
		if (t2.getText().length() == 4)
			t3.grabFocus();
	}

	private void t3keyReleased(KeyEvent evt) {
		if (t3.getText().length() == 4)
			t4.grabFocus();
	}

	private void t4keyReleased(KeyEvent evt) {
		if (t4.getText().length() == 4)
			t5.grabFocus();
	}

	private void t5keyReleased(KeyEvent evt) {
		if (t5.getText().length() == 4)
			b1.grabFocus();
	}

	private void b2actionperformed(ActionEvent evt) {
		Index obj = new Index();
		this.dispose();
		obj.setVisible(true);
	}

	private void b1actionperformed(ActionEvent evt) {
		dbconn obj = new dbconn();
		obj.loaddriver();
		obj.conn();
		obj.fetch("select * from userauthentication");
		String key = t2.getText() + t3.getText() + t4.getText() + t5.getText();
		try {
			obj.rs.next();
			if (obj.rs.getString(1).equals(t1.getText()) && obj.rs.getString(2).equals(key)) {
				admin obj1 = new admin();
				this.dispose();
				obj1.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(this, "Company name and Product key is invalid:");
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
	}

	public static void main(String s[]) {
		new userverification();
	}
}
