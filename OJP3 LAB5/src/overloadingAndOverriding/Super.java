package overloadingAndOverriding;


class Animal{};
class Fish extends Animal{};
class Bird extends Animal{};
class Chicken extends Bird{};
class Eagle extends Bird{};
class Karp extends Fish{};

public class Super 
{
	public void m(Animal al, Animal a2) 
	{
		System.out.println("1");
	}
	public void m(Animal al, Fish f)
	{
		System.out.println("2");
	}
	public void m(Fish f, Animal a)
	{
		System.out.println("5");
	}
	
	
}

class Sub extends Super
{
	public void m(Animal a,Fish f)
	{
		System.out.println("3");
	}
	public void m(Bird b, Fish f)
	{
		System.out.println("4");
	}
}
