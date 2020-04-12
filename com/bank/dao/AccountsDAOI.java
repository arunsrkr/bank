package com.bank.dao;

import java.sql.SQLException;

public interface AccountsDAOI {
	
	public double getBalance(int accno) throws ClassNotFoundException, SQLException;
	public void setBalance(int accno,double amt) throws ClassNotFoundException, SQLException;

	//We will add remaining methods later
}

