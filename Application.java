import java.util.InputMismatchException;
import java.util.Scanner;

/**
* @author Jayden West
* @version 1.0
* CS131_Final_Project_JRW
* 3rd semester/2024
*/

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int numEgg = 0;
		int cupFlour = 0;
		int cupMilk = 0;
		int cupSugar = 0;
		int butterAmount = 0;
		int baconStrip = 0;
		int sausagePatty = 0;
		int menuChoice = 0;
		int subChoice = 0;
		boolean correct = false;
		int exit = 0;
	
		System.out.println("Welcome to the Breakfast Maker!");
		System.out.println("Before we begin we need to make a list of your basic ingredients");
		
		//collects all the variables for base ingredients for Food class
	            System.out.println("How many eggs do you have?");
	   //while command loops the catch and try blocks to make sure users input correct data type         
	     while (!correct){
	     try {
	            numEgg = scnr.nextInt();
	            correct = true;
	            
	         } catch (InputMismatchException e) {
	            System.out.print("Invalid input. Please enter an integer.");
	            scnr.next();
	         }
	     }
		 //used to reset the correct boolean so that while loop works. should look into simplifying this.
	     correct = false;
	     
	     while (!correct){
		 try {
	            System.out.println("How many Cups of flour do you have?");
	            cupFlour = scnr.nextInt();
	            correct = true;
	            
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input. Please enter an integer.");
	            scnr.next(); 
	        }
	     }
		 
	     correct = false;
	     
	     while (!correct){ 
		try {
				System.out.println("How many cups of milk do you have?");
				cupMilk = scnr.nextInt();
				correct = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter an integer.");
	            scnr.next();
			}
	     }
	     
	     correct = false;
	     
		while (!correct){
		try {
				System.out.println("How many cups of sugar do you have?");
				cupSugar = scnr.nextInt();
				correct = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter an integer.");
	            scnr.next();
			}
		}
		
		correct = false;
		
		while (!correct){
		try {
				System.out.println("How many tablespoons of butter do you have?");
				butterAmount = scnr.nextInt();
				correct = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter an integer.");
	            scnr.next();
			}
		}
		
		correct = false;
		
		while (!correct){
		try { 
				System.out.println("How many strips of bacon do you have?");
				baconStrip = scnr.nextInt();
				correct = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter an integer.");
	            scnr.next();
			}
		}
		
		correct = false;
		
		while (!correct){
		try {
				System.out.println("How many sausage patties do you have?");
				sausagePatty = scnr.nextInt();
				correct = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter an integer.");
	            scnr.next();
			}
		}
		
		correct = false;
		//restarts the application using a do while loop if user wants to make another recipe
		do {
			
			while (!correct){
				try {
						System.out.println("Please select the number that goes to the style of breakfast you want today");
						System.out.printf("1: Sweet%n2: Savory%n");
						menuChoice = scnr.nextInt();
						correct = true;
					} catch (InputMismatchException e) {
						System.out.println("Invalid input. Please enter an integer.");
			            scnr.next();
					}
				}
				
				correct = false;
				//main menu of program. uses switch case to select different recipe options
				switch (menuChoice) {
				
					case 1:
						while (!correct) {
						try {
								System.out.println("Heres your options for a sweet breakfast:");
								System.out.printf("1: Pancakes%n2: Cinnamon Rolls%n3: Cereal%n");
								System.out.println("select Which breakfast you would like to make");
								subChoice = scnr.nextInt();
								correct = true;
							} catch (InputMismatchException e) {
								System.out.println("Invalid input. Please enter an integer.");
					            scnr.next();
							}
						}
						correct = false;
							//first sub-menu. these use more switch cases so user can choose what breakfast food they specifically want
							switch (subChoice) 
							{
							case 1:
								System.out.println("Pancakes");
								Pancake pancake = new Pancake(cupSugar, cupMilk, numEgg, cupFlour, butterAmount);
								pancake.makeFood();
								
								break;
								
							case 2:
								System.out.println("Cinnamon rolls");
								CinnamonRoll cinnaroll = new CinnamonRoll(cupSugar, cupMilk, numEgg, cupFlour, butterAmount);
								cinnaroll.makeFood();
								break;
								
							case 3:
								System.out.println("Cereal");
								Cereal cereal = new Cereal(cupMilk);
								cereal.makeFood();
								break;
							}
						break;
						
					case 2:
						while (!correct){
						try {
								System.out.println("Heres your options for a savory breakfast:");
								System.out.printf("1: Sausage Biscuit%n2: Bacon and Eggs%n3: Breakfast Bowl%n");
								System.out.println("select Which breakfast you would like to make");
								subChoice = scnr.nextInt();
								correct = true;
							} catch (InputMismatchException e) {
								System.out.println("Invalid input. Please enter an integer.");
					            scnr.next();
							}
						}
							switch (subChoice) 
						{
						case 1:
							System.out.println("Sausage Biscuits");
							SausageBiscuit sbiscuit = new SausageBiscuit(sausagePatty, cupFlour, cupMilk, butterAmount, cupSugar);
							sbiscuit.makeFood();
							
							break;
							
						case 2:
							System.out.println("Bacon and Eggs");
							BaconEggs baconeggs = new BaconEggs(baconStrip, numEgg, butterAmount);
							baconeggs.makeFood();
							break;
							
						case 3:
							System.out.println("Omelette");
							Omelette omelette = new Omelette(numEgg, butterAmount);
							omelette.makeFood();
							break;
						}
						
						break;
						
						//ran out of time to add 3rd breakfast type. will add it in when reworking program
					/*case 3:
						System.out.println("Heres your options for an eggy breakfast:");
						System.out.printf("1: Omelette%n2: Bacon Egg and Cheese Biscuit%n3: Ftitatta%n");
						System.out.println("select Which breakfast you would like to make");
						break;
						
					
					*/
					
				}
				//checks if you want to exit the program and closes the do-while loop
				System.out.println("Would you like to exit application?");
				System.out.printf("1: Yes%n2: No%n");
				exit = scnr.nextInt();
				
		}while(exit != 1);
			
			
		
		
		
		
		
		

		
		

	}

	

}
