package Java_OOP;

/*
    Inheritance:
        Is where one class inherits the attributes and methods from another class
        Example : Child recives the attr&meths of the Parent ( Child <- Parent )
        THERE CAN be multi-level inheritence ( Child <- Parent <- Grand-parent )
 */
// Here International_student (child) inherits all attributes and methods of Student (parent)
public class International_student extends Student {

    String country;
    String passportID;
    boolean isVisaValid;

    /*
        super:
            refers to the parent class (subclass <- superclass)
            used in child/subclass constructors and method overriding (not overloading)
            calls the parent constructor to initialize attributes
     */
    /*
        THIS constructor is NOT valid/permitted in a subclass (it needs super)
            International_student(String country, String passportID) {
                this.country = country;
                this.passportID = passportID;
            }
     */

    // here the parent requires some attributes as arguments to be filled
    // in this case (String name, int age)
    // this is done using super
    // ( meaning sending the parent's arugments from the child's constructor )

    // See here we passed the parent's attributes to the child's constructor to be filled
    // then using super we sent them back to the parent class

    International_student(String name, int age, String country, String passportID) {
        super(name, age);
        this.country = country;
        this.passportID = passportID;
        isVisaValid = true;
    }

    void showinfo() {
        System.out.println("country : " + this.country + "\nPassportID : " + this.passportID);
    }

    /*
        Method Overriding:
            It is when a subclass provides its own implementation
            of a method that is already defined
            Allows for code reusability and give specific implementations
     */
    // ( additionally to setting isEnrolled to false when dropping out )
    // ( it is supposed that the visa also becomes invalid ONLY for international students)
    // we have overriden this method
    @Override
    void dropout() {
        System.out.println("you dropped out");
        this.isEnrolled = false;
        this.isVisaValid = false;
    }

}
