/**
* @author Jayden West
* @version 1.0
* CS131_Final_Project_JRW
* 3rd semester/2024
*/
public class Cereal extends Food{
	private int cupCereal;
	

	public Cereal(int m)
	{
		cupMilk = m;
		setCupCereal(0);
		
		
	}
	public int getCupCereal() {
		return cupCereal;
	}
	public void setCupCereal(int cupCereal) {
		this.cupCereal = cupCereal;
	}
	
	public int servings()
	{
		int counter = 0;
		while (cupCereal > 0 && cupMilk > 0)
		{
			cupCereal--;
			cupMilk--;
			counter++;
		}
		servings = counter;
		return servings;
	}
	
	
	
	@Override
	public void makeFood()
	{
		System.out.println("You need 1 cup of milk and one cup of cereal for a bowl of cereal");
		System.out.println("How many cups of cereal do you have?");
		setCupCereal(scnr.nextInt());
		System.out.println("with your ingredients you can make " + servings() + " servings of cereal");
		
	}
	
	

}
