/*

A 
B C 
D E F 
G H I J 
K L M N O 

*/

public class p7 {
    public static void main(String[] args) {
        char count = 65;
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}