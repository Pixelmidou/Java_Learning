package Java_cores;

public class Variable_arguments {
    public static void main(String[] args) {
        /*
            *** varargs or variable arguments :
            allow a method to accept varying X arguments
            which makes methods more flexible, no need for method overloading
            java will pack arguments into an array
            ... (ellipsis)
         */
        // you can add as many arguments as you want
        System.out.println(add(1,2,3,4));
    }
    /*
      INSTEAD OF :
            static int add(int a,int b) {
                return a + b;
            }
            static double add(int a, int b, int c) {
                return a + b;
            }
            static double add(int a, int b, int c, int d) {
                return a + b;
            }
       WE DO :
     */
    static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
