package com.bank.service;

import java.sql.SQLException;

import com.bank.dao.AccountsDAOI;

public class WithdrawService {
	
	private AccountsDAOI adao;
	private CheckBalService cbs;
	
	public WithdrawService(AccountsDAOI adao,CheckBalService cbs){
		this.adao=adao;
		this.cbs = cbs;
	}

	
	public boolean withdraw(int accno,double amt) throws ClassNotFoundException, SQLException{
		
		System.out.println("In withdraw"+accno+"--"+amt);
		double bal = adao.getBalance(accno);
		bal = bal - amt;
		if(cbs.checkMinBal(accno, bal)){
			adao.setBalance(accno, bal);
			return true;
		}
		return false;
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
