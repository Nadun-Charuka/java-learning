import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Object lock = new Object();//synchronization lock
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern 1 = ");
        String p1 =scanner.next(); 
        System.out.print("Enter pattern 2 = ");
        String p2 =scanner.next(); 
        System.out.print("Enter count = ");
        int count =scanner.nextInt(); 

        Thread thread01 = new Pattern01(lock,p1,count);
        Thread thread02 = new Pattern02(lock,p2,count);

        thread01.start();
        thread02.start();

        try {
            thread01.join();
            thread02.join();
        } catch (InterruptedException ex) {
        }


    }
}
