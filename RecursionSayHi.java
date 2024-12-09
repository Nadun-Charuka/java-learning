public class RecursionSayHi {
    public static void main(String [] args){
        sayHi(4);

    }

    public static void sayHi(int count){
        System.out.println("Hi!");

        if (count<=1){
            return;
        }

        sayHi(count -1);
    }
    
}
