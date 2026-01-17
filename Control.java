 /* if

 if(condition)
{
    statement 1;
    statement 2;
} */

/*
if(condition)
    statement 1;
    statement 2;
    statement 3; 
*/

import java.util.Scanner;

// read nos and display it is positive
public class Control{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\n Enter Number :");
            int n = scanner.nextInt();
            if (n >=0)
            {
                System.out.println(n + " is positive no");
            }
        }
    }
}