import java.util.Scanner;
//This code mainly show how to use nextline to ignore the \n character while getting user input
public class IgnoreNewLineCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // Reads the number

        // Consume the leftover newline character
        scanner.nextLine();  // This consumes the '\n' left in the buffer

        // Now, safely read a string
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Reads the actual name input

        // Output the values
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        
        scanner.close();
    }
}
