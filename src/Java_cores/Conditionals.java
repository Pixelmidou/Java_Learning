package Java_cores;

public class Conditionals {
    public static void main(String[] args) {

        // example of ternary operator
        boolean gender = true;
        String x = gender ? "boy" : "girl";

        // example of switch

        String day = "Monday";
        switch (day) {
            // case "Saturday" -> System.out.println("weekend");
            // case "Sunday" -> System.out.println("weekend");
            // OR
            case "Saturday","Sunday" -> System.out.println("weekend");
            default -> System.out.println("weekday");
        }

    }
}
