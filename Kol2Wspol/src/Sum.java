
public class Sum {
	 private int sum = 0;
	    public void add() { sum++; }
	    public  int getSum() 
	    { 
	    	synchronized(this)
	    	{
	    	return sum; 
	    	}
	    }
}
