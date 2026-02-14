import java.util.Scanner;
/* This program checks whether a given integer is 
1. Even or Odd
2. positive, negative or zero
*/
public class evenodd_chk {
    public static void main (String[] args) {
        // create scanner object to take user input
      try (Scanner sc = new Scanner (System.in)){
            System.out.println(" Enter any number ");
            int num = sc.nextInt();{
          // check wether a number is even or odd
            if (num % 2 == 0)
                System.out.println(num + " is even ");
            else
                System.out.println(num + " is odd ");
      }   
            {
                // check whether a given number is positive, negative or zero
                if (num > 0)
                    System.out.println(num + " is positive ");
                else if (num == 0)
                    System.out.println(num + " is neutral ");
                else
                    System.out.println(num + " is negative ");
            }
        }
    }
    
}
