package Linked_List;

public class TestMyLinkedList 
{

	public static void main(String[] args) 
	{
		int tab[]={10,23,3123,43,432,54,54,65,75,1};
		Data myData;
		MyLinkedList myList = new MyLinkedList();
		
		
		for(int i = 0;i<tab.length;i++)
		{
			myData = new Data(tab[i]);
			myList.insert(myData);
		}
		
		myList.printAllList();
	}

}
