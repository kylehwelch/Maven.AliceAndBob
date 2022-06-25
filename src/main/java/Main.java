import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */


public class Main {
    public static void main(String[] args ) {

        String name = "";

        System.out.println("What is your name? ");

        Scanner scan = new Scanner(System.in);

        name = scan.nextLine();

        if (name.equals("Alice") || name.equals("Bob")) {
            System.out.println("Hello " + name + " how are you doing?");
        } else {
            System.out.println("You don't belong here!");
        }
    }
}
