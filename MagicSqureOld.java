import java.util.ArrayList;
import java.util.Scanner;

public class MagicSqureOld {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        int magicnum= scanner.nextInt();

        

        

        ArrayList<ArrayList<Integer>> table = new ArrayList<>();

        ArrayList<Integer> row0 = new ArrayList<>();
        for(int i=1; i<=3;i++){
            int value = scanner.nextInt();
            row0.add(value);
        }
        

        ArrayList<Integer> row1 = new ArrayList<>();
        for(int i=4; i<=6;i++){
            int value = scanner.nextInt();
            row1.add(value);
        }

        ArrayList<Integer> row2 = new ArrayList<>();
        for(int i=7; i<=9;i++){
            int value = scanner.nextInt();
            row2.add(value);
        }

        table.add(row0);
        table.add(row1);
        table.add(row2);

        // for(ArrayList<Integer> row :table){
        //     for(Integer values: row){
        //         System.out.print(values + " ,");
        //     }
        //     System.out.println();

        // }

        // System.out.println("............");

        int row01 =magicnum -(table.get(0).get(0) + table.get(0).get(2));
        row0.set(1,row01);

        int row10 =magicnum -(table.get(0).get(0) + table.get(2).get(0));
        row1.set(0,row10);

        int row21 =magicnum -(table.get(2).get(0) + table.get(2).get(2));
        row2.set(1,row21);


        for(ArrayList<Integer> row :table){
            for(Integer values: row){
                System.out.print(values + ",");
            }
            // System.out.println();

        }



        




    }
}