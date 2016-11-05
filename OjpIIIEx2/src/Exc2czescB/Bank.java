package Exc2czescB;

public class Bank 
{
	private final String name;
	private final int numberOfAccounts;
	private Account[] accounts;
	
	public Bank(String name, int numberOfAccounts) 
		{
		this.name = name;
		this.numberOfAccounts = numberOfAccounts;
		accounts = new Account[this.numberOfAccounts];
		for(int i=0;i<this.numberOfAccounts;i++)
			{
			accounts [i]=new Account();
			}
		}
	public Account getAccount(int i)
		{
		return this.accounts[i];		
		}
	public void printBank()
		{
		System.out.println("\nBank : "+this.name);
		for(int i=0;i<this.numberOfAccounts;i++)
			{
			System.out.print("Account: "+i+" "+this.accounts[i]);
			}
		}
	public double totalBalance()
		{
		double sum=0.0;
		for(int i=0;i<numberOfAccounts;i++)
			{
			sum += this.accounts[i].getBalance();
			}
		return sum;
		}
		
}
	
	

