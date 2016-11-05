package animalExample;

public class Animal {
	private String species;
	public Animal(String species)
	{
		this.species = species;
	
	}
	public void makeNoise()
	{
		if(species.equals("cat"))
		{
			System.out.println("Miau Miau");
		}
		else if(species.equals("mouse"))
		{
			System.out.println("Fiep Fiep");
		}
	}

}
