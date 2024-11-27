package ch02;

public class ExMain {
    public static void main(String[] args) {
        Thread threadA = new Thread(new PrintWork("A", 1000));
        Thread threadB = new Thread(new PrintWork("B", 500));

        threadA.setName("Thread-A");
        threadB.setName("Thread-B");

        threadA.start();
        threadB.start();
    }
}
