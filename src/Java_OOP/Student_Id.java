package Java_OOP;

/*
    Composition :
        Represents a "part-of" relationship between objects
        for example, an Engine is part of a Car
        allows complex objects to be constructed from smaller objects
    FOR EXAMPLE:
        here we have a Student_Id, A Student_Id is part of Student
        meaning without Student, Student_Id would not exist
 */
public class Student_Id {
    /*
        Once a student recives an ID
        we don't want it neither writable/modifed (final)
        neither directly accessed (private)
     */
    private final String idNumber;
    int issueYear;

    Student_Id(String idNumber, int issueYear) {
        this.idNumber = idNumber;
        this.issueYear = issueYear;
    }

    @Override
    public String toString() {
        return "ID : " + this.idNumber;
    }

}
