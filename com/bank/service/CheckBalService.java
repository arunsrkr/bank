package com.bank.service;

import com.bank.dao.AccountsDAOI;

public class CheckBalService {    	
	
	public boolean checkMinBal(int accno,double bal){
		
		System.out.println("In checkMinBal"+accno+"--"+bal);
		
		return bal>=5000;
		
	}

}
