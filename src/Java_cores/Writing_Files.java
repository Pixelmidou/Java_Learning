package Java_cores;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Writing_Files {
    public static void main(String[] args) {

        // Writing a file with java ( 4 popular options )
        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structred data, like reports or logs
        // FileOutputStream = Best for binary files (images, audio files, ...)

        try (FileWriter writer = new FileWriter("test.txt")) {

            writer.write("""
                    Hello :)
                    idk
                    fudge you :)
                    """);


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }

    }
}
