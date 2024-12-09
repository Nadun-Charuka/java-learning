import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get the first name
        System.out.print("Enter your first name: ");
        String fname = scanner.next();

        // Get the second name
        System.out.print("Enter your second name: ");
        String lname = scanner.next();

        // Close the scanner
        scanner.close();

        // Output the full name by concatenating the two names
        System.out.println("Your full name is " + fname + " " + lname);
    }
}
