import java.util.Scanner;
/**
* @author Jayden West
* @version 1.0
* CS131_Final_Project_JRW
* 3rd semester/2024
*/
public class Food {
	Scanner scnr = new Scanner(System.in);
	
	protected int numEgg;
	protected int cupFlour;
	protected int cupMilk;
	protected int cupSugar;
	protected int butterAmount;
	protected int baconStrip;
	protected int sausagePatty;
	
	protected int servings;
	
	public Food()
	{
		numEgg = 0;
		cupFlour = 0;
		cupMilk = 0;
		cupSugar = 0;
		butterAmount = 0;
		servings = 0;
	}

	public int getNumEgg() {
		return numEgg;
	}

	public void setNumEgg(int numEgg) {
		this.numEgg = numEgg;
	}

	public int getCupFlour() {
		return cupFlour;
	}

	public void setCupFlour(int cupFlour) {
		this.cupFlour = cupFlour;
	}

	public int getCupMilk() {
		return cupMilk;
	}

	public void setCupMilk(int cupMilk) {
		this.cupMilk = cupMilk;
	}

	public int getCupSugar() {
		return cupSugar;
	}

	public void setCupSugar(int cupSugar) {
		this.cupSugar = cupSugar;
	}
	
	public int getButterAmount() {
		return butterAmount;
	}
	
	public void setButterAmount(int butterAmount) {
		this.butterAmount = butterAmount;
	}
	
	public int getBaconStrip() {
		return baconStrip;
	}

	public void setBaconStrip(int baconStrip) {
		this.baconStrip = baconStrip;
	}

	public int getSausagePatty() {
		return sausagePatty;
	}

	public void setSausagePatty(int sausagePatty) {
		this.sausagePatty = sausagePatty;
	}
	
	
	public void makeFood()
	{
		
	}

}
