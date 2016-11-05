
public class main {

	public static void main(String[] args) {
		DayOfWeek myDay = new DayOfWeek();
		
		System.out.println("Day number is "+myDay.getDay());
		System.out.println("Day is "+myDay.toString());
		System.out.println("\nSet day to Sunday");
		myDay.setDay(6);
		System.out.println("Day number is "+myDay.getDay());
		System.out.println("Day is "+myDay);
	}

}
