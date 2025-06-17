package Java_cores.Generics;

public class Main {
    public static void main(String[] args) {
        /*
            Generics :
                A concept where you can write a class, interface, or a method
                that is compatible with different data types
                <T> / <T, U>  type parameter (more than one type is possible)
                ( or any letter, its just a placeholder that gets replaced with a real type )
                <String> type argument ( or any other specifed type (wrapper class) )
            FOR example :
                We see generics in ArrayList<> where in between <> you specify which type you want
                in the source code of ArrayList, you will find a placeholder ArrayList<E> ( short for element )
         */

        Box<String> box1 = new Box<>();
        box1.setItem("Banana");
        System.out.println(box1.getItem());

        Box<Integer> box2 = new Box<>();
        box2.setItem(2);
        System.out.println(box2.getItem());

        Product<String, Double> product1 = new Product<>("Apple", 1.5);
        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());

    }
}
