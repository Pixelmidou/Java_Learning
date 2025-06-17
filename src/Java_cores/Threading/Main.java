package Java_cores.Threading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Thread :
                A set of instructions that run independently from other threads

            Threading :
                Allows a program to run multiple tasks simultaneously
                Helps improve performance with time-consuming operations
                (File I/O, network communications, or any background tasks)

            How to create a Thread :
                Option 1 : Extend the Thread class (simpler)
                Option 2 : Implement the Runnable interface (better)
         */

        // Example of two threads running independantly
        // User inputs name ( Main thread )
        // timer functionallity ( sperate thread )

        Scanner scanner = new Scanner(System.in);

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        /*
            By default the program does not exit until all threads are done
            We want the program to exit in two cases :
                1- When the user inputs a name before the timer runs out
                2- When the timer runs out
            To satisfy these conditions :
                - The timer thread must exit when the main thread finishes
                    TO ACHIEVE THIS :
                        Use a "Daemon thread" ( thread.setDaemon(true) )
                        A "Daemon thread" will end when the Main thread ends
                - The main thread must exist if the timer runs out ( the timer thread exits )
                    TO ACHIEVE THIS :
                        In the timer code, when the timer runs out we FORCEFULLY make the program exits
                        With System.exit(0)
         */
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 5 seconds to enter your name");
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();

    }
}

