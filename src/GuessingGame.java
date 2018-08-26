import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		
		int secretNumber = 5;
		
		System.out.println("Welcome to our guessing game!");
		System.out.println("Choose a number between 1 and 10: ");
		int guessedNumber = input.nextInt();
		
		if(secretNumber == guessedNumber) {
			System.out.println("You guessed it!");
		}
		else {
			System.out.println("Sorry you LOSE!!!");
		}
		
	}

}
