package Java_OOP;

public class Erasmus extends Exchange_student {

    boolean hasEuHealthCare;
    double monthlyStipend;

    Erasmus(String name, int age, String country,
               String passportID, String home_uni, String host_uni,
               int exchange_duration, String program_coordinator,
               boolean hasEuHealthCare, double monthlyStipend) {
        super(name, age, country, passportID, home_uni, host_uni, exchange_duration, program_coordinator);
        this.hasEuHealthCare = hasEuHealthCare;
        this.monthlyStipend = monthlyStipend;
    }

    @Override
    void getProgramName() {
        System.out.println("Erasmus");
    }

}
