package jdbcproject18.Dynamic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class DynamicDataBase {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
		CallableStatement p = c.prepareCall("create database Dynamic");
		boolean e = p.execute();
		System.out.println(e);
		c.close();
	}
}
