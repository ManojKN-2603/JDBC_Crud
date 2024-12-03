package jdbcproject18.Dynamic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class DynamicFetch {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dynamic", "root", "root");
		CallableStatement p = c.prepareCall("select * from dinfo where id=? ");
		System.out.println("enter id");
		p.setInt(1, sc.nextInt());
		ResultSet e = p.executeQuery();
		while (e.next()) {
			System.out.println("Id: " + e.getInt(1));
			System.out.println("Name: " + e.getString(2));
			System.out.println("Sal: " + e.getDouble(3));
		}
		c.close();
	}
}
