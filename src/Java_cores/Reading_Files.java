package Java_cores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reading_Files {
    public static void main(String[] args) {

        // Reading a file with java ( 3 popular options )
        // BufferedReader + FileReader = Best for reading text files line-by-line
        // FileInputStream = Best for binary files (images, audio files, ...)
        // RandomAccessFile = Best for read/write specific portions of a large file

        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }

    }
}
