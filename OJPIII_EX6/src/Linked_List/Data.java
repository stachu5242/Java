package Linked_List;

public class Data 
{

	int value;
	
	public Data(int v)
	{
	 this.value = v;
	}
	
	public Data()
	{
		this.value = 0;
	}
	
	public int comapre(Data newData)
	{
		if(newData.value<this.value)
		{
			return -1;
		}
		else if(newData.value==this.value)
		{
			return 0;
		}
		else return 1;
	}
	
	public void print()
	{
		System.out.println(this.value);
	}
}