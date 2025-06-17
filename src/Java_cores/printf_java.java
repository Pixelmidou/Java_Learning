package Java_cores;

public class printf_java {
    public static void main(String[] args) {
        // printf() used to format output
        // %[flags][width][.percision][specifier-character]

        String name = "Spongebob";
        char firstchar = 'S';
        int age = 30;
        double height = 1.5;
        boolean employed = true;

        System.out.printf("hello %s\n", name);
        System.out.printf("starts with : %c\n", firstchar);
        System.out.printf("age : %d\n", age);
        System.out.printf("height : %f\n", height);
        System.out.printf("employed : %b\n", employed);

        double nb1 = 9.99;
        double nb2 = 1000.15;
        double nb3 = -54.01;

        // the default of percision is 6 digits after decimal
        // setting the [.percision] : .1 : display 1 digit after decimal / .2 .3 etc

        // [flags]
        // "+" outputs a plus
        // "," seperates thousands for example : 1,000 / 100,000
        // "(" negative numbers are in ()
        // "space" display a minus if negative , space if positive

        System.out.printf("nb 1 : %+.1f\n", nb1);
        System.out.printf("nb 2 : %,.2f\n", nb2);
        System.out.printf("nb 3 : %(.3f\n", nb3);

        // [width] (x is an int)
        // 0X = zero padding for example :
                // 04 means if int a = 4 it displays as 0004
        // X = right justified padding
        // -X = left justified padding

        int a = 1;
        int b = 60;
        int c = 7;

        System.out.printf("%04d\n", a);
        System.out.printf("%4d\n", b);
        System.out.printf("%-4d\n", c);


    }
}
