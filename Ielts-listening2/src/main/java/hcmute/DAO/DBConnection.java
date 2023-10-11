package hcmute.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlConnection {
	private final String serverName = "LAPTOP-6280OKSE\\SQLEXPRESS";
	private final String dbName = "BanHang";
	private final String instance = "";
	private final String userID = "sa";
	private final String password = "123";

	public Connection getConnection() throws Exception {
		String url = "jdbc:sqlserver://" + serverName  + "\\"  + ";databaseName=" + dbName;
		if (instance == null || instance.trim().isEmpty())
			url = "jdbc:sqlserver://" + serverName + ";databaseName=" + dbName;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		return DriverManager.getConnection(url, userID, password);
	}


	public static void main(String[] args) {
		try {
			System.out.println(new SqlConnection().getConnection());
						
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}