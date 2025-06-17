package Java_cores.Enums;

public class Main {
    public static void main(String[] args) {
        /*
            Enums : ( Enumerations )
                A special kind of class that represents a fixed set of constants
                They improve code readability and are easy to maintain
                And are more efficient with switches when comparing Strings
         */

        Day day = Day.SUNDAY; // change the (X) Day.X
        // System.out.println(day)
        // System.out.println(day.getDayNumber())
        // System.out.println(Day.valueOf("SUNDAY"));

        switch (day) {
            case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY -> System.out.println("It is a weekday");
            case SATURDAY,SUNDAY -> System.out.println("It is a weekend :)");
            default -> System.out.println("Invalid choice");
        }

    }
}
