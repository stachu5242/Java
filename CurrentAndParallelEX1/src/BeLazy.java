
public class BeLazy {
public static void doNothingForOneSecond()
{
	try{
		Thread.sleep(500);
	}catch(InterruptedException e){}
	}
}

