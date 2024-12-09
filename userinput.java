import java.util.Scanner;  // Import the Scanner class
public class userinput {
    
        public static void main(String[] args) {
            // Create a Scanner object
            Scanner scanner = new Scanner(System.in);
    
            // Ask the user to enter their name
            System.out.print("Enter your name: ");
            
            // Read user input as a string
            String name = scanner.nextLine();
    
            // Output the user's name
            System.out.println("Hello, " + name + "!");
    
            scanner.close();
        }
    
}
