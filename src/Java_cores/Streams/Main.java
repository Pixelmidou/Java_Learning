package Java_cores.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
            Stream :
                A Stream is a way to process a sequence of data (like a list or array)
                step-by-step without changing the original data.
                It lets you:
                    Filter (pick only some items)
                    Transform (change items)
                    Sort and aggregate (sum, count, group)

            Collectors :
                They are helpers you use at the end of a stream
                to gather or combine the processed data into a useful result

            Comparators:
                Mainly used with Object Sorting as in them
                You define a certain way to sort objects by
                for example sort objects by age desc
                and they are used with sorting method ( like Collectors.sort(...) / .sorted(...) )
                Meaning you pass the comparator as a parm to the sorting method ,
                and it sorts according to it

         */

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 22, "New York"));
        people.add(new Person("Bob", 17, "Chicago"));
        people.add(new Person("Charlie", 25, "New York"));
        people.add(new Person("David", 30, "Chicago"));
        people.add(new Person("Eve", 19, "New York"));
        people.add(new Person("Frank", 16, "Boston"));
        people.add(new Person("Grace", 21, "Chicago"));

        // Stream processing
        Map<String, List<Person>> groupedByCity = people.stream()
                .filter(person -> person.age >= 18) // 1. Filter adults
                .collect(Collectors.groupingBy(      // 2. Group by city
                        person -> person.city,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()        // 3. Sort each group by age
                                        .sorted(Comparator.comparingInt(p -> p.age))
                                        .collect(Collectors.toList())
                        )
                ));

        groupedByCity.forEach((city, personList) -> {
            System.out.println("City: " + city);
            personList.forEach(person -> System.out.println("  - " + person));
        });
    }
}
