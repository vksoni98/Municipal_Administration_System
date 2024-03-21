package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Index extends JFrame {
	public static String username;
	JLabel l1, l2, l3, l4, l5, l6;
	JTextField t1;
	JPasswordField p1;
	JButton b1, b2;
	JRadioButton j1, j2;
	ButtonGroup bg1;
	JPanel glass;
	dbconn obj;

	public Index() {
		obj = new dbconn();
		obj.loaddriver();
		obj.conn();

		getContentPane().setLayout(new BorderLayout());
		getContentPane().setBackground(Color.white);
		getContentPane().add(new JButton("Left"), BorderLayout.WEST);
		getContentPane().add(new JButton("Center"), BorderLayout.CENTER);

		setTitle("Login");
		l1 = new JLabel("MUNICIPAL   ADMINISTRATION   SYSTEM");
		l1.setBounds(300, 50, 500, 30);
		l1.setOpaque(true);
		l1.setFont(new Font("Algerian New", Font.BOLD, 24));
		l1.setForeground(Color.RED);
		l1.setBackground(Color.CYAN);
		add(l1);

		l2 = new JLabel("SELECT USER TYPE");
		l2.setBounds(350, 100, 200, 20);
		add(l2);

		j1 = new JRadioButton("ADMIN");
		j1.setBounds(400, 140, 100, 20);
		add(j1);

		j2 = new JRadioButton("EMPLOYEE");
		j2.setBounds(400, 180, 100, 20);
		add(j2);

		bg1 = new ButtonGroup();
		bg1.add(j1);
		bg1.add(j2);

		l3 = new JLabel("USER ID");
		l3.setBounds(350, 220, 100, 20);
		add(l3);

		t1 = new JTextField();
		t1.setBounds(470, 220, 150, 20);
		add(t1);

		l4 = new JLabel("PASSWORD");
		l4.setBounds(350, 260, 100, 20);
		add(l4);

		p1 = new JPasswordField();
		p1.setBounds(470, 260, 150, 20);
		add(p1);

		b1 = new JButton("LOGIN");
		b1.setBounds(350, 300, 80, 20);
		add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b1actionperformed(evt);
			}
		});

		b2 = new JButton("EXIT");
		b2.setBounds(470, 300, 80, 20);
		add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b2actionperformed(evt);
			}
		});

		l5 = new JLabel("CREATE  NEW  ADMIN");
		l5.setBounds(370, 340, 200, 20);
		l5.setOpaque(true);
		l5.setFont(new Font("Algerian New", Font.BOLD, 15));
		l5.setForeground(Color.BLUE);
		l5.setBackground(Color.WHITE);
		add(l5);
		l5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				l5mouseclicked(evt);
			}
		});

		Icon icon = new ImageIcon("login.jpg");
		l6 = new JLabel(icon);
		l6.setBounds(10, 50, 255, 330);
		l6.setOpaque(true);
		l6.setBackground(Color.white);
		getContentPane().add(l6);

		JFrame frame = new JFrame("Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setSize(900, 600);
		setLocation(250, 50);
		setLayout(null);
		setVisible(true);
	}

	public static String utype = null;

	private void b1actionperformed(ActionEvent evt) {
		if (t1.getText().equals("") || new String(p1.getPassword()).equals("")) {
			JOptionPane.showMessageDialog(this, "Enter User name or Password First");
		}
		boolean flag = false;

		if (j1.isSelected()) {
			utype = "admin";
			obj.fetch("select user_name,password from administrator");
			try {
				while (obj.rs.next()) {
					if (obj.rs.getString(1).equals(t1.getText())
							&& obj.rs.getString(2).equals(new String(p1.getPassword()))) {
						flag = true;
						username = t1.getText();
						splashscreen obj1 = new splashscreen();
						this.dispose();
						obj1.setVisible(true);
					}
				}
				if (flag == false)
					JOptionPane.showMessageDialog(this, "Invalid User name or Password");
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(this, e.getMessage());
			}

		} else if (j2.isSelected()) {
			utype = "user";
			obj.fetch("select user_name,password from employee");
			try {
				while (obj.rs.next()) {
					if (obj.rs.getString(1).equals(t1.getText())
							&& obj.rs.getString(2).equals(new String(p1.getPassword()))) {
						flag = true;
						username = t1.getText();
						splashscreen obj1 = new splashscreen();
						this.dispose();
						obj1.setVisible(true);
					}
				}
				if (flag == false)
					JOptionPane.showMessageDialog(this, "Invalid User name or Password");
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(this, e.getMessage());
			}
		}

		else {
			JOptionPane.showMessageDialog(this, "Select the User type first");
		}
	}

	private void b2actionperformed(ActionEvent evt) {
		System.exit(0);
	}

	private void l5mouseclicked(MouseEvent evt) {
		userverification obj = new userverification();
		this.dispose();
		obj.setVisible(true);
	}

	public static void main(String s[])

	{
		new Index();
	}
}
