package Linked_List;

public class InternalNode extends Node{

	private Data mydata;
	private Node nextNode;
	
	public InternalNode(Data myData, Node nextNode)
	{
		this.mydata = myData;
		this.nextNode = nextNode;
	}
	
	@Override
	public Node insert(Data newData)
	{
		int caseResult = this.mydata.comapre(newData);
		switch(caseResult)
		{
		case 0: //will be included before
		case -1: //include data/node before
			InternalNode newNode = new InternalNode(newData,this);
			return newNode;
		case 1:
			this.nextNode = this.nextNode.insert(newData);
			return this;
		default:
			return this;
		}
		
		
	}
	@Override
	public void print()
	{
		this.mydata.print();
		this.nextNode.print();
	}
	
}