import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissors_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // 0 for rock
        // 1 for paper
        // 2 for scissor

        System.out.println("Select a Choice: ");
        System.out.println("\n0. Rock");
        System.out.println("1. Paper");
        System.out.println("2. Scissor");
        System.out.println("\nEnter here: ");
        int userInput = sc.nextInt();
        int computerInput = random.nextInt(3);

        if (userInput < 0 || userInput > 2) {
            System.out.println("Error, invalid option selected, program terminated...");
            System.exit(-1);
        }

        if (computerInput == userInput) {
            System.out.println("Draw...");
            System.out.println("Computers Choice: " + computerInput);
        } 
        else if ((userInput == 0 && computerInput == 2) || (userInput == 1 && computerInput == 0) || (userInput == 2 && computerInput == 1)) {
            System.out.println("User Won...");
            System.out.println("Computers Choice: " + computerInput);
        } 
        else {
            System.out.println("Computer Won...");
            System.out.println("Computers Choice: " + computerInput);
        }

        sc.close();
    }
}
