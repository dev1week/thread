package ch02;

public class HelloRunnableMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+ ": main() 시작");

        HelloRunnable runnable = new HelloRunnable();
        Thread thread = new Thread(runnable);

        thread.start();

        System.out.println(Thread.currentThread().getName()+": main() 종료");
    }
}
