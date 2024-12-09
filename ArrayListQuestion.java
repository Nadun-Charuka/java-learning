import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQuestion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (0 to quit): ");
        int number = scanner.nextInt();

        ArrayList <Integer> numList = new ArrayList<>();

        while(number !=0){
            if(number%2 != 0){
                numList.add(number);
            }
            number = scanner.nextInt();
        }

        System.out.println("Odd numbers: "+ numList);

        scanner.close();


    }
    
}
