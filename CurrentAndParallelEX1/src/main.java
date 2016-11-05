
public class main {

	public static void main(String[] args) {
	/*ABCThread t1 = new ABCThread();
	ABCThread t2 = new ABCThread();
	ABCThread t3 = new ABCThread();
	
	t1.start();
	t2.start();
	t3.start();*/
	
	ABCPrinter p1 = new ABCPrinter();
	ABCPrinter p2 = new ABCPrinter();
	
	
	p1.start();
	p2.start();
	/*
	ABCRunable r1 = new ABCRunable();
	ABCRunable r2 = new ABCRunable();
	
	Thread t1 = new Thread(r1);
	Thread t2 = new Thread(r2);
	t1.start();
	t2.start();*/
		
	}

}
