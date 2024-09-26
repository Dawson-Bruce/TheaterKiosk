import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare variables
        Scanner in = new Scanner(System.in);
        int age = 0;

        // Prompt user for age
        System.out.print("Please enter your age: ");

        // Check if input is an integer
        if (in.hasNextInt())
        {
            age = in.nextInt();

            // Check if age >= 21
            if (age >= 21)
            {
                System.out.println("You get a wristband.");
            }
        } else {
            System.out.println("Invalid age: " + in.nextLine());
        }
    }
}