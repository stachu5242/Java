package Ex32;

public class HelloProgram {

	public static void main(String[] args) {
		
		int numberOfThreads= 5;
		HelloThread[] hello = new HelloThread[numberOfThreads];
		for(int i=0;i<numberOfThreads;i++)
		{
			hello[i] = new HelloThread(i);
		}
		
		for(int i=0;i<numberOfThreads;i++)
		{
		
				hello[i].start();
				try {
					hello[i].join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
		}
		System.out.println("Good bye. have a nice day!");
	}
	

}
