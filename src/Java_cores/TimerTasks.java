package Java_cores;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTasks {
    public static void main(String[] args) {
        /*
            Timer :
                Class that schedules tasks at specific times or periodically
                Useful for : sending notifications, scheduled updates, repetitive actions

            TimerTask :
                Represents the task that will be executed by the Timer (above)
                You will extend the TimerTask class to define your task
                Create a subclass of TimerTask and @Override run()
         */
/*
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int count = 3;
            @Override
            public void run() {
                System.out.println("Hello");
                count--;
                // When counter reaches 0, end the task
                if (count <= 0) {
                    System.out.println("task complete");
                    timer.cancel();
                }
            }
        };

        // After 3 seconds (3000ms : delay) , execute 'task' every 1 second (1000ms : period)
        timer.schedule(task, 3000, 1000);
*/
        // Example : Countdown Timer
        Timer counterTimer = new Timer();
        TimerTask counterTask = new TimerTask() {
            int count = 5;
            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count <= 0) {
                    System.out.println("Happy new Year");
                    counterTimer.cancel();
                }
            }
        };

        counterTimer.scheduleAtFixedRate(counterTask, 0, 1000);

    }
}
