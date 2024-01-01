/*

* * * * *
* * * *
* * * 
* *
*

 */

public class p4 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        // or

        for (int i = 1; i <= 5; i++)
        {
            for (int j = i; j <= 5; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}