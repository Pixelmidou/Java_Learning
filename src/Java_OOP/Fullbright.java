package Java_OOP;

public class Fullbright extends Exchange_student {

    String sponsorAgency;
    boolean hasTOFELS;

    Fullbright(String name, int age, String country,
               String passportID, String home_uni, String host_uni,
               int exchange_duration, String program_coordinator,
               String sponsorAgency, boolean hasTOFELS) {
        super(name, age, country, passportID, home_uni, host_uni, exchange_duration, program_coordinator);
        this.sponsorAgency = sponsorAgency;
        this.hasTOFELS = hasTOFELS;
    }

    @Override
    void getProgramName() {
        System.out.println("Fullbright");
    }

}
