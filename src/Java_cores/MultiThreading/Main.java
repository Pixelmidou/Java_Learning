package Java_cores.MultiThreading;

public class Main {
    public static void main(String[] args) {
        /*
            MultiThreading :
                Enables a program to run mutliple threads concurrently
                ( Thread = A set of instructions that run independently )
                Useful for background tasks or time-consuming operations
         */

        /*
            MyRunnable runnable = new MyRunnable();
            Thread thread = new Thread(runnable);
            OR (shorter) :
         */
        Thread thread0 = new Thread(new MyRunnable("PING"));
        Thread thread1 = new Thread(new MyRunnable("PONG"));

        System.out.println("GAME START!");

        // They run concurrently, meaning there is no way to determine
        // the order of printing (What thread prints before the other)
        // Except in case WE OURSELVES , make them print in order
        // for example if we want to print "ping" before "pong"
        // we just make thread1 sleep for a little to give time to thread0 to start first
        thread0.start();
        thread1.start();

        // By default the main thread does not wait for the other threads to finish
        // We are making the main thread wait for thread0 and thread1
        try {
            thread0.join();
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }

        System.out.println("GAME OVER !");

    }
}
