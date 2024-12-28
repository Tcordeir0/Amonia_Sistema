package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	/** Módulo de conexão **/
	// Parâmetros de conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3307/apontamentos_amonia?useTimezone=true&serverTimezone=UTC";
	private String User = "root";
	private String password = "1111";

	// Métdo de conexão
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, User, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 * teste de conexão public void testeConexao() { try { Connection con =
	 * conectar(); System.out.println(con); con.close(); } catch (Exception e) {
	 * System.out.println(e); }
	 **/
}