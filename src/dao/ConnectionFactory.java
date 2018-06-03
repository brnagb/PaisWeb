package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static Connection cn;
	private static final ThreadLocal<Connection>conn = new ThreadLocal<>(); 
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static Connection obtemConexao() throws SQLException {
		cn = DriverManager
				.getConnection("jdbc:mysql://localhost/Paises?user=Bruna&password=");
		return cn;
	}

	public static void fecharConexao() throws SQLException {
		cn.close();
	}

}