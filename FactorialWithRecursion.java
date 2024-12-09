public class FactorialWithRecursion {
    public static void main(String[] args){
        System.out.println(factorialFunc(5));

    }
    public static int factorialFunc(int facNum) {
        if (facNum == 0 || facNum == 1) {
            return 1;
        }
        return facNum * factorialFunc(facNum - 1); // Recursive call
    }

    
    
}
