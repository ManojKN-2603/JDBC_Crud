package jdbcproject17;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Fetch {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/statements", "root", "root");
		CallableStatement p = c.prepareCall("select * from sinfo ");
		ResultSet e = p.executeQuery();
		while (e.next()) {
			System.out.println(e.getInt(1));// integer
			System.out.println(e.getString(2));// varchar
			System.out.println(e.getDouble(3));
//			System.out.println(e.getLong(4));// bigint
//			System.out.println(e.getString(5));
		}
		c.close();
	}
}