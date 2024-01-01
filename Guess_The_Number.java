import java.util.Scanner; 
import java.util.Random;

class Guess_Number {
	private int counter = 0;
	private int myNumber;
	private int compNumber;

	public Guess_Number() {
		Random random = new Random();
		compNumber = random.nextInt(100);
	}

	public void setNumber(int num) {
		myNumber = num;
	}

	public int isCorrect() {
		if (myNumber == compNumber) {
			return 1;
		} 
		else if (myNumber < compNumber) {
			return 2;
		} 
		else {
			return 3;
		}
	}

	public void setCounter() {
		counter++;
	}

	public void getCounter() {
		System.out.println("The number of guesses: " + counter);
	}
}

public class Guess_The_Number {
	public static void main(String[] args) {
		Guess_Number obj = new Guess_Number();

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("\nGuess Number between 0 to 100: ");
			int n = sc.nextInt();
			obj.setNumber(n);
			
			if (obj.isCorrect() == 1) {
				obj.setCounter();
				System.out.println("\nCorrect Guess, You won...");
				obj.getCounter();
				break;
			} 
			else if (obj.isCorrect() == 2) {
				obj.setCounter();
				System.out.println("\nWrong Guess, Hint => Number is Greater");
				obj.getCounter();
			} 
			else {
				obj.setCounter();
				System.out.println("\nWrong Guess, Hint => Number is Smaller");
				obj.getCounter();
			} // else end
		} // while end
	} // main end
} // class end