package com.pranav.demos;

public class Account {

	int actId;
	String actName;
	float balance;

	
	public Account()
	{
		System.out.println("Default Constructor executed");
		//super();
	}
	
	public Account(int actId, String actName, float balance) {
		super();
		this.actId = actId;
		this.actName = actName;
		this.balance = balance;
		System.out.println("Parameterized Constructor executed");
	}

	public int getActId() {
		return actId;
	}

	public void setActId(int actId) {
		this.actId = actId;
	}

	public String getActName() {
		return actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	public void withdraw (float amount)
	{
		balance-=amount;
	}
	public void setup()
	{
		System.out.println("This method will be executed linked with the constructor");
	}
	public void teardown()
	{
		
	}
	
}
