package Java_OOP;

/*
    Interface
        It is a blueprint for a class that specifies a set of abstract methods
        that implementing classes MUST define
        Supports multiple inhertiance-like behavior
 */
public interface Contactable {

    void updateEmergencyContact(String emergencyContact);
    void getEmergencyContact();

}
