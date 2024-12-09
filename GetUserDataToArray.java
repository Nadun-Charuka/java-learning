import java.util.Scanner;

public class GetUserDataToArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int [] num = new int[5];

        for(int i =0; i<5; i++){
            System.out.print("Enter any integer: ");
            num[i] = scanner.nextInt();
        }

        for(int i=0;i<5;i++){
            System.out.print(num[i] + ", ");

        }

        scanner.close();

    }
    
}
