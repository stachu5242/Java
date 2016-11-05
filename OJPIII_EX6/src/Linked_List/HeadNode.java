package Linked_List;

public class HeadNode extends Node
{

	private Node nextNode;
	public HeadNode()
	{
		this.nextNode = new EndNode();
	}
	
	@Override
	public Node insert(Data newData)
	{
		this.nextNode = this.nextNode.insert(newData);
		return this;
	}
	
	@Override
	public void print()
	{
		this.nextNode.print();
	}
	
}