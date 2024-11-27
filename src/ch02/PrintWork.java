package ch02;

import static util.MyLogger.log;

public class PrintWork implements Runnable{

    private String content;
    private int sleepMs;

    public PrintWork(String content, int sleepMs) {
        this.content = content;
        this.sleepMs = sleepMs;
    }


    @Override
    public void run() {
        while(true){
            log(content);

            try {
                Thread.sleep(sleepMs);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
