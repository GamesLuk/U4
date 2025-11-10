package h1;

import java.util.random.RandomGenerator;

public class H1_main {

    public static void main(String[] args) {

        double guthaben = -100;
        double monEingang = 200;
        int rating = -2;
        boolean warnhinweis;
        boolean negativ;

        /*
        guthaben = RandomGenerator.getDefault().nextDouble(-1000, 1000);
        monEingang = RandomGenerator.getDefault().nextDouble(0, 2000);
        rating = RandomGenerator.getDefault().nextInt(1, 6);
        warnhinweis = RandomGenerator.getDefault().nextBoolean();
        */

        negativ = false;

        System.out.println("Guthaben: " + guthaben);
        System.out.println("Monatlicher Eingang: " + monEingang);
        System.out.println("Rating: " + rating);
        System.out.println("Negativ: " + negativ);

        if (guthaben < 0) {
            negativ = true;

            if (monEingang >= guthaben) rating += 1;
            else {
                rating -= 1;
            }
        }
        else if (guthaben > 0) rating += 3;
        else rating += 2;

        warnhinweis = guthaben < 0 &&
                monEingang < (guthaben = guthaben < 0 ? guthaben * -1 : guthaben) &&
                rating < 0;

        System.out.println("-----------------------------------");
        System.out.println("Rating: " + rating);
        System.out.println("Warnhinweis: " + warnhinweis);
        System.out.println("Negativ: " + negativ);





    }

}
