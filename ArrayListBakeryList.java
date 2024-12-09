import java.util.*;
public class ArrayListBakeryList {
    public static void main(String[] args){

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");


        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("garlic");
  

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("soda");
        drinkList.add("coffe");


        ArrayList<ArrayList<String>>  groceryList = new ArrayList<>();

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);
        

        System.out.println(bakeryList.size());


        // for(ArrayList<String> row : groceryList){
        //     for(String value: row ){
        //         System.out.print(value + ",");
        //     }
        //     System.out.println();
        // }



        

        









    }
    
}
