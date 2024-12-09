import java.util.ArrayList;
public class TwoDimensionArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> row1 = new ArrayList<>();
        for(int i=1;i<=5;i++){
            row1.add(i);
        }
        
        ArrayList<Integer> row2 = new ArrayList<>();
        for(int i=6;i<=10;i++){
            row2.add(i);
        }

        matrix.add(row1);
        matrix.add(row2);

        for(ArrayList<Integer> row : matrix){
            for(Integer value : row){
                System.out.print(value + " ");

            }
            System.out.println();
            
        }



    }
    
}
