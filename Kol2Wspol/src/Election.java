
public class Election {
	   public static void main(String args[]) {
	        Sum mySum = new Sum();
	        
	        Controller t1 = new Controller(mySum);
	        Controller t2 = new Controller(mySum);

	      t1.count();
	      t2.count();
	        
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
	        
	        System.out.println("The number of voters is: " 
	        + mySum.getSum());
	    }
}
