public class FactorialNormalWay {
    public static void main(String[] args){
        
        System.out.println(factorialFunc(6));
    }

    public static int factorialFunc(int facNum){

        if (facNum == 0 || facNum == 1) {
            return 1;
        }
        
        int factorial =1;

        for (int i = facNum; i>=2; i--) {
            factorial = factorial*i;
        }

        return factorial;
        
    }

}
    

