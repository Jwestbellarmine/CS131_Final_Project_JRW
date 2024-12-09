/**
* @author Jayden West
* @version 1.0
* CS131_Final_Project_JRW
* 3rd semester/2024
*/
public class CinnamonRoll extends Food{
	private int tbspYeast;
	private int powderedSugar;
	private int cinnamon;
	private int halfSugar;
	
	public CinnamonRoll(int s, int m, int e, int f, int b)
	{
		cupSugar = s;
		cupMilk = m;
		numEgg = e;
		cupFlour = f;
		butterAmount = b;
		tbspYeast = 0;
		powderedSugar = 0;
		cinnamon = 0;
		halfSugar = cupSugar*2;
				
	}

	public int getYeast() {
		return tbspYeast;
	}

	public void setYeast(int yeast) {
		this.tbspYeast = yeast;
	}

	public int getPowderedSugar() {
		return powderedSugar;
	}

	public void setPowderedSugar(int powderedSugar) {
		this.powderedSugar = powderedSugar;
	}

	public int getCinnamon() {
		return cinnamon;
	}

	public void setCinnamon(int cinnamon) {
		this.cinnamon = cinnamon;
	}
	
	public int servings()
	{
		int counter = 0;
		while (numEgg >= 2 && cupMilk >= 2 && cupFlour >= 3 && halfSugar > 0 && butterAmount >= 4 && tbspYeast >= 2 && powderedSugar >=2 && cinnamon > 0)
		{
			halfSugar--;
			cupMilk-=2;
			numEgg-=2;
			cupFlour-=3;
			butterAmount-=4;
			tbspYeast--;
			powderedSugar-=2;
			cinnamon--;
			counter++;
		}
		servings = counter;
		return servings;
	}
	
	@Override
	public void makeFood()
	{
		System.out.printf("You need 3 cups of flour, 2 cups of milk, 1/2 cup sugar, 4 tablespoons butter, 2 eggs,%n2 cups powdered sugar, 1 tablespoon yeast, and 1 tablespoon of cinnamon for one batch of cinnamon rolls%n");
		System.out.println("how many cups of powdered sugar do you have?");
		setPowderedSugar(scnr.nextInt());
		System.out.println("how many tablespoons of yeast do you have?");
		setYeast(scnr.nextInt());
		System.out.println("how many tablespoons of Cinnamon do you have?");
		setCinnamon(scnr.nextInt());
		System.out.println("With your ingredients you can make " + servings() + " batches of cinnamon rolls");
	}

	
	
}
