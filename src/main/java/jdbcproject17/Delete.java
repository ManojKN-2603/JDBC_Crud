package jdbcproject17;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Delete {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/statements", "root", "root");
		CallableStatement p = c.prepareCall("delete from sinfo where id=2");
		int e = p.executeUpdate();
		System.out.println(e);
		c.close();
	}
}