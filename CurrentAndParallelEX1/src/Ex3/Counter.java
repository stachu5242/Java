package Ex3;

public class Counter {
private int count = 0;
public void increment() 
	{
	synchronized (this)
	{count++;
	}};
public int getCount()
	{
	return count;
	}

}
