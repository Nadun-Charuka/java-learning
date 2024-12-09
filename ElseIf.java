import java.util.Scanner;
public class ElseIf {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Use 24 hours time format eg-22.36 ,18.00,23.59,0.00 ");
        System.out.print("Enter the current time: ");
        double time = scanner.nextDouble();

        
        if (time < 12.00) {
            System.out.println("Good morning.");
        } else if (time < 18.00) {
            System.out.println("Good evening .");
        } else if(time <=23.59){
            System.out.println("Good night");
        }else{
            System.out.println("Invalid Input"); 
        }

        scanner.close();

    }
    
}
