package ch02;

public class DaemonThreadMain {

    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName()+": main() 시작");

        DaemonThread daemonThread = new DaemonThread();

        daemonThread.setDaemon(false);
        daemonThread.start();

        System.out.println(Thread.currentThread().getName()+": main() 종료");

    }

    static class DaemonThread extends Thread{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+ ": run()");

            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName()+": run() 종료");
        }


    }
}
