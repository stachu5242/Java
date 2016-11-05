package Ex32;

public class HelloThread extends Thread{
	int index;
	public HelloThread(int index)
	{
		this.index = index;
	}
	@Override
	public void run()
	{
		System.out.println("Hello From Thread "+ index);
	}

}
