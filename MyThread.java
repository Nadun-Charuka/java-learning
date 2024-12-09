public class MyThread extends Thread{
    int sleepTime = 1000;;
    @Override
    public void run(){
        for(int i=10; i>0;i--){
            System.out.println("Thread #1 : "+ i);
            
            try {
                Thread.sleep(sleepTime);
                
            } catch (InterruptedException e) {

            }
        }
        System.out.println("Thread #1 finished");

    }
}
