package ch02;

import static util.MyLogger.log;

public class ThreadB implements Runnable{


    @Override
    public void run() {
        while(true){
            log("B");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
