public class UseForEachLoopForIterateArray {
    public static void main(String[] args){
        int[] numbers ={1,2,3,4,5};

        // System.out.println(numbers.length);

        // we cannot use this to modify or access through the index
        // this is only for read only mode for a array.
        for(int number : numbers){
            System.out.println(number);
        }
    }
    
}
