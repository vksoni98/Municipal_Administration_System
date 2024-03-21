package main;

import java.sql.*;
import javax.swing.*;

public class dbconn {
	public Connection con = null;
	public Statement st;
	public ResultSet rs = null;

	public void loaddriver() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	public void conn() {
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			st = con.createStatement();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	public void fetch(String s) {
		try {
			rs = st.executeQuery(s);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}