import java.util.Scanner;
import java.util.Random;

class optionOneCalc {
    private int a, b, ans;

    public optionOneCalc() {
        this.a = this.b = this.ans = 0;
    }

    public void setData(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void calculateResult(char operation) {
        if (operation == '+') {
            this.ans = this.a + this.b;
        }
        else if (operation == '-') {
            this.ans = this.a - this.b;
        }
        else if (operation == '*') {
            this.ans = this.a - this.b;
        }
        else if (operation == '/') {
            this.ans = this.a - this.b;
        }
        else {
            System.out.println("Invalid operation...");
        }
    }

    public void getResult() {
        System.out.println("The result is: " + this.ans);
    }
}

class optionTwoGuessNum {
    private int counter = 0;
	private int myNumber;
	private int compNumber;

	public optionTwoGuessNum() {
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

class optionThreeVote {
    private String name;
    private byte age;

    public optionThreeVote() {
        name = null;
        age = 0;
    }

    public void setData(byte age, String name) {
        this.age = age;
        this.name = name;
    }

    public void checkEligibility() {
        if (name == null) {
            System.out.println("Please enter name to check eligibiliy...");
        }
        else if (age >= 18) {
            System.out.println("You are eligible for voting");
        }
        else {
            System.out.println("You are not eligible for voting...");
        }
    }
}

public class Menu_Driven_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select any option: ");
        System.out.println("\n1. Calculator");
        System.out.println("2. Guess the number");
        System.out.println("3. Vote Eligibility Checker");
        System.out.println("0. Exit");
        System.out.println("Enter choice here: ");
        byte choice = sc.nextByte();

        switch (choice) {
            case 1 -> {
                optionOneCalc o1_obj = new optionOneCalc();
                System.out.println("Enter n1: ");
                int n1 = sc.nextInt();
                System.out.println("Enter n2: ");
                int n2 = sc.nextInt();

                // Consume the newline character (From chatGPT)
                sc.nextLine();

                System.out.println("Enter operation (+, -, *, /): ");
                char op = sc.nextLine().charAt(0);

                o1_obj.setData(n1, n2);
                o1_obj.calculateResult(op);
                o1_obj.getResult();
            }   
            case 2 -> {
                optionTwoGuessNum o2_obj = new optionTwoGuessNum();
                while (true) {
                    System.out.println("\nGuess Number between 0 to 100: ");
                    int n = sc.nextInt();
                    o2_obj.setNumber(n);
                    
                    if (o2_obj.isCorrect() == 1) {
                        o2_obj.setCounter();
                        System.out.println("\nCorrect Guess, You won...");
                        o2_obj.getCounter();
                        break;
                    } 
                    else if (o2_obj.isCorrect() == 2) {
                        o2_obj.setCounter();
                        System.out.println("\nWrong Guess, Hint => Number is Greater");
                        o2_obj.getCounter();
                    } 
                    else {
                        o2_obj.setCounter();
                        System.out.println("\nWrong Guess, Hint => Number is Smaller");
                        o2_obj.getCounter();
                    } // else end
                } // while end
            } // case 2 end
            case 3 -> {
                optionThreeVote o3_obj = new optionThreeVote();
                sc.nextLine();
                System.out.println("Enter name: ");
                String name = sc.nextLine();
                System.out.println("Enter age: ");
                byte age = sc.nextByte();

                o3_obj.setData(age,name);
                o3_obj.checkEligibility();
            } 
            case 0 -> { 
                System.exit(-1);
            } 
            default -> {
                System.out.println("Invalid choice...");
            }
        }

        sc.close();
    }   
}