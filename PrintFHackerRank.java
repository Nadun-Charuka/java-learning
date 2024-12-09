import java.util.Scanner;

public class PrintFHackerRank {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String r1c1,r2c1,r3c1;
        int r1c2,r2c2,r3c2;
        
        r1c1 = scanner.next();
        r1c2 =scanner.nextInt();
        
        r2c1 = scanner.next();
        r2c2 =scanner.nextInt();
        
        r3c1 = scanner.next();
        r3c2 =scanner.nextInt();
        
        
        System.out.println("================================");
        System.out.printf("%-14s %03d %n",r1c1,r1c2 );
        System.out.printf("%-14s %03d %n",r2c1,r2c2 );
        System.out.printf("%-14s %03d %n",r3c1,r3c2 );
        System.out.println("================================");

    }
    
    
}
