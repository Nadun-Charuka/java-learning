public class Array2d {
    public static void main(String[] args){

        //   1 st method
        String [][] cars = new String [3][3];
        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Mustang";

        cars[1][0] = "1978";
        cars[1][1] = "1946";
        cars[1][2] = "1988";

        cars[2][0] = "2000cc";
        cars[2][1] = "2000cc";
        cars[2][2] = "2000cc";

        //   2 nd method
        String[][] carNew ={
            {"Camaro","Corvette","Mustang"},
            {"1978","1946","1988"},
            {"2000cc","2000cc","2000cc"},
        };



        

        for(String[] row :carNew){
            String delimiter ="";
            for(String car : row){
                System.out.print(delimiter + car);
                delimiter =",";
            }
            System.out.println();
        }







    }

    
    
}
