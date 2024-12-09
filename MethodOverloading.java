public class MethodOverloading{
    public static void main(String[] args){
        System.out.println(add(2,3));
        System.out.println(add(2.6,3.2,5.1));
        System.out.println(add(2,3,5));
        
    }

    public static int add(int a , int b){
        return a+b;

    }
    public static double add(double a , double b, double c){
        return a+b+c;
    }

    public static int add(int a ,int b, int c){
        return a+b+c;
    }
}