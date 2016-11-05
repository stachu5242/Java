
public class DayOfWeek {

	private int day;
	
	
	
	public DayOfWeek()
		{
		this.day =0;
		System.out.println("New Monday Created");
		}
	public void setDay(int day)
		{
			if((day<0)||(day>6))
			{
				System.out.println("Day number out of range!");
				System.out.println("value put to 0");
				this.day=0;
			}
			else
			{
				this.day=day;
			}
		};
	public int getDay()
		{
		return this.day;
		};
	public void nextDay()
		{
		if(this.day ==6)
			{
			this.day=0;
			}
			else
			{
				this.day++;
			}
		};
	public void previousDay()
		{	
		if(this.day==0)
			{
			this.day=6;
			}else
			{
				this.day--;
			}
		};
	public String toString()
		{
		switch(this.day)
		{
		case 0:
			return "Monday";
		case 1:
			return "Tuesday";
		case 2:
			return "Wednesday";
		case 3:
			return "Thursday";
		case 4:
			return "Friday";
		case 5:
			return "Saturday";
		case 6:
			return "Sunday";
		default:
			System.out.println("Wrong day: return Monday");
			return "Monday";
		}
		};
}
