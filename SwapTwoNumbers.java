import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        SwapNum(num1,num2);

        scanner.close();

    }


    public static void SwapNum(double a, double b){
        double temp = a;
        a = b;
        b = temp;

        System.out.print("After swapping first number is ="+a+" Second number is ="+b+"." );


    }
    
}
