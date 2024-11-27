package ch03;

import static util.MyLogger.log;

public class ThreadInfoMain {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        log(mainThread);
        log(mainThread.threadId());
        log(mainThread.getName());
        log(mainThread.getPriority());
        log(mainThread.getContextClassLoader());
        log(mainThread.getState());

    }
}
