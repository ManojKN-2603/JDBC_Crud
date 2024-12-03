package jdbcproject18.Dynamic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class DynamicUpdate {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dynamic", "root", "root");
		CallableStatement p = c.prepareCall("update dinfo set id=? where id=?");
		System.out.println("enter old id");
		p.setInt(2, sc.nextInt());
		System.out.println("enter new id");
		p.setInt(1, sc.nextInt());
		int e = p.executeUpdate();
		System.out.println(e);
		c.close();
	}
}
