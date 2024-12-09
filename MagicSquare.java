import java.util.ArrayList;
import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         //input format 
        /*
         * 18
         * 
         * 1,2,3,4,5,6,7,8,9
         */

        // Read the magic number
        int magicnum = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after the integer input

        scanner.nextLine(); // read an empty line

        // Read the entire line for the 3x3 array
        String inputLine = scanner.nextLine(); // e.g., "1,2,3,4,5,6,7,8,9"
        String[] values = inputLine.split(",");



        /*
         * 1 2 3
         * 4 5 6 
         * 7 8 9
         */


        // Create a 3x3 ArrayList
        ArrayList<ArrayList<Integer>> table = new ArrayList<>();

        // Fill the 3x3 ArrayList with the parsed integers
        for (int r = 0; r < 3; r++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int c = 0; c < 3; c++) {
                int index = r * 3 + c; // Calculate the correct index for a 3x3 grid from the String[] values 
                row.add(Integer.parseInt(values[index].trim())); // Parse and add value
            }
            table.add(row); // Add the row to the table
        }

        // Example calculations to adjust specific values based on the magic number
        int row01 = magicnum - (table.get(0).get(0) + table.get(0).get(2)); // Adjust second element of row0
        table.get(0).set(1, row01);// get the first row and set the 2 nd element to value which hold int row01 variable

        int row10 = magicnum - (table.get(0).get(0) + table.get(2).get(0)); // Adjust first element of row1
        table.get(1).set(0, row10);

        int row21 = magicnum - (table.get(2).get(0) + table.get(2).get(2)); // Adjust second element of row2
        table.get(2).set(1, row21);


        // for(ArrayList<Integer> row :table){
        //     for(Integer value:row){
        //         System.out.print(value);
        //     }
        //     System.out.println();
        
        // }

        /*
        input - 9,0,7,0,6,8,5,0,3
        output
        927
        468
        5103
        */
        

        // // Print the table as a single line without trailing commas
        // StringBuilder output = new StringBuilder();
        // for (ArrayList<Integer> row : table) {
        //     for (int j = 0; j < row.size(); j++) {
        //         output.append(row.get(j));
        //         // Append a comma only if it's not the last element in the row
        //         if (j < row.size() - 1 || (table.indexOf(row) < table.size() - 1)) {
        //             output.append(",");
        //         }
        //     }
        // }

        StringBuilder output = new StringBuilder();
        String delimeter ="";
        for(ArrayList<Integer> row :table){
            for(int j= 0;j<row.size();j++){
                
                //"Append the delimiter to output, then append the element at index j from row to output."
                output.append(delimeter).append(row.get(j));
                delimeter =",";

            }
            

        }
        // Print the final output as a single line
        System.out.println(output.toString());

        scanner.close(); // Close the scanner to avoid resource leak
    }
}
