package com.bank.dao.dummy;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bank.dao.AccountsDAOI;
import com.bank.dao.ConnectionDAOI;

public class AccountsDAO implements AccountsDAOI{
	
	private ConnectionDAOI cdaoi;
	
	public AccountsDAO(ConnectionDAOI cdaoi){
		this.cdaoi = cdaoi;
	}

	@Override
	public double getBalance(int accno) throws ClassNotFoundException, SQLException {
		
		System.out.println("In getBalance :"+accno);
		Connection con = cdaoi.getConnection();
		
		Statement stm = con.createStatement();
		
		String qry = "select bal from account where accno="+accno;
		ResultSet rs = stm.executeQuery(qry);
		
		rs.next();
				
		return rs.getDouble("bal");
	}

	@Override
	public void setBalance(int accno, double amt) throws ClassNotFoundException, SQLException {
		
		System.out.println("In setBalance: "+accno+":"+amt);
		
		Connection con = cdaoi.getConnection();
		Statement stm = con.createStatement();
		String qry = "update account set bal="+amt+" where accno="+accno;
		stm.executeUpdate(qry);
		
		
	}

}
