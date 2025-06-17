package Java_cores;

public class Variables {
    // var can be seen by all methods it is called a 'class variable'
    static int var = 9;
    // intellij = psvm + tab = public static void main(String[] args) {}
    public static void main(String[] args) {
        // intellij : sout + tab = System.out.println();
        System.out.println("hello :)");
        // primitive variable : simple value stored directly in memory (stack)
        // reference variable : memory address (stack) that points to the (heap)
        /*
            Primative --- Reference
            int       --- string
            double    --- array
            char      --- object
            boolean   ---
         */
        // defining a string :
        String x = "idk"; //  it is "String" not "string"
        // defining a boolean :
        boolean y = true;
        // etc...
    }
}
