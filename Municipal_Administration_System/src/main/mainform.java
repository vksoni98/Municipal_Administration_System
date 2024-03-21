package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mainform extends JFrame {
	JDesktopPane jd;
	JMenuBar bar;
	JMenu account, admin, emp, birth, death, property, water, help;
	JMenuItem admincp, newemp, empcp, exit, breg, bsearch, dreg, dsearch, preg, psearch, ptax, nwater, wsearch, wtax,
			inst, about;

	public mainform() {
		jd = new JDesktopPane();

		bar = new JMenuBar();
		account = new JMenu();
		account.setText("  ACCOUNT");
		admin = new JMenu();
		admin.setText("ADMIN");
		admincp = new JMenuItem();
		admincp.setText("Change Password");
		admin.add(admincp);
		account.add(admin);
		bar.add(account);

		emp = new JMenu();
		emp.setText("EMPLOYEE");
		newemp = new JMenuItem();
		newemp.setText("New Employee");
		empcp = new JMenuItem();
		empcp.setText("Change Password");
		emp.add(newemp);
		emp.add(empcp);
		account.add(emp);
		bar.add(account);

		exit = new JMenuItem();
		exit.setText("Logout");
		exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));
		account.add(exit);
		bar.add(account);

		birth = new JMenu();
		birth.setText("  BIRTH");
		breg = new JMenuItem();
		breg.setText("Registration Of Birth");
		bsearch = new JMenuItem();
		bsearch.setText("Birth Search");
		birth.add(breg);
		birth.add(bsearch);
		bar.add(birth);

		death = new JMenu();
		death.setText("  DEATH");
		dreg = new JMenuItem();
		dreg.setText("Registration Of Death");
		dsearch = new JMenuItem();
		dsearch.setText("Death Search");
		death.add(dreg);
		death.add(dsearch);
		bar.add(death);

		property = new JMenu();
		property.setText("  PROPERTY");
		preg = new JMenuItem();
		preg.setText("Property Registration");
		psearch = new JMenuItem();
		psearch.setText("Property Search");
		ptax = new JMenuItem();
		ptax.setText("Property Tax");
		property.add(preg);
		property.add(psearch);
		property.add(ptax);
		bar.add(property);

		water = new JMenu();
		water.setText("  WATER");
		nwater = new JMenuItem();
		nwater.setText("New  Water Connection");
		wsearch = new JMenuItem();
		wsearch.setText("Ward Wise Connection List");
		wtax = new JMenuItem();
		wtax.setText("Water Tax");
		water.add(nwater);
		water.add(wsearch);
		water.add(wtax);
		bar.add(water);

		if (Index.utype.equals("user")) {
			admin.setEnabled(false);
			newemp.setEnabled(false);
		}

		/*
		 * help=new JMenu(); help.setText("  HELP"); inst=new JMenuItem();
		 * inst.setText("Instruction"); about=new JMenuItem(); about.setText("About");
		 * help.add(inst); help.add(about); bar.add(help);
		 */
		setJMenuBar(bar);
		setTitle("MUNICIPAL   ADMINISTRATION   SYSTEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setLayout(null);
		jd.setSize(1500, 2000);
		jd.setBackground(new Color(63, 225, 208));
		add(jd);
		setVisible(true);

		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ext(ae);
			}
		});

		admincp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				cpadmin(ae);
			}
		});

		empcp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				cpemp(ae);
			}
		});

		breg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				regb(ae);
			}
		});

		nwater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				watern(ae);
			}
		});

		bsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				searchb(ae);
			}
		});

		dreg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				regd(ae);
			}
		});

		dsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				searchd(ae);
			}
		});

		wsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				searchw(ae);
			}
		});

		preg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				regp(ae);
			}
		});

		psearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				searchp(ae);
			}
		});

		ptax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				taxp(ae);
			}
		});

		wtax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				taxw(ae);
			}
		});

		newemp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				empnew(ae);
			}
		});

	}

	public void cpadmin(ActionEvent ae) {
		Adminchangepassword1 obj = new Adminchangepassword1();
		jd.add(obj);
		obj.setVisible(true);
	}

	public void cpemp(ActionEvent ae) {
		userchangepassword1 obj = new userchangepassword1();
		jd.add(obj);
		obj.setVisible(true);
	}

	public void searchw(ActionEvent ae) {
		wtab obj = new wtab();
		jd.add(obj);
		obj.setVisible(true);
	}

	public void regb(ActionEvent ae) {
		birthreg obj = new birthreg();
		jd.add(obj);
		obj.setVisible(true);
	}

	public void regp(ActionEvent ae) {
		propreg obj = new propreg();
		jd.add(obj);
		obj.setVisible(true);
	}

	public void watern(ActionEvent ae) {
		waternew obj = new waternew();
		jd.add(obj);
		obj.setVisible(true);
	}

	public void searchb(ActionEvent ae) {
		birthsearch obj = new birthsearch();
		jd.add(obj);
		obj.setVisible(true);
	}

	public void regd(ActionEvent ae) {
		deathreg obj = new deathreg();
		jd.add(obj);
		obj.setVisible(true);
	}

	public void searchd(ActionEvent ae) {
		deathsearch obj = new deathsearch();
		jd.add(obj);
		obj.setVisible(true);
	}

	public void taxp(ActionEvent ae) {
		proptax obj = new proptax();
		jd.add(obj);
		obj.setVisible(true);
	}

	public void taxw(ActionEvent ae) {
		watertax obj = new watertax();
		jd.add(obj);
		obj.setVisible(true);
	}

	public void searchp(ActionEvent ae) {
		propsearch obj = new propsearch();
		jd.add(obj);
		obj.setVisible(true);
	}

	public void empnew(ActionEvent ae) {
		employee obj = new employee();
		jd.add(obj);
		obj.setVisible(true);
	}

	public void ext(ActionEvent ae) {
		Index obj = new Index();
		this.dispose();
		obj.setVisible(true);
	}

	public static void main(String arg[]) {
		new mainform();
	}
}
