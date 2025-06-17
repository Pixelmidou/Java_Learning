package Java_cores;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates_Times {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println();

        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println();


        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);
        System.out.println();

        Instant instant = Instant.now(); // UTC timestamp
        System.out.println(instant);
        System.out.println();

        // Custom format
        // Visit Java documentation for formatting patters
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = datetime.format(formatter);
        System.out.println(newDateTime);
        System.out.println();

        // Instead of current date , we can create a custom date
        LocalDate customDate = LocalDate.of(2025, 12, 25);
        System.out.println(customDate);
        System.out.println();

        LocalDateTime customDateTime = LocalDateTime.of(2025, 12, 25, 0, 1);
        System.out.println(customDateTime);
        System.out.println();

        // date1.isBefore(date2)
        // date1.isAfter(date2)
        // date1.isEqual(date2)

    }
}
