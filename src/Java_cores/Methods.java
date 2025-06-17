package Java_cores;

public class Methods {
    public static void main(String[] args) {
        System.out.println(add(5,5));
        System.out.println(add(4.5,4.5));
    }

    // method overloading :
    // it means methods that share the same name but different parameters
    static int add(int a,int b) {
        return a + b;
    }
    static double add(double a,double b) {
        return a + b;
    }

}
