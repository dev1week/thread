package ch02;
import static util.MyLogger.*;

public class ExThread implements Runnable {


    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            try {
                Thread.sleep(1000);
                log(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
