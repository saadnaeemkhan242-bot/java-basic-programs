import java.util.Scanner; // Import Scanner class for user input
public class Javaclass {

    public static void main(String [] args){
    try (Scanner sc = new Scanner(System.in)){
        System.out.println(" enter any year :");
        int year = sc.nextInt(); // Store user input in variable 'year'
      
        // Check if year is divisible by 400
        if (year % 400 == 0 )
            System.out.println(year + " is a leap year ");
        // If divisible by 100 butnot 400, not a leap year
        else if (year % 100 == 0 )
            System.out.println(year + " is not a leap year ");
        // If divisible by 4 but not 100, leap year
        else if (year % 4 ==0 )
            System.out.println(year + " is a leap year ");
        // If none of the above conditions are true 
        else
            System.out.println(year + " is not a leap year ");
        
        sc.close();
        // Close Scanner to prevent resource leak 
    }
}
}
