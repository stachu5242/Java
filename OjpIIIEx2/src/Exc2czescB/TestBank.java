package Exc2czescB;

public class TestBank {
	public static void main(String [] args)
	{
		Account myAccount1 = new Account();
		Account myAccount2 = new Account(123456);
		Account myAccount3 = new Account(12345,1000);
		
		System.out.println(myAccount1);
		System.out.println(myAccount2);
		System.out.println(myAccount3);
		
		System.out.print("\nCredit:"+myAccount2);
		myAccount2.credit(100);
		System.out.println(myAccount2);
		
		
		
		
	}
}
