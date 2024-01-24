/*

Hello everyone, in today's tutorial, we will create a dialog box using java swing.

What is swing?

- Part of JFC (Java foundation classes)
- Build on top of AWT (Abstract window toolkit)
- Successor of awt

Lets get started, we will use the JOptionPane class of javax.swing package....

// my current file is Main.java

*/

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in); // object of Scanner class

		System.out.print("\nEnter Dialog Box Message: ");
		String message = sc.nextLine();

		JOptionPane.showMessageDialog(null,message);
	}	
}


/*

Explaination:

- JOptionPane is a class of javax.swing Package
- showMessageDialog() is a static method of JOptionPane class
- Thats why we called it without creating any object
- First argument (null) is for parent component
- Second argument (Hello, World!) is the display message for dialog box

// Let us do the same thing dynamically using a scanner;

*/

// THANK YOU SO MUCH FOR WATCHING THE VIDEO

// MAKE SURE TO LIKE, SHARE AND SUBSCRIBE:

// AVADH TUTOR: RIPAL PANDYA

// PROGRAM BY: APARNATHI DHAVALGIRI
