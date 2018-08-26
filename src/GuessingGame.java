import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		
		int secretNumber = 5;
		
		System.out.println("Welcome to our guessing game!");
		System.out.println("Choose a number between 1 and 10: ");
		int guessedNumber = input.nextInt();
		
		String result;
		if(secretNumber == guessedNumber) {
			result ="You won!";
		}
		else {
			result="Sorry you Lost!!!";
		}
		
		System.out.println(result);
		input.close();
	}

}
