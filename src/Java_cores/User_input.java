package Java_cores;

import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("name : ");
        String name = scanner.nextLine(); // reads a string from input

        System.out.print("age : ");
        int age = scanner.nextInt(); // reads an int from input

        System.out.print("exam mark : ");
        double exam = scanner.nextDouble(); // reads a double from input

        System.out.print("boy (true/false) : ");
        boolean gender = scanner.nextBoolean(); // reads a boolean from input

        System.out.println("hello " + name);
        System.out.println("you are " + age);
        System.out.println("you got " + exam);
        if (gender) {
            System.out.println("you are a boy");
        } else {
            System.out.println("you are a girl");
        }

        // when inputting a string after an int (for example) it may account
        // for the \n when you press enter , to clear the buffer solution is :

        System.out.print("nb : ");
        int nb = scanner.nextInt();
        scanner.nextLine(); // call .nextLine() without assigning it

        System.out.print("string : ");
        String str = scanner.nextLine();

        System.out.println(nb);
        System.out.println(str);

        scanner.close();
    }
}
