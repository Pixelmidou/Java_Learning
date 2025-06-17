package Java_cores;

import java.util.Random;

public class Random_nbs {
    public static void main(String[] args) {
        Random random = new Random();

        // 2nd parm is execlusif + params are not optional
        int intnumber = random.nextInt(1,7);
        double doublenumber = random.nextDouble(1,2.6);
        boolean boolval = random.nextBoolean();

        System.out.println(intnumber);
        System.out.println(doublenumber);
        if (boolval) {
            System.out.println("heads");
        } else {
            System.out.println("tails");
        }
    }
}
