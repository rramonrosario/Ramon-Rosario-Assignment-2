import java.util.Random;
import java.util.Scanner;


public class NumberGame {

	public static void main(String[] args) {
		
	// Random Object / Random Number 
		Random gameNum = new Random();
		int rawNum = gameNum.nextInt(100) + 1;
		
	// Scanner Object / User Input 
		Scanner input = new Scanner(System.in);
		
		//Game loop / Game Blue print 
		int numOption = 0 ; 
		while (numOption < 5){
			System.out.println("Pick a number 1 to 100 ");
			int playerNum = input.nextInt();	
			
			//Check if Number is under 1 or Over 100
			if (playerNum < 1 || playerNum > 100) {
				System.out.println("Your number is not between 1 and 100, Try again");
			//Check if the Number was Correct 	
			}else if (playerNum == rawNum) {
				System.out.println("You Win !!!");
				System.out.println("The number is :" + rawNum);
				numOption=6;
			//Check if the Number is Under the correct Number 
			}else if (playerNum < rawNum) {
				System.out.println("Your number needs to be higher! ");
				numOption++;	
			//Check if the number is Over the Correct number 
			}else if (playerNum> rawNum) {
				System.out.println("Your numbers needs to be Lower! ");
				numOption++;
			}	
		
			if (numOption == 5) {
				System.out.println("You lost !!!");
				System.out.println("The number was: " + rawNum);
			}
				
			
			
			
			
			
		}
		
		 
		
		
		
		
		

	}

}
