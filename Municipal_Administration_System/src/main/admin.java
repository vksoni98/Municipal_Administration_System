package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

import org.jdesktop.swingx.JXDatePicker;

class admin extends JFrame {
	JScrollBar s;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23,
			l24, l25, l26, l27, l28, l29;
	JTextField t1, t2, t3, t4, t112, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19;
	JButton b2, b4;
	JRadioButton j1, j2;
	JScrollPane sp;
	dbconn obj;
	JCheckBox ch;
	JComboBox cb1, cs, cc, ps, pc;
	ButtonGroup bg1;
	JPasswordField p5;
	JPanel pn1, pn2, pn3, pn4, pn5, pn6, pn7, mp;
	JXDatePicker picker;

	public admin() {
		mp = new JPanel();
		mp.setPreferredSize(new Dimension(970, 670));
		mp.setLayout(null);

		pn1 = new JPanel();
		pn1.setLayout(null);
		pn1.setBounds(250, 5, 300, 35);
		pn1.setBackground(Color.white);
		pn1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 0, 0), 2)));
		l25 = new JLabel("ADMINISTRATOR          ACCOUNT          FORM");
		l25.setBounds(30, 7, 550, 25);
		pn1.add(l25);
		mp.add(pn1);

		pn2 = new JPanel();
		pn2.setLayout(null);
		pn2.setBounds(15, 50, 340, 140);
		pn2.setBackground(Color.white);
		pn2.setBorder(
				BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 255), 2), "NAME"));
		l1 = new JLabel("Admin Id");
		l1.setBounds(20, 25, 100, 20);
		pn2.add(l1);
		mp.add(pn2);
		t1 = new JTextField();
		t1.setBounds(130, 25, 160, 20);
		pn2.add(t1);
		mp.add(pn2);
		l3 = new JLabel("First Name");
		l3.setBounds(20, 50, 100, 20);
		pn2.add(l3);
		mp.add(pn2);
		t2 = new JTextField();
		t2.setBounds(130, 50, 160, 20);
		pn2.add(t2);
		mp.add(pn2);
		l4 = new JLabel("Middle Name");
		l4.setBounds(20, 75, 100, 20);
		pn2.add(l4);
		mp.add(pn2);
		t3 = new JTextField();
		t3.setBounds(130, 75, 160, 20);
		pn2.add(t3);
		mp.add(pn2);
		l5 = new JLabel("Last Name");
		l5.setBounds(20, 100, 100, 20);
		pn2.add(l5);
		mp.add(pn2);
		t4 = new JTextField();
		t4.setBounds(130, 100, 160, 20);
		pn2.add(t4);
		mp.add(pn2);

		pn3 = new JPanel();
		pn3.setLayout(null);
		pn3.setBounds(420, 50, 450, 140);
		pn3.setBackground(Color.white);
		pn3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 255), 2),
				"PERSONAL INFORMATION"));
		l29 = new JLabel("Security Question");
		l29.setBounds(20, 20, 150, 20);
		pn3.add(l29);
		mp.add(pn3);
		cb1 = new JComboBox();
		cb1.addItem("What Is Your Home Name?");
		cb1.addItem("What Is Your Faviorate Dish?");
		cb1.addItem("What Is Your Pet Name?");
		cb1.addItem("What Is Your Faviorate Movie?");
		cb1.addItem("What Is Your First School Name?");
		cb1.addItem("What Is Your Faviorate Book?");
		cb1.setBounds(170, 20, 200, 20);
		pn3.add(cb1);
		mp.add(pn3);
		l6 = new JLabel("Answer");
		l6.setBounds(20, 45, 150, 20);
		pn3.add(l6);
		t5 = new JTextField();
		t5.setBounds(170, 45, 200, 20);
		pn3.add(t5);
		mp.add(pn3);
		l5 = new JLabel("Date of Registration");
		l5.setBounds(20, 75, 150, 20);
		pn3.add(l5);
		mp.add(pn3);

		picker = new JXDatePicker();
		picker.setDate(Calendar.getInstance().getTime());
		picker.setFormats(new SimpleDateFormat("dd/MM/yyyy"));
		picker.setEditable(false);
		picker.setBounds(170, 75, 200, 20);
		pn3.add(picker);
		mp.add(pn3);

		l6 = new JLabel("Gender");
		l6.setBounds(20, 100, 200, 20);
		pn3.add(l6);
		mp.add(pn3);
		j1 = new JRadioButton("Male");
		j1.setBounds(130, 100, 90, 20);
		pn3.add(j1);
		mp.add(pn3);
		j2 = new JRadioButton("Female");
		j2.setBounds(230, 100, 90, 20);
		pn3.add(j2);
		mp.add(pn3);
		bg1 = new ButtonGroup();
		bg1.add(j1);
		bg1.add(j2);
		mp.add(pn3);

		pn4 = new JPanel();
		pn4.setLayout(null);
		pn4.setBounds(15, 200, 350, 210);
		pn4.setBackground(Color.white);
		pn4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 255), 2),
				"CORRESSPONDANCE ADDRESS"));
		l8 = new JLabel("House No.");
		l8.setBounds(20, 25, 100, 20);
		pn4.add(l8);
		mp.add(pn4);
		t7 = new JTextField();
		t7.setBounds(130, 25, 160, 20);
		pn4.add(t7);
		mp.add(pn4);
		l9 = new JLabel("House Name");
		l9.setBounds(20, 50, 100, 20);
		pn4.add(l9);
		mp.add(pn4);
		t8 = new JTextField();
		t8.setBounds(130, 50, 160, 20);
		pn4.add(t8);
		mp.add(pn4);
		l10 = new JLabel("Street");
		l10.setBounds(20, 75, 100, 20);
		pn4.add(l10);
		mp.add(pn4);
		t9 = new JTextField();
		t9.setBounds(130, 75, 160, 20);
		pn4.add(t9);
		mp.add(pn4);
		l7 = new JLabel("Lane");
		l7.setBounds(20, 100, 100, 20);
		pn4.add(l7);
		mp.add(pn4);
		t6 = new JTextField();
		t6.setBounds(130, 100, 160, 20);
		pn4.add(t6);
		mp.add(pn4);
		l17 = new JLabel("State");
		l17.setBounds(20, 125, 100, 20);
		pn4.add(l17);
		cs = new JComboBox();
		cs.setBounds(130, 125, 160, 20);
		pn4.add(cs);
		mp.add(pn4);
		l18 = new JLabel("City");
		l18.setBounds(20, 150, 100, 20);
		pn4.add(l18);
		cc = new JComboBox();
		cc.setBounds(130, 150, 160, 20);
		pn4.add(cc);
		mp.add(pn4);
		l19 = new JLabel("Pincode");
		l19.setBounds(20, 175, 100, 20);
		pn4.add(l19);
		mp.add(pn4);
		t14 = new JTextField();
		t14.setBounds(130, 175, 160, 20);
		pn4.add(t14);
		mp.add(pn4);

		pn5 = new JPanel();
		pn5.setLayout(null);
		pn5.setBounds(420, 200, 450, 230);
		pn5.setBackground(Color.white);
		pn5.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 255), 2),
				"PERMANENT ADDRESS"));
		ch = new JCheckBox("   Same As Corresspondance");
		ch.setBounds(20, 20, 200, 20);
		pn5.add(ch);
		mp.add(pn5);
		l12 = new JLabel("House No.");
		l12.setBounds(20, 45, 100, 20);
		pn5.add(l12);
		mp.add(pn5);
		t11 = new JTextField();
		t11.setBounds(130, 45, 160, 20);
		pn5.add(t11);
		mp.add(pn5);
		l13 = new JLabel("House Name");
		l13.setBounds(20, 70, 100, 20);
		pn5.add(l13);
		mp.add(pn5);
		t12 = new JTextField();
		t12.setBounds(130, 70, 160, 20);
		pn5.add(t12);
		mp.add(pn5);
		l13 = new JLabel("Street");
		l13.setBounds(20, 95, 100, 20);
		pn5.add(l13);
		mp.add(pn5);
		t112 = new JTextField();
		t112.setBounds(130, 95, 160, 20);
		pn5.add(t112);
		l11 = new JLabel("Lane");
		l11.setBounds(20, 120, 100, 20);
		pn5.add(l11);
		mp.add(pn5);
		t10 = new JTextField();
		t10.setBounds(130, 120, 160, 20);
		pn5.add(t10);
		mp.add(pn5);
		mp.add(pn5);
		l14 = new JLabel("State");
		l14.setBounds(20, 145, 100, 20);
		pn5.add(l14);
		ps = new JComboBox();
		ps.setBounds(130, 145, 160, 20);
		pn5.add(ps);
		mp.add(pn5);
		l15 = new JLabel("City");
		l15.setBounds(20, 170, 100, 20);
		pn5.add(l15);
		mp.add(pn5);
		pc = new JComboBox();
		pc.setBounds(130, 170, 160, 20);
		pn5.add(pc);
		mp.add(pn5);
		l16 = new JLabel("Pincode");
		l16.setBounds(20, 195, 100, 20);
		pn5.add(l16);
		mp.add(pn5);
		t13 = new JTextField();
		t13.setBounds(130, 195, 160, 20);
		pn5.add(t13);
		mp.add(pn5);

		pn6 = new JPanel();
		pn6.setLayout(null);
		pn6.setBounds(15, 420, 350, 110);
		pn6.setBackground(Color.white);
		pn6.setBorder(
				BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 255), 2), "CONTACT"));
		l20 = new JLabel("Email - id");
		l20.setBounds(20, 20, 100, 20);
		pn6.add(l20);
		mp.add(pn6);
		t15 = new JTextField();
		t15.setBounds(130, 20, 160, 20);
		pn6.add(t15);
		mp.add(pn6);
		l21 = new JLabel("Phone no");
		l21.setBounds(20, 45, 100, 20);
		pn6.add(l21);
		mp.add(pn6);
		t16 = new JTextField();
		t16.setBounds(130, 45, 160, 20);
		pn6.add(t16);
		mp.add(pn6);
		l22 = new JLabel("Mobile no");
		l22.setBounds(20, 70, 100, 20);
		pn6.add(l22);
		mp.add(pn6);
		t17 = new JTextField();
		t17.setBounds(130, 70, 160, 20);
		pn6.add(t17);
		mp.add(pn6);

		pn7 = new JPanel();
		pn7.setLayout(null);
		pn7.setBounds(420, 440, 450, 90);
		pn7.setBackground(Color.white);
		pn7.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 255), 2),
				"ACCOUNT INFO"));
		l22 = new JLabel("User Name");
		l22.setBounds(20, 20, 100, 20);
		pn7.add(l22);
		mp.add(pn7);
		t18 = new JTextField();
		t18.setBounds(130, 20, 160, 20);
		pn7.add(t18);
		mp.add(pn7);
		l23 = new JLabel("Password");
		l23.setBounds(20, 45, 100, 20);
		pn7.add(l23);
		mp.add(pn7);
		p5 = new JPasswordField();
		p5.setBounds(130, 45, 160, 20);
		pn7.add(p5);
		mp.add(pn7);

		b2 = new JButton("Register");
		b2.setBounds(400, 550, 100, 30);
		mp.add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b2actionperform(evt);
			}
		});

		b4 = new JButton("Cancel");
		b4.setBounds(600, 550, 100, 30);
		mp.add(b4);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b4actionperformed(evt);
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

		setLayout(new BorderLayout());
		sp = new JScrollPane(mp);
		add(sp);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setSize(900, 800);
		setVisible(true);
	}// end of constructor

	char gender;

	private void b2actionperform(ActionEvent evt) {
		String address1 = t7.getText() + " " + t8.getText() + " " + t9.getText() + " " + t6.getText() + " "
				+ cc.getSelectedItem() + " " + cs.getSelectedItem() + " " + t14.getText();
		String address2 = t11.getText() + " " + t12.getText() + " " + t112.getText() + " " + t10.getText() + " "
				+ pc.getSelectedItem() + " " + ps.getSelectedItem() + " " + t13.getText();
		SimpleDateFormat ft = new SimpleDateFormat("dd-MMM-yyyy");
		String dor = ft.format(picker.getDate());
		System.out.println("date set value is " + dor);
		if (j1.isSelected())
			gender = 'M';
		else
			gender = 'F';

		String qry = "insert into administrator values(" + t1.getText() + ",'" + t2.getText() + "','" + t3.getText()
				+ "','" + t4.getText() + "','" + address1 + "','" + address2 + "','" + cb1.getSelectedItem() + "','"
				+ t5.getText() + "','" + dor + "','" + gender + "','" + t15.getText() + "'," + t16.getText() + ","
				+ t17.getText() + ",'" + t18.getText() + "','" + new String(p5.getPassword()) + "')";
		try {
			obj.st.executeUpdate(qry);
			JOptionPane.showMessageDialog(this, "1 Admin Created Successfully");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
	}

	private void chactionperformed(ActionEvent evt) {
		if (ch.isSelected()) {
			t11.setText(t7.getText());
			t12.setText(t8.getText());
			t112.setText(t9.getText());
			t10.setText(t6.getText());
			ps.setSelectedItem(cs.getSelectedItem());
			fill_city();
			pc.setSelectedItem(cc.getSelectedItem());
			t13.setText(t14.getText());
		} else {
			t11.setText(null);
			t12.setText(null);
			t112.setText(null);
			t10.setText(null);
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

	private void b4actionperformed(ActionEvent evt) {
		Index log = new Index();
		this.dispose();
		log.setVisible(true);
	}

	public static void main(String s[]) {
		new admin();
	}
}
