import java.util.Scanner;
public class BasicCalc {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        double n1 = scanner.nextDouble();
        System.out.print("Enter your second number: ");
        double n2 = scanner.nextDouble();

        double  results = n1 +n2;
        System.out.println("Sum of number1  and number2 = " + results);

        scanner.close();


    }
    
}
