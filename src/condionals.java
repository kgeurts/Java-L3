import java.util.Scanner;

public class condionals {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wat is je leeftijd?");
        int leeftijd = scan.nextInt();

        if (leeftijd >= 18)
        {
            System.out.println("Je mag wel alcohol kopen.");
        } else{
            System.out.println("Jij mag nog geen alcohol kopen");

        }
    }
}


