package ch02;
import static util.MyLogger.*;

public class ThreadA implements Runnable {

    @Override
    public void run() {
        while(true){
            log("A");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
