package Java_cores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

        // try with resources , automatically closes the scanner when finished
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("enter a number : ");
            int number = scanner.nextInt();
            System.out.println(number);

        } catch (ArithmeticException e) {
            System.out.println("YOU CANT DIVIDE BY ZERO !");
        } catch (InputMismatchException e) {
            System.out.println("THAT WASNT A NUMBER !");
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
        // finally : always executes wether an exception is thrown or not
    }
}
