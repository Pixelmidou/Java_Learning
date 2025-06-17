package Java_OOP;

import java.util.ArrayList;
import java.util.Arrays;

/*
    Aggregation:
        represents a "has-a" relationship between objects
        One object contains another object as part of its structure
        but the contained object/s can exist independently
    FOR example:
        A "Club" object can have "Student" objects
        but a "Club" and a "Student" can exist independently
 */
public class Club {
    String clubName;
    // we do not want "president","clubMembers" to be neither
    // directly accessed/modifed ( use setters/getters )
    private Student president;
    // a dynamic array initialized to empty
    private ArrayList<Student> clubMembers = new ArrayList<>();

    Club(String clubName, Student president) {
        this.clubName = clubName;
        this.president = president;
        this.clubMembers.add(this.president);
    }

    void setPresident(Student student) {
        this.president = student;
    }

    // can accept many students
    void addMember(Student... students) {
        /*
            Instead of :
                for (Student student : students) {
                    clubMembers.add(student);
                }
            WE USE :
         */
        clubMembers.addAll(Arrays.asList(students));
    }

    // can accept many students
    void removeMember(Student... students) {
        for (Student student : students) {
            if (student == this.president) {
                this.president = null;
            }
            clubMembers.remove(student);
        }
    }

    void showPresident() {
        if (this.president == null) {
            System.out.println("no president currently");
        } else {
            System.out.println(this.president);
        }
    }

    void listMembers() {
        for (Student member : clubMembers) {
            // reminder : we can print member of type Student
            // cuz we have overriden .toString() in "Student"
            System.out.println(member);
        }
    }

}
