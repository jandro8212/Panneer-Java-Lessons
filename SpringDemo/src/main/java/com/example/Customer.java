package com.example;

public class Customer {
	Account account;
	
	public Customer(Account account) {
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}
}