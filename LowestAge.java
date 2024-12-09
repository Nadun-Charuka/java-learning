public class LowestAge {
    public static void main(String[] args){
        int[] ages ={18,20,56,41,36,11,5,6,78};

        int lowestAge = ages[0];

        for(int age: ages){
            if(lowestAge > age){
                lowestAge = age;
            }

        }

        System.out.print(lowestAge);


    }
    
}
