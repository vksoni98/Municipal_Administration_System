package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.event.*;

import org.jdesktop.swingx.JXDatePicker;

import java.text.*;
import java.util.Calendar;

class employee extends JInternalFrame {
	JScrollBar s;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19;
	JTextField t1, t2, t3, t4, t112, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19;
	JButton b1, b2;
	JRadioButton j1, j2;
	JScrollPane sp;
	dbconn obj;
	JCheckBox ch;
	JComboBox cb1, cs, cc, ps, pc;
	ButtonGroup bg1;
	JPasswordField p5;
	JPanel pn1, pn2, pn3, pn4, pn5, mp;
	JXDatePicker jd;

	public employee() {
		mp = new JPanel();
		mp.setPreferredSize(new Dimension(970, 670));
		mp.setLayout(null);

		pn1 = new JPanel();
		pn1.setLayout(null);
		pn1.setBounds(250, 0, 300, 35);
		pn1.setBackground(Color.white);
		pn1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 255), 2)));
		l19 = new JLabel("EMPLOYEE          ACCOUNT          FORM");
		l19.setBounds(30, 7, 550, 25);
		pn1.add(l19);
		mp.add(pn1);

		pn2 = new JPanel();
		pn2.setLayout(null);
		pn2.setBounds(15, 40, 340, 210);
		pn2.setBackground(Color.white);
		pn2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 255, 0), 2),
				"PERSONAL INFORMATION"));
		l1 = new JLabel("Employee Id");
		l1.setBounds(20, 25, 100, 20);
		pn2.add(l1);
		mp.add(pn2);
		t1 = new JTextField();
		t1.setBounds(130, 25, 160, 20);
		pn2.add(t1);
		mp.add(pn2);
		l2 = new JLabel("Name");
		l2.setBounds(20, 75, 100, 20);
		pn2.add(l2);
		mp.add(pn2);
		t4 = new JTextField();
		t4.setBounds(130, 75, 160, 20);
		pn2.add(t4);
		mp.add(pn2);
		l3 = new JLabel("Date of Registration");
		l3.setBounds(20, 125, 150, 20);
		pn2.add(l3);
		mp.add(pn2);
		jd = new JXDatePicker();
		jd.setDate(Calendar.getInstance().getTime());
		jd.setFormats(new SimpleDateFormat("dd/MM/yyyy"));
		jd.setBounds(140, 125, 150, 20);
		pn2.add(jd);
		mp.add(pn2);
		l4 = new JLabel("Gender");
		l4.setBounds(20, 175, 200, 20);
		pn2.add(l4);
		mp.add(pn2);
		j1 = new JRadioButton("Male");
		j1.setBounds(130, 175, 90, 20);
		pn2.add(j1);
		mp.add(pn2);
		j2 = new JRadioButton("Female");
		j2.setBounds(230, 175, 90, 20);
		pn2.add(j2);
		mp.add(pn2);
		bg1 = new ButtonGroup();
		bg1.add(j1);
		bg1.add(j2);
		mp.add(pn2);

		pn3 = new JPanel();
		pn3.setLayout(null);
		pn3.setBounds(420, 40, 450, 210);
		pn3.setBackground(Color.white);
		pn3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 255, 0), 2),
				"ACCOUNT INFORMATION"));
		l5 = new JLabel("Email - id");
		l5.setBounds(20, 25, 100, 20);
		pn3.add(l5);
		mp.add(pn3);
		t15 = new JTextField();
		t15.setBounds(130, 25, 160, 20);
		pn3.add(t15);
		mp.add(pn3);
		l6 = new JLabel("Mobile no");
		l6.setBounds(20, 75, 100, 20);
		pn3.add(l6);
		mp.add(pn3);
		t17 = new JTextField();
		t17.setBounds(130, 75, 160, 20);
		pn3.add(t17);
		mp.add(pn3);
		l7 = new JLabel("User Name");
		l7.setBounds(20, 125, 100, 20);
		pn3.add(l7);
		mp.add(pn3);
		t18 = new JTextField();
		t18.setBounds(130, 125, 160, 20);
		pn3.add(t18);
		mp.add(pn3);
		l8 = new JLabel("Password");
		l8.setBounds(20, 175, 100, 20);
		pn3.add(l8);
		mp.add(pn3);
		p5 = new JPasswordField();
		p5.setBounds(130, 175, 160, 20);
		pn3.add(p5);
		mp.add(pn3);

		pn4 = new JPanel();
		pn4.setLayout(null);
		pn4.setBounds(15, 270, 350, 300);
		pn4.setBackground(Color.white);
		pn4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 255, 0), 2),
				"CORRESSPONDANCE    ADDRESS"));
		l9 = new JLabel("House No.");
		l9.setBounds(20, 40, 100, 20);
		pn4.add(l9);
		mp.add(pn4);
		t7 = new JTextField();
		t7.setBounds(130, 40, 160, 20);
		pn4.add(t7);
		mp.add(pn4);
		l10 = new JLabel("Street/Lane");
		l10.setBounds(20, 90, 100, 20);
		pn4.add(l10);
		mp.add(pn4);
		t9 = new JTextField();
		t9.setBounds(130, 90, 160, 20);
		pn4.add(t9);
		mp.add(pn4);
		l11 = new JLabel("State");
		l11.setBounds(20, 140, 100, 20);
		pn4.add(l11);
		cs = new JComboBox();
		cs.setBounds(130, 140, 160, 20);
		pn4.add(cs);
		mp.add(pn4);
		l12 = new JLabel("City");
		l12.setBounds(20, 190, 100, 20);
		pn4.add(l12);
		cc = new JComboBox();
		cc.setBounds(130, 190, 160, 20);
		pn4.add(cc);
		mp.add(pn4);
		l13 = new JLabel("Pincode");
		l13.setBounds(20, 240, 100, 20);
		pn4.add(l13);
		mp.add(pn4);
		t14 = new JTextField();
		t14.setBounds(130, 240, 160, 20);
		pn4.add(t14);
		mp.add(pn4);

		pn5 = new JPanel();
		pn5.setLayout(null);
		pn5.setBounds(420, 270, 450, 330);
		pn5.setBackground(Color.white);
		pn5.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 255, 0), 2),
				"PERMANENT    ADDRESS"));
		ch = new JCheckBox("   Same As Corresspondance");
		ch.setBounds(20, 40, 200, 20);
		pn5.add(ch);
		mp.add(pn5);
		l14 = new JLabel("House No.");
		l14.setBounds(20, 90, 100, 20);
		pn5.add(l14);
		mp.add(pn5);
		t11 = new JTextField();
		t11.setBounds(130, 90, 160, 20);
		pn5.add(t11);
		mp.add(pn5);
		l15 = new JLabel("Street/Lane");
		l15.setBounds(20, 140, 100, 20);
		pn5.add(l15);
		mp.add(pn5);
		t112 = new JTextField();
		t112.setBounds(130, 140, 160, 20);
		pn5.add(t112);
		l16 = new JLabel("State");
		l16.setBounds(20, 190, 100, 20);
		pn5.add(l16);
		ps = new JComboBox();
		ps.setBounds(130, 190, 160, 20);
		pn5.add(ps);
		mp.add(pn5);
		l17 = new JLabel("City");
		l17.setBounds(20, 240, 100, 20);
		pn5.add(l17);
		mp.add(pn5);
		pc = new JComboBox();
		pc.setBounds(130, 240, 160, 20);
		pn5.add(pc);
		mp.add(pn5);
		l18 = new JLabel("Pincode");
		l18.setBounds(20, 290, 100, 20);
		pn5.add(l18);
		mp.add(pn5);
		t13 = new JTextField();
		t13.setBounds(130, 290, 160, 20);
		pn5.add(t13);
		mp.add(pn5);

		b1 = new JButton("Register");
		b1.setBounds(50, 600, 100, 30);
		mp.add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b1actionperform(evt);
			}
		});

		b2 = new JButton("Cancel");
		b2.setBounds(200, 600, 100, 30);
		mp.add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b2actionperformed(evt);
			}
		});

		obj = new dbconn();
		obj.loaddriver();
		obj.conn();
		obj.fetch("select distinct state from sc");
		try {
			while (obj.rs.next()) {
				cs.addItem(obj.rs.getString(1));
				ps.addItem(obj.rs.getString(1));
			}
			cs.setSelectedItem(null);
			ps.setSelectedItem(null);

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}

		cc.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuWillBecomeVisible(PopupMenuEvent evt) {
				ccpopupmenu(evt);
			}

			public void popupMenuWillBecomeInvisible(PopupMenuEvent evt) {
			}

			public void popupMenuCanceled(PopupMenuEvent evt) {
			}
		});

		ch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				chactionperformed(evt);
			}
		});

		pc.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuWillBecomeVisible(PopupMenuEvent evt) {
				pcpopupmenu(evt);
			}

			public void popupMenuWillBecomeInvisible(PopupMenuEvent evt) {
			}

			public void popupMenuCanceled(PopupMenuEvent evt) {
			}
		});

		setLocation(50, 10);
		setLayout(new BorderLayout());
		sp = new JScrollPane(mp);
		add(sp);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 700);
		setVisible(true);
	}// end of constructor

	char gender;

	private void b1actionperform(ActionEvent evt) {
		String address1 = t7.getText() + " " + t9.getText() + " " + cc.getSelectedItem() + " " + cs.getSelectedItem()
				+ " " + t14.getText();
		String address2 = t11.getText() + " " + t112.getText() + " " + pc.getSelectedItem() + " " + ps.getSelectedItem()
				+ " " + t13.getText();
		SimpleDateFormat ft = new SimpleDateFormat("dd-MMM-yy");
		String dor = ft.format(jd.getDate());
		if (j1.isSelected())
			gender = 'M';
		else
			gender = 'F';
		String qry = "insert into employee values('" + t1.getText() + "','" + t4.getText() + "','" + dor + "','"
				+ gender + "','" + t15.getText() + "','" + t17.getText() + "','" + t18.getText() + "','"
				+ new String(p5.getPassword()) + "','" + address1 + "','" + address2 + "')";
		try {
			obj.st.executeUpdate(qry);
			JOptionPane.showMessageDialog(this, "1 Employee Created Successfully");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
	}

	private void chactionperformed(ActionEvent evt) {
		if (ch.isSelected()) {
			t11.setText(t7.getText());
			t112.setText(t9.getText());
			ps.setSelectedItem(cs.getSelectedItem());
			fill_city();
			pc.setSelectedItem(cc.getSelectedItem());
			t13.setText(t14.getText());
		} else {
			t11.setText(null);
			t112.setText(null);
			ps.setSelectedItem(null);
			pc.setSelectedItem(null);
			t13.setText(null);
		}
	}

	private void pcpopupmenu(PopupMenuEvent evt) {
		fill_city();
	}

	void fill_city() {
		pc.removeAllItems();
		obj.fetch("select city from sc where state='" + ps.getSelectedItem() + "'");
		try {
			while (obj.rs.next()) {
				pc.addItem(obj.rs.getString(1));
			}
			pc.setSelectedItem(null);
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}
	}

	private void ccpopupmenu(PopupMenuEvent evt) {
		cc.removeAllItems();
		obj.fetch("select city from sc where state='" + cs.getSelectedItem() + "'");
		try {
			while (obj.rs.next()) {
				cc.addItem(obj.rs.getString(1));
			}
			cc.setSelectedItem(null);
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}

	}

	private void b2actionperformed(ActionEvent evt) {
		this.dispose();
	}

}
