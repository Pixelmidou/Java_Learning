package Java_OOP;

/*
    It is supposed that "Exchange_student" is an abstract subclass of "International_Student"
    It represents international students who are in a country temporarily
    as part of an academic exchange program.
    It's abstract because there can be different
    kinds of exchange programs ( Erasmus/Fullbright etc.. )
    Which each technically can have their own subclasses of "Exchange_student"
 */
/*
    In this case we are creating Exchange_Student as abstract
    because we want to set in it the common things
    that the exchange programs ( subclasses of Exchange_student ) might need
    but we do not want to access Exchange_Student directly as it dosen't make sense
    we only need directly to access the exchange program itself
 */
/*
    theoretically , the reason to implement an abstract class ,
    is when you have enough common attributes and methods for subclasses to share ,
    but the class itself is too generic/dosen't make sense to be instantiated
 */
public abstract class Exchange_student extends International_student {
    /*
        abstract:
            used to define abstract classes and methods
            Abstraction is the process of hiding implementation details
            and showing only essential features
            Abstract Classes CAN'T be instantiated/defined/declared directly
            They can contain :
                'abstract' methods ( which must be implemented )
                'concrete' methods ( which are inherited )
     */

    String home_uni;
    String host_uni;
    int exchange_duration;
    String program_coordinator;

    Exchange_student(String name, int age, String country, String passportID, String home_uni, String host_uni, int exchange_duration, String program_coordinator) {
        super(name, age, country, passportID);
        this.home_uni = home_uni;
        this.host_uni = host_uni;
        this.exchange_duration = exchange_duration;
        this.program_coordinator = program_coordinator;
    }

    // this here is an abstract method , which needs to be defined by each subclass
    // Notice in "Erasmus" and "Fullbright" how the method is overridden to its own program name
    abstract void getProgramName();

    // this here is a concrete method , which is inherited by all subclasses
    void showdetails() {
        System.out.println(home_uni + " " + host_uni + " " + exchange_duration + " " + program_coordinator);
    }

}
