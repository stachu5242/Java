
public class ABCRunable implements Runnable {
public void run() 
{
	for(char i='A';i<='Z';i++){
		System.out.print(i);
		BeLazy.doNothingForOneSecond();
	}
}

}
