package com.infotech.service.impl;

import com.infotech.model.Account;

public class AccountServiceImpl {

	public void updateAccountBalance(Account account,Long amount){
		System.out.println("Account No:"+account.getAccountNumber()+", Amount:"+amount);
	}
}
