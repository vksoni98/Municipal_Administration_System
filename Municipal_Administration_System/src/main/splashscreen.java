package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class splashscreen extends JFrame {
	JLabel l2;
	JPanel p1;
	JProgressBar jb;
	javax.swing.Timer t;

	public splashscreen() {
		l2 = new JLabel();
		l2.setBounds(300, 20, 500, 500);
		l2.setIcon(new ImageIcon("image3.jpg"));
		jb = new JProgressBar();
		jb.setBounds(200, 525, 700, 20);
		jb.setStringPainted(true);
		jb.setForeground(Color.green);

		p1 = new JPanel();
		p1.setLocation(5, 5);
		p1.setSize(1300, 1200);
		p1.setLayout(null);
		p1.add(jb);
		p1.add(l2);
		add(p1);

		setLocation(150, 100);
		setTitle("splashscreen");
		setSize(600, 600);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setVisible(true);

		t = new javax.swing.Timer(30, new test());
		t.start();
	}

	class test implements ActionListener {
		int i = 0;

		public void actionPerformed(ActionEvent e) {
			jb.setValue(i);
			i++;
			if (i == 101) {
				t.stop();
				dispose();
				new mainform().setVisible(true);
			}
		}
	}

	public static void main(String arg[]) {
		new splashscreen();
	}
}
