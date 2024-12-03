package jdbcproject17;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Insert {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/statements", "root", "root");
		CallableStatement p=c.prepareCall("insert into sinfo values(1,'Rohit',2034.12),(2,'Manoj',24000)");
		int e=p.executeUpdate();
		System.out.println(e);
		c.close();
}
}

