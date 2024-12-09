/**
* @author Jayden West
* @version 1.0
* CS131_Final_Project_JRW
* 3rd semester/2024
*/
public class Omelette extends Food {
	private int cheese;
	private int fourthCupCheese;
	
	public Omelette(int e, int b)
	{
		numEgg = e;
		cheese = 0;
		fourthCupCheese = 0;
		butterAmount = b;
	}

	public int getCheese() {
		return cheese;
	}

	public void setCheese(int cheese) {
		this.cheese = cheese;
		fourthCupCheese = cheese * 4;
		
		
	}

	public int getFourthCupCheese() {
		return fourthCupCheese;
	}
	
	public void setFourthCupCheese() {
		fourthCupCheese = cheese * 4;
	}

	
	public int servings()
	{
		int counter = 0;
		while (numEgg >= 2 && fourthCupCheese > 0 && butterAmount >= 2)
		{
			numEgg-=2;
			fourthCupCheese--;
			butterAmount-=2;
			counter++;
		}
		servings = counter;
		return servings;
	}
	
	@Override
	public void makeFood()
	{
		System.out.println("You need 2 eggs, 1/4 cup of cheese, and 2 tablespoons of butter for one omelette");
		System.out.println("How many cups of cheese do you have?");
		setCheese(scnr.nextInt());
		System.out.println("with your ingredients you can make " + servings() + " omelettes");
		
	}
	
	

}
