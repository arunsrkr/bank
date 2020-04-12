package com.bank.service;

import java.sql.SQLException;

import com.bank.dao.AccountsDAOI;

public class DepositService {
	
	private AccountsDAOI adao;
	
	public DepositService(AccountsDAOI adao){
		this.adao = adao;
	}
	
	
	public boolean deposit(int accno,double amt) throws ClassNotFoundException, SQLException{
		System.out.println("In deposit :"+accno+":"+amt);
		double bal = adao.getBalance(accno);
		bal = bal +amt;
		adao.setBalance(accno, bal);
		return true;
		
		
		
	}
	
	

}
