package producerConsumerExample1;

public class Consumer extends Thread
{

	Value v;
	String Name;
	public Consumer ( Value v, String Name)
	{
		this.v= v;
		this.Name = Name;
	}
	public void run()
	{
		int val = 0;
		for(int i=0;i<5;i++)
		{
			
			val = v.get();
		System.out.println("Consumer " + Name + " gets: "+ val);
		}
	}
}
