/*     

A
B B
C C C
D D D D
E E E E E

 */

public class p3 {
    public static void main(String[] args) {
        for (char i = 65; i <= 69; i++)
        {
            for (char j = 65; j <= i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }   
}