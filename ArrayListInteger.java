import java.util.ArrayList;
public class ArrayListInteger {
    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(0 , 10);  
        numbers.add(1, 20);
        numbers.add(2, 30);

        numbers.add(3,50);

        for(Integer num: numbers){
            System.out.println(num);
        }

        System.out.println(".......");

        numbers.set(3,40);

        for(Integer num: numbers){
            System.out.println(num);
        }



    }

    
}
