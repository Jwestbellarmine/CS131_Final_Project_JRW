/**
* @author Jayden West
* @version 1.0
* CS131_Final_Project_JRW
* 3rd semester/2024
*/
public class Pancake extends Food {
	private int tbspSugar;

	
	
	public Pancake(int s, int m, int e, int f, int b)
	{
		cupSugar = s;
		cupMilk = m;
		numEgg = e;
		cupFlour = f;
		butterAmount = b;
		tbspSugar = cupSugar *16;
	}

	
	public int servings()
	{
		int counter = 0;
		while (numEgg > 0 && cupMilk > 0 && cupFlour >= 2 && tbspSugar >= 2 && butterAmount > 0)
		{
			tbspSugar-=2;
			cupMilk--;
			numEgg--;
			cupFlour-=2;
			butterAmount--;
			counter++;
		}
		servings = counter;
		return servings;
	}
	
	@Override
	public void makeFood()
	{
		System.out.println("you need 1 cup of milk, one egg, 2 cups flour, 2 tablespoons butter, and 2 tablespoons of sugar to make one serving of pancakes");
		System.out.println("with your ingredients you can make " + servings() + " servings of pancakes.");
	}

}
