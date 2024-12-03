package jdbcproject18.Dynamic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class DynamicTable {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dynamic", "root", "root");
		CallableStatement p = c.prepareCall("create table dinfo(Id integer primary key,Name varchar(25), Sal double)");
		boolean e = p.execute();
		System.out.println(e);
		c.close();
	}
}
