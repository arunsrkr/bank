package com.bank.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionDAOI {
	
	Connection getConnection() throws ClassNotFoundException, SQLException;

}
