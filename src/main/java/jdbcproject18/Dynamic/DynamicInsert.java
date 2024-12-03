package jdbcproject18.Dynamic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class DynamicInsert {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dynamic", "root", "root");
		CallableStatement p = c.prepareCall("insert into dinfo values(?,?,?)");
//		p.setInt(1, 1);
//		p.setString(2, "Manoj");
//		p.setDouble(3, 25000);
		System.out.println("enter id");
		p.setInt(1, sc.nextInt());
		System.out.println("enter name");
		sc.nextLine();
//		Scanner sc1 = new Scanner(System.in);
		p.setString(2, sc.nextLine());
		System.out.println("enter sal");
		p.setDouble(3, sc.nextDouble());
		int e = p.executeUpdate();
		System.out.println(e);
		c.close();
	}
}
