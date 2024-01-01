import java.util.Scanner;
import java.util.Arrays;

public class ArrayGame {

    static void choiceOne(int[] arr) {
        Scanner sc = new Scanner(System.in);
        
        Arrays.sort(arr);
        
        System.out.println("Alrighty, we sorted the array,\nYou wanna print it?");
        System.out.println("\n1. Yes");
        System.out.println("2. No");
        System.out.println("The choice is yours: ");
        int choice2 = sc.nextInt();
        
        if (choice2 == 1) {
            for (int elements : arr) {
                System.out.println("Sorted array elements: " + elements);
            }
        } 
        else if (choice2 == 2) {
            System.out.println("Welp! oh well we won't print the array...");
        } 
        else {
            System.out.println("Damn, Please enter a valid choice, boomer");
        }
        
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter array element %d: ", i);
            arr[i] = sc.nextInt();
        }

        System.out.println("\nYou wanna sort the array: ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("The choice is yours: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                choiceOne(arr);
            }
            case 2 -> {
                System.out.println("Welp! oh well we didn't sort the array...");
            }
            default -> {
                System.out.println("Damn, Please enter a valid choice, boomer");
            }
        }

        sc.close();
    }
}