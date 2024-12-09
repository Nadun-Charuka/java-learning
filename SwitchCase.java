import java.util.Scanner;
public class SwitchCase {
    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println(" 1 -> + \n 2 -> - \n 3 -> * \n 4 -> / \n 5 -> % \n");

        System.out.print("Enter the first number: ");
        double num1 =scanner.nextDouble();
        System.out.print("Enter the number for oparater :");
        int opr = scanner.nextInt();
        System.out.print("Enter the second number: ");
        double num2 =scanner.nextDouble();

        

        switch(opr){
            case 1:
                System.out.println(num1 + " + " + num2 +" = " + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 +" = " + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + " x " + num2 +" = " + (num1 *num2));
                break;
            case 4:
                System.out.println(num1 + " / " + num2 +" = "+ (num1 /num2));
                break;
            case 5:
                System.out.println(num1 + " % " + num2  +" = "+ (num1 %num2));
                break;
            default:
                System.out.println("Invalid Input....");
                break;
            

        }
        

    }
    
}
