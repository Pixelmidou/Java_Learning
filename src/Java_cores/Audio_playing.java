package Java_cores;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Audio_playing {
    public static void main(String[] args) {

        // Play audio with java ( .wav , .au , .aiff )

        File file = new File("src/Java_cores/audio.wav");

        try (
                Scanner scanner = new Scanner(System.in);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)
            ) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";
            while (!response.equals("Q")) {

                System.out.println();
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice : ");

                response = scanner.next().toUpperCase();

                switch (response) {
                    // case "P" -> clip.start();
                    // or if we want it to play continously
                    case "P" -> clip.loop(Clip.LOOP_CONTINUOUSLY);
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio source");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio File is not supported");
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        } finally {
            System.out.println("bye !");
        }

    }
}
