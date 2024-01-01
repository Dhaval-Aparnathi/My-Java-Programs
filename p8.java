/*

   1 
  2 3 
 4 5 6 
7 8 9 10 

*/

public class p8 {
    public static void main(String[] args) 
    {
        int count = 1, i, j, k;
        for (i = 1; i <= 4; i++)
        {
            for (j = 4; j >= i; j--)
            {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++)
            {
                System.out.printf("%d ", count);
                count++;
            }
            System.out.println();
        }
    }
}