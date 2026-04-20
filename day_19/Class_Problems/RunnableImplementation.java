class Timer implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
             
            try {
                System.out.println(Thread.currentThread().getName() + " is sleeping for 1 second.");
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class RunnableImplementation {
    public static void main(String[] args) {
        Timer t1= new Timer();
        Timer t2= new Timer();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }
}
