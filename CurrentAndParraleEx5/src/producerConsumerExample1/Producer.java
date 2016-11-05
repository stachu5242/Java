package producerConsumerExample1;

public class Producer extends Thread{

	Value v;
	String Name;
	public Producer(Value v, String Name)
	{
		this.v = v;
		this.Name= Name;
		
	}
	public void run()
	{
		for (int i=0;i<5;i++)
		{
			v.put(i);
			System.out.println("Producer " + " puts: "+ i);
		}
	}
}
