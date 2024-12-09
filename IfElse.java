
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter Second number: ");
        double num2 = scanner.nextDouble();

        if(num1>num2){
            System.out.println(num1 + " is the biggest number.");
        }else{
            System.out.println(num2 + " is the biggest number.");
        }

        scanner.close();




        

        


    }
    
}
