public class RandomNum {
    public static void main(String args[]){
        //normal random number [0,1)
        System.out.println(Math.random());

        //random nuber from 0 to 9
        int randomNum1 = (int)(Math.random() *10);
        System.out.println(randomNum1);

        //random nuber from 0 to 10
        int randomNum2 = (int)(Math.random() *11);
        System.out.println(randomNum2);




        //Random number between 10 and 20 ----> [10,20]
        int min = 10;
        int max = 20;

        int randomNumber3 = (int) (Math.random() * (max - min + 1)) + min;

        //(max - min + 1) this part tell how many numbers are in the range between min and max, including both min and max.

        System.out.println("Random number between 10 and 280: " + randomNumber3);


        

    }
    
    
}
