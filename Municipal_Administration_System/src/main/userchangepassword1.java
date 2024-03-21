package main;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class userchangepassword1 extends JInternalFrame {
	JPanel p1;
	JLabel l1, l2, l3, l4, l5;
	JTextField t1;
	JPasswordField t2, t3, t4;
	JButton b1, b3;

	public userchangepassword1() {
		setClosable(true);
		setIconifiable(true);
		l1 = new JLabel("WELCOME Mr/Mrs");
		l1.setBounds(400, 120, 200, 30);
		l1.setForeground(Color.BLUE);
		t1 = new JTextField();
		t1.setBounds(600, 120, 160, 30);
		t1.setText(Index.username);

		l2 = new JLabel("ENTER OLD PASSWORD");
		l2.setBounds(400, 160, 150, 30);
		l2.setForeground(Color.BLUE);
		t2 = new JPasswordField();
		t2.setBounds(600, 160, 160, 30);
		l3 = new JLabel("ENTER NEW PASSWORD");
		l3.setBounds(400, 200, 200, 30);
		l3.setForeground(Color.BLUE);
		t3 = new JPasswordField();
		t3.setBounds(600, 200, 160, 30);
		l4 = new JLabel("CONFIRM PASSWORD");
		l4.setBounds(400, 240, 200, 30);
		l4.setForeground(Color.BLUE);
		t4 = new JPasswordField();
		t4.setBounds(600, 240, 160, 30);
		l5 = new JLabel("EMPLOYEE CHANGE PASSWORD");
		l5.setBorder(BorderFactory.createEtchedBorder());
		l5.setBounds(400, 50, 350, 30);
		l5.setFont(new Font("AR JULIAN", Font.BOLD, 20));
		l5.setForeground(Color.GREEN);
		b1 = new JButton("UPDATE");
		b1.setBounds(350, 350, 100, 30);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1actionperformed(e);
			}
		});
		b3 = new JButton("CANCEL");
		b3.setBounds(550, 350, 100, 30);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b3actionperformed(e);
			}
		});
		p1 = new JPanel();
		p1.setLocation(10, 10);
		p1.setSize(1050, 1050);
		p1.setLayout(null);
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(l4);
		p1.add(l5);
		p1.add(t1);
		p1.add(t2);
		p1.add(t3);
		p1.add(t4);
		p1.add(b1);
		p1.add(b3);
		add(p1);
		setLayout(null);
		setLocation(30, 10);
		setSize(1200, 550);
		setVisible(true);
	}

	private void b1actionperformed(ActionEvent e) {
		/*
		 * dbconn obj=new dbconn(); obj.loaddriver(); obj.conn();
		 * obj.fetch("select password from employee where user_name='"+t1.getText()+"'")
		 * ; try { obj.rs.next(); if(obj.rs.getString(1).equals(new
		 * String(t2.getPassword()))) { if(new String(t3.getPassword()).equals(new
		 * String(t4.getPassword()))) { String qry="update employee set password='"+new
		 * String(t3.getPassword())+"' where user_name='"+t1.getText()+"'";
		 * obj.st.executeUpdate(qry);
		 * JOptionPane.showMessageDialog(this,"Password changed successfully"); } else {
		 * JOptionPane.showMessageDialog(this,"password re-type mismatch"); }
		 * 
		 * } else { JOptionPane.showMessageDialog(this,"incorrect Old Password"); }
		 * }catch(SQLException ex) {
		 * JOptionPane.showMessageDialog(this,ex.getMessage()); }
		 */
	}

	private void b3actionperformed(ActionEvent e) {
		this.dispose();
	}
}
