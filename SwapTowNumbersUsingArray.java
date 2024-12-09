import java.util.Scanner;

public class SwapTowNumbersUsingArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double[] numbers =new  double[2];

        System.out.print("Enter first number: ");
        numbers[0] = scanner.nextDouble();

        System.out.print("Enter second number: ");
        numbers[1] = scanner.nextDouble();

        // for(double num : numbers){
        //     System.out.print(num);
        //     System.out.print(", ");
        // }

        SwapFunc(numbers);

        System.out.println("After swapping, first number is = " + numbers[0] + " Second number is = " + numbers[1] + ".");

        // for(double num : numbers){
        //     System.out.print(num);
        //     System.out.print(", ");
            
        // }

        scanner.close();
        

    }

    public static void SwapFunc(double[] arr){
        double temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

    }
    
}
