package jdbcproject17;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;


public class Table {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/statements", "root", "root");
	    CallableStatement p=c.prepareCall("create table sinfo(id integer primary key,Name varchar(25) not null,Salary double)");
		boolean e=p.execute();
		System.out.println(e);
		c.close();
	}

}
