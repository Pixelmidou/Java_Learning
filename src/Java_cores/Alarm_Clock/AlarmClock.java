package Java_cores.Alarm_Clock;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable {

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);
                LocalTime now = LocalTime.now();
                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());

            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
        playSound(filePath);
    }
    private void playSound(String filePath) {

        try (
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(filePath))
        ) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            System.out.print("\nPress Enter to stop the alarm ");
            scanner.nextLine();
            clip.stop();
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio source");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio File is not supported");
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }

    }
}
