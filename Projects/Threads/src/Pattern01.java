public class Pattern01 extends Thread{
    private Object lock;
    private String pattern;
    private int count;
    
    public Pattern01(Object lock, String pattern ,int count){
        super();
        this.lock = lock;
        this.pattern = pattern;
        this.count =count;

    }
    public void run(){
        synchronized (lock) {
            for (int i = 0; i < count; i++) {
                System.out.print("Pattern 01 Thread = ");
                for (int j = 0; j<count -i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(pattern + " ");
                }
                System.out.println();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            
        }

    }
    
}
