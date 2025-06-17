package Java_OOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Objects :
                Entities that hold data (attributes)
                And can perform actions (methods)
                it is a reference data type
         */

        // student1 & student2 are instances/objects of the "Student" class
        // Each one holds its own values , as demonstrated

        // a "Student" object named "student1"
        Student student1 = new Student("spongebob", 30);
        // a "Student" object named "student2"
        Student student2 = new Student("patrick", 31);

        System.out.println(student1.name + " " + student1.age + " " + student1.isEnrolled);
        student1.dropout();
        System.out.println(student1.name + " " + student1.age + " " + student1.isEnrolled);
        System.out.println(student2.name + " " + student2.age + " " + student2.isEnrolled);
        System.out.println("\n");

        // Array of objects
        Student[] students = {student1, student2};
        for (Student student : students) {
            System.out.println(student.name + " " + student.age);
        }
        // using anonymous objects
        Student[] anonstudents = {new Student("sam", 18), new Student("jack", 20)};
        for (Student student : anonstudents) {
            System.out.println(student.name + " " + student.age);
        }
        System.out.println("\n");

        // static usage
        // notice how we used the class name (Student) , not the object name (student1 or student 2)
        // System.out.println("num of students : " + Student.numstudents);

        // for example here Student.showstudents() belongs to the class
        // it dosen't make sense to type student1.showstudent()
        Student.showstudents();
        System.out.println("\n");

        // Inheritance (Student & International_student)
        International_student intstudent1 = new International_student("alex", 30, "USA", "US123");
        International_student intstudent2 = new International_student("Romeo", 20, "Italy", "IT1235");
        // see how intstudent inherited (name & age) from the parent class
        System.out.println(intstudent1.name + " " + intstudent1.age);
        intstudent1.showinfo();
        // see how showstudents() counts even intstudent object
        Student.showstudents();
        System.out.println("\n");


        // Method overriding
        // see how we overrided the method in International_Student class
        // so that it also invalidates the visa of the student as well
        System.out.println(intstudent2.isVisaValid);
        intstudent2.dropout();
        System.out.println(intstudent2.isVisaValid);
        System.out.println("\n");


        // .toString()
        // Normally to show info we do : System.out.println(student1.name + " " + student1.age);
        // With an overriden .toString() , we can directly print the object , like so :
        System.out.println(student1);
        System.out.println(student2);
        System.out.println("\n");

        // Abstraction
        // Exchange_student can't be instantiated directly , as it is an abstract class
        // so we instantiate directly the exchange program itself (Erasmus & Fullbright classes)
        Fullbright full_student = new Fullbright("philip", 20, "France", "FR123", "FRCS", "USLA", 12, "Murphy", "US-StateDep", true);
        Erasmus era_student = new Erasmus("Wondu", 20, "Guinea", "GU123", "GUART", "FRART", 24, "Jean", false, 200.50);

        // getProgramName() IS AN ABSTRACT METHOD OF Exchange_Student
        // Defined by "Erasmus" & "Fullbright"
        full_student.getProgramName();
        era_student.getProgramName();
        // showdetails() IS A CONCRETE METHOD of Exchange_Student
        // Inherited by "Erasmus" & "Fullbright"
        full_student.showdetails();
        era_student.showdetails();
        System.out.println("\n");

        // Interface
        // Using the methods
        // (required by the "Contactable" interface on the "Student" class to define)
        student1.getEmergencyContact();
        student1.updateEmergencyContact("Parent");
        student1.getEmergencyContact();
        System.out.println("\n");


        /*
            Polymorphism ( "poly = many" & "morph = shape" ====> "many shapes" )
                Objects can identify as other objects
                Objects can be tread as objects of a common superclass
                ( Note: polymorphism can be done through interfaces as well )
            FOR example:
                a "Dog" can identify as
                    "Mammal" / "Animal" / "Organism"
                on the parenthood scale ( from youngest to oldest ) :
                    Dog <- Mammal <- Animal <- Organism
                To summarize:
                    a "Dog" object can identify as an object of either of the 3 superclasses
             This will be demonstrated below with
                ( Student - International_Student - Erasmus - Fullbright )
         */

        // all objects of International_Student-Erasmus-Fullbright
        // can identify as Student as it is the oldest common superclass
        Student[] polystudents = {intstudent1, era_student, full_student};
        for (Student polystudent : polystudents) {
            // reminder : polystudent can be printed because of overriden .toString() in Student
            System.out.println(polystudent);
        }
        System.out.println("\n");

        /*
            Runtime Polymorphism:
                When the method that gets executed is decided
                at runtime based on the actual type of the object
            FOR example:
                We have "Exchange_student" which is an abstract class
                we can not directly instantiate an "Exchange_student"
                but through polymorphism an "Exchange_Student" object can be
                either an "Erasmus" or "Fullbright", it will be decided at runtime
                depending on what program the user has chosen
         */
        // We will be accepting user input through "Scanner"
        Scanner scanner = new Scanner(System.in);

        Exchange_student exchangestudent; // can not be instantiated directly ( abstract class )

        System.out.print("are you an Erasmus student (1) or a Fullbright Student (2) : ");
        // Here we do not know which getProgramName(); will be executed
        // the Erasmus one or the Fullbright one
        // It is determined at runtime , therefore runtime polymorphism
        int choice = scanner.nextInt();
        if (choice == 1) {
            // the object time here at runtime is Erasmus
            exchangestudent = new Erasmus("Gaou", 25, "Mali", "MA123", "MAARCH", "DEARCH", 10, "Caroline", true, 300.50);
            exchangestudent.getProgramName();
        } else if (choice == 2) {
            // the object time here at runtime is Fullbright
            exchangestudent = new Fullbright("Jack", 18, "Belgum", "BL123", "BLMED", "USMED", 34, "Alex", "US-HEALTHDEP", true);
            exchangestudent.getProgramName();
        } else {
            System.out.println("wrong choice");
        }
        scanner.close();
        System.out.println("\n");

        /*
            GETTERS : Methods that make a field READABLE
            SETTERS : Methods that make a field WRITEABLE
            They help protect object data and rules
            for accessing or modifying them
         */

        // lets say a we don't want to modify/print directly an emergency contact of a Student
        // meaning like this : student1.emergencyContact = "XX" or System.out.println(student1.emergencyContact)
        // We use an access modifier ( in this case 'private' ) to prevent this behaviour
        // 'private' makes it that the attribute is neither READABLE or WRITABLE directly
        // So we need to use a SETTER & GETTER
        student1.getEmergencyContact(); // GETTER
        student1.updateEmergencyContact("Brother"); // SETTER
        student1.getEmergencyContact(); // GETTER
        System.out.println("\n");

        // Aggregation ( Student & Club )
        Student st1 = new Student("Nolan", 25);
        Student st2 = new Student("Haley", 20);
        Student st3 = new Student("Sofia", 18);

        // When setting a president in the constructor
        // it already adds the them to the member list
        Club club = new Club("CSFORALL", st1);
        club.addMember(st2, st3);
        club.showPresident();
        club.listMembers();
        club.removeMember(st1);
        club.showPresident();
        club.setPresident(st2);
        club.showPresident();
        club.listMembers();
        System.out.println("\n");

        // Composition ( Student_Id & Student )
        // we already have instances of student
        // we have already included the Student_Id attributes in the overriden .toString()
        // We can see the student id being printed with the instances of Student

        /*
            Anonymous classes :
                A class that dosen't have a name, Cannot be reused
                Adds custom behaviour without having to create a new class
                Often used for one time uses ( TimerTask , Runnable, callbacks )
         */

        International_student VIPinternationalStudent = new International_student("Xavier", 19, "Mexico", "MEX123") {
            @Override
            void showinfo() {
                System.out.println("country : " + this.country + "\nPassportID : " + this.passportID);
                System.out.println("This is a VIP Student");
            }
        };
        VIPinternationalStudent.showinfo();


    }
}
