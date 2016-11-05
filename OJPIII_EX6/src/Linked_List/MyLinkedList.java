package Linked_List;

public class MyLinkedList {

	private HeadNode myHead;
	public MyLinkedList()
	{
		this.myHead = new HeadNode();
	}
	
	public void insert(Data newData)
	{
		this.myHead.insert(newData);
	}
	
	public void printAllList()
	{
		this.myHead.print();
	}
}
