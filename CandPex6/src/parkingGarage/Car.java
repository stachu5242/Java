package parkingGarage;

class Car extends Thread
{
	private ParkingGarage garage;
	private int waitingNumber;
	public Car(ParkingGarage garage,int waitingNumber)
	{
    	this.garage = garage;
    	this.waitingNumber = waitingNumber;
    }

	public void run()
	{
    	try {
			sleep((int) (Math.random() * 150));
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
    	garage.enter(waitingNumber);
    	System.out.println(getName() + " entering with nr "+waitingNumber);
    	try {
			sleep((int) (Math.random() * 300));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	System.out.println(getName() + " with nr "+waitingNumber+" leaving the garage.");
    	garage.leave();
    }
}
