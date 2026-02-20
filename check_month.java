import java.util.Scanner;
public class month_chk {
    public static void main (String[] args) {
     try (Scanner sc = new Scanner (System.in)){
        // Ask user to enter a number
          System.out.println("Enter month number (1-12):");
          // Store the entered value in variable 'month'
         int month = sc.nextInt();
         // Ask for year ( needed to check leap year for February)
         System.out.println("Enter year : ");
         int year = sc.nextInt();
         // Use the switch statement to match month number 
         switch(month){
             case 1 :
                 System.out.println("January - 31 days");
                 break;
                 // break stops further checking
             case 2 :
                 // Leap year condition
                 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 ))
                 System.out.println("February - 29 days (Leap Year)");
                 else
                     System.out.println("February - 28 days");
                 break;    
             case 3 :
                 System.out.println("March - 31 days");
                 break;    
             case 4 :
                 System.out.println("April - 30 days");
                 break;    
             case 5 :
                 System.out.println("May - 31 days");
                 break;    
             case 6 :
                 System.out.println("June - 30 days");
                 break;    
             case 7 :
                 System.out.println("July - 31 days");
                 break;    
             case 8 :
                 System.out.println("August - 31 days");
                 break;    
             case 9 :
                 System.out.println("September - 30 days");
                 break;    
             case 10 :
                 System.out.println("October - 31 days");
                 break;    
             case 11 :
                 System.out.println("November - 30 days");
                 break;    
             case 12 :
                 System.out.println("December - 31 days");
                 break;
                 // If user enters number outside 1-12
             default :
                 System.out.println("Invalid month number!");
         }
         // Close scanner to prevent memory leak
         sc.close();
         }
      }
}
