

import java.util.ArrayList;
public class ArrayListTesting {
    public static void main(String[] args){
        // Creating an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Accessing elements by index
        System.out.println("First element: " + list.get(0));

        // Iterating through the ArrayList
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Size of the ArrayList
        System.out.println("Size: " + list.size());

        // Removing an element
        list.remove("Banana");

        // Checking if the list contains an element
        System.out.println("Contains Apple? " + list.contains("Apple"));

        // Clearing the list
        list.clear();
    }


}
