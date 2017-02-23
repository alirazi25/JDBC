package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMySQL {
	public static void main(String[] args) {
		String my_user = "root";
		String my_pwd = "mysql";
		String my_conStr = "jdbc:mysql://localhost:3306/test";
		Connection my_con = null;
		
		try {
			my_con = DriverManager.getConnection(my_conStr, my_user, my_pwd);
			System.out.println("connected!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String hsql_user = "SA";
		String hsql_pwd = "";
		String hsql_conStr = "jdbc:hsqldb:exploreCalifornia";
		Connection hsql_con = null;
		
		try {
			hsql_con = DriverManager.getConnection(hsql_conStr, hsql_user, hsql_pwd);
			System.out.println("connected!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
