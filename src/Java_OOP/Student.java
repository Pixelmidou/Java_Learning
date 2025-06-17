package Java_OOP;

// Implementing "Contactable" interface
// YOU CAN implement more than one interface
public class Student implements Contactable {

    // Attributes
    String name;
    int age;
    boolean isEnrolled;

    /*
        static:
            makes a variable or method belong to the class
            rather than any specific object
            commonly used for utility methods (like Math.round) or shared resources
            P.S. :
                Static methods CAN ONLY access methods/attributes if they are static as well
    */
    /*
        if it were not for the static keyword when printing in Main (student1.numstudents)
        it would show 1 although we have 2 student instances
        with static it makes it that the variable belongs to the whole class not the sole object
        in other words objects share the same copy of the variable , instead of having copies of their own
     */
    static int numstudents;

    // Attribute needed to adapt the "Student" class to the "Contactable" interface
    // We do not want to directly modify/print an emergency contact
    // that is why we use 'private' ( setters & getters chapter )
    // if we want it to be a constant ( READABLE and not WRITABLE ) we use 'final' keyword
    private String emergencyContact;

    // Composition : ( without Student, Student_Id wouldn't exist )
    // this is why an instance is created here,
    // to create dependance (Student_Id's dependance on Student)
    Student_Id id;

    /*
        Constructor:
            it is a special method to initialize objects
            you can pass arguments to a constructor
            and setup initial values
     */
    // Constructor
    // Overloading constructors is possible ( same as normal methods )
    Student(String name, int age) {
        // "this" refers to the object we are currently constructing
        // EX: student1 or student2 ( something like student1.name = name , for example )
        this.name = name;
        this.age = age;
        // isEnrolled is not passed in params , so its given automatically here true as value
        // ( supposing if a Student object is created then he is already enrolled )
        this.isEnrolled = true;
        numstudents++;
        // normally it would be this.emergencyContact = emergencyContact
        // but so that i don't go around chaning the code in "Main",
        // it is set to a default value
        this.emergencyContact = "No one";
        this.id = new Student_Id(this.name.substring(0,2)+this.age, 2025);
    }

    // Methods
    void dropout() {
        System.out.println("you dropped out");
        this.isEnrolled = false;
    }
    static void showstudents() {
        // no "this" is needed as numstudents belongs to the class not the object/instance
        System.out.println("there are " + numstudents + " students");
    }

    /*
        .toString()
            It is a method inherited from the Object Class
            used to return a string representation of an object
            By default it returns a hash code as a unique identifier
            It can be overriden to provide meaningful details
        Example :
            When normally printing an object ( System.out.println(student1) )
            the result is this "Student@6576fe71"
            We can change this behaviour to return a meaningful String
     */

    @Override
    public String toString() {
        // we can do this.id , because we have an overriden .toString() in Student_Id
        return this.name + " " + this.age + "\n" + this.id;
    }

    // Interface required methods
    // this is a GETTER method : it makes the 'emergencyContact' READABLE
    @Override
    public void getEmergencyContact() {
        System.out.println(emergencyContact);
    }

    // this is a SETTER method : it makes the 'emergencyContact' WRITABLE
    @Override
    public void updateEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }
    //

}
