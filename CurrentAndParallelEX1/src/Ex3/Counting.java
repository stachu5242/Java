package Ex3;

public class Counting {

	public static void main(String[] args) {
		Counter myCounter = new Counter();
		
		CountingThread t1 = new CountingThread(myCounter);
		CountingThread t2 = new CountingThread(myCounter);

		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The counter is now: "+myCounter.getCount());
	}

}
