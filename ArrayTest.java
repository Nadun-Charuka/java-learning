public class ArrayTest {
    public static void main(String [] args){
        int[] numbers ={1,2,3,4,5};

        System.out.println(numbers);
        System.out.println(numbers[0]);
        modifyArray(numbers);
        System.out.println(numbers[0]);


        

        
    }
    public static void modifyArray(int[] arr){
        arr[0]=10;
        // int arry[] ={2,4,6,8,10};
        // System.out.println(arry[0]);
    }
    
}
