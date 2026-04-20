class Timer1 extends Thread{
    public void run(){
         
         for(int i=0;i<=5;i++){
            try{
                System.out.println("Timer1:"+i);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
             
        }
    }

}
class Timer2 extends Thread{
    public void run(){
         for(int i=0;i<=5;i++){
            System.out.println("Timer2:"+i);
         }
    }
}

public class ThreadImplementation{
    public static void main(String[] args) {
        Thread musicThread = new Timer1();
        Thread timerThread = new Timer2();   
        musicThread.start();
        timerThread.start();
    }
}