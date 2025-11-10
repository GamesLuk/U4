package h1;

import java.util.random.RandomGenerator;

public class H1_main {

    public static void main(String[] args) {

        int zone = RandomGenerator.getDefault().nextInt(1, 7);
        double price = 0.0;

        System.out.println("Zone " + zone);

        switch (zone) {
            case 1 -> price = 2.00;
            case 2 -> price = 2.35;
            case 3, 4 -> price = 2.85;
            case 5 -> price = 3.55;
            default -> price = 4.00;
        }

        System.out.println("Preis: " + price + " Euro");

    }

}
