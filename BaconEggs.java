/**
* @author Jayden West
* @version 1.0
* CS131_Final_Project_JRW
* 3rd semester/2024
*/
public class BaconEggs extends Food{
	
	public BaconEggs(int b, int e, int bu)
	{
		baconStrip = b;
		numEgg = e;
		butterAmount = bu;
	}
	
	public int servings()
	{
		int counter = 0;
		while (baconStrip >= 2 && numEgg >= 2 && butterAmount > 0)
		{
			baconStrip--;
			numEgg-=2;
			butterAmount--;
			counter++;
		}
		servings = counter;
		return servings;
	}
	
	@Override
	public void makeFood()
	{
		System.out.println("You need 2 Strips of bacon, 2 eggs, and 1 tablespoon of butter to make a serving of bacon and eggs");
		System.out.println("with your ingredients you can make " + servings() + " servings of bacon and eggs");
		
	}

}
