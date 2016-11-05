package Exc2czescB;

public class Account {

	private int accountNumber;
	private double balance;
	
	public Account()
		{
		this.accountNumber = 0;
		this.balance = 0.0;
		};
	public Account(int accountNumber)
		{
		this.accountNumber = accountNumber;
		this.balance = 0.0;
		};
	public Account(int accountNumber, double balance)
		{
		this.accountNumber = accountNumber;
		this.balance = balance;
		};
	public void setAccountNumber (int accountNumber)
		{
		this.accountNumber = accountNumber;
		};
	public int getAccountNumber()
		{
		return this.accountNumber;
		};
	public void setBalance(double balance) 
		{
		this.balance = balance;
		};
	public double getBalance()
		{
		return this.balance;
		};
	public void credit (double amount) 
		{
		if(!this.isValidAmount(amount, "Credit")) return;
		System.out.println("Credit amount: "+amount);
		this.balance += amount;
		};
	public void debit (double amount) 
		{
		if(this.balance<amount)
			{
			System.out.println("Insufficent fount: "+this.balance+" Debit attempted: "+amount);
			return;
			}
		System.out.println("Debit amount: "+amount);
		this.balance -=amount;
		};
		
	private boolean isValidAmount(double amount, String operation)
		{
		if(amount<0.0)
			{
			System.out.println("Invalid "+operation+" amount: "+amount);
			return false;
			}
		return true;
		
		}
	public String toString() 
		{
		return "Account Number: "+this.accountNumber+" Balance: "+this.balance;
		};
	
	
}
