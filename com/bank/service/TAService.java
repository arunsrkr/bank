package com.bank.service;

import java.sql.SQLException;

public class TAService {
	
	private DepositService ds;
	private WithdrawService ws;
	
	
	public TAService(DepositService ds,WithdrawService ws){
		this.ds = ds;
		this.ws = ws;
	}
	
	
	public void transferAmount(int srcAccno,int destAccno,double amt) throws ClassNotFoundException, SQLException{
	
		System.out.println("In transferAmount");
		
		if(ds.deposit(destAccno, amt)){
         
			if(ws.withdraw(srcAccno, amt)){
			return ;	
			}else{
				throw new RuntimeException("Insufficient funds to transfer");
			}
			}else{
				throw new RuntimeException("Invalid destination Account");
			}
		
	}

}
