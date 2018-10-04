import java.util.Scanner;

public class MutlipleIfs {

 public static void main(String[] args) {

     System.out.println("Hello MultipleIf's");

     Scanner scan = new Scanner(System.in);
     System.out.println("Wat is de dag van de week");

     int weekdag = 1;
     weekdag = scan.nextInt();

     if (weekdag == 1) {
         System.out.println("Maandag");
     } else if (weekdag == 2) {
     System.out.println("Dinsdag");
    } else if (weekdag == 3) {
        System.out.println("Woensdag");
     } else if (weekdag == 4) {
         System.out.println("Donderdag");
     } else if (weekdag == 5) {
         System.out.println("Vrijdag");
     } else if (weekdag == 6) {
         System.out.println("Zaterdag");
     } else if (weekdag == 7) {
         System.out.println("Zondag");
     }
 }
}
