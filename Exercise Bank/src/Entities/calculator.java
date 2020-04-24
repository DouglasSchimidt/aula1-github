package Entities;

import javax.security.auth.login.AccountException;

public class calculator {

	private int numberAccount;
	private String name;
	private double balance; // saldo

	public calculator() {

	}

	public calculator(int account, String name, double value) {

		this.numberAccount = account;
		this.name = name;
		this.balance = balance;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance(double value) {
		return balance;

	}

	public double deposit(double balance) {

		this.balance += balance;

		return balance;

	}

	public double whithdraw(double balance) {
		return this.balance -= (balance + 5);

	}

	public void dados(String name, int numberAccount, double balance) {

		System.out.printf("Account: " + numberAccount + ", " + "Holder: " + name + ", " + ", " + "Balance: %.2f%n ",
				this.balance);

	}
}
