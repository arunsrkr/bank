package com.bank.dao.dummy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.bank.dao.ConnectionDAOI;

public class ConnectionDAO implements ConnectionDAOI{
	
	private String db_username="root";
	private String db_password="admin";
	private String db_url     ="jdbc:mysql://localhost/bank";
		

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection(db_url, db_username, db_password);

		return con;
	}

}
