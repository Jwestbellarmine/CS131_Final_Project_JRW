/**
* @author Jayden West
* @version 1.0
* CS131_Final_Project_JRW
* 3rd semester/2024
*/
public class SausageBiscuit extends Food{
	private int tbspSugar;
	
	public SausageBiscuit(int s, int f, int m, int b, int sa)
	{
		sausagePatty = s;
		cupFlour = f;
		cupMilk = m;
		butterAmount = b;
		cupSugar = sa;
		tbspSugar = cupSugar*16;
	}

	public int servings()
	{
		int counter = 0;
		while (sausagePatty >= 3 && cupFlour >= 2 && cupMilk > 0 && butterAmount >= 4 && tbspSugar > 0)
		{
			sausagePatty-=3;
			cupFlour-=2;
			cupMilk--;
			butterAmount-=4;
			tbspSugar--;
			counter++;
		}
		servings = counter;
		return servings;
	}
	
	@Override
	public void makeFood()
	{
		System.out.printf("You need 3 sausage patties, 2 cup flour, 1 cup milk, 4 tablespoons of butter%nand one tablespoon of sugar for one batch of sausage biscuits%n");
		System.out.println("with your ingredients you can make " + servings() + " batches of sausage biscuits");
		
	}
	
	

}
