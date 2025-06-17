package Java_cores;

public class Wrapper_classes {
    public static void main(String[] args) {
        /*
            Wrapper classes :
                Allows primitive values (int, char, double, boolean)
                to be used as objects, "Wrap them in an object"
                Generally, you don't wrap primitives unless you need an object
                Allows the user of collections framework and static utility methods
         */

        // Deprecated method ( since java 9 )
        // We will use it just visualize what's happening
        // instead of int a = 123; we wrap it in an object
        Integer a = new Integer(123); // an object containing a primitive value
        Double b = new Double(3.14);
        Character c = new Character('c');
        Boolean d = new Boolean(true);

        // Current method
        // It is called autoboxing
        // instead of defining a new X()
        // We directly assign a primitive value to the X object
        Integer e = 123; // an object containing a primitive value
        Double f = 3.14;
        Character g = 'c';
        Boolean h = true;

        // Unboxing ( converting an object back into its primitive )
        int i = e;
        // etc for the other types...

        // Utility methods of these Wrapper classes (Integer,Double ...)

        // Convert a primitive to a String
        String s1 = Integer.toString(122);
        String s2 = Double.toString(12.2);
        // etc for the other types...

        // Convert a String to a primitive
        int a1 = Integer.parseInt("123");
        double a2 = Double.parseDouble("1.23");
        // etc for the other types...

        // Other utility methods
        char letter = 'b';
        System.out.println(Character.isLetter(letter)); // 'b' returns true , '$' returns false
        System.out.println(Character.isUpperCase(letter));
        // and more ....
    }
}
