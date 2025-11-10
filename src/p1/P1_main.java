package p1;

import java.util.random.RandomGenerator;

public class P1_main {

    public static void main(String[] args) {

        int stockwerk = 0;

        stockwerk = RandomGenerator.getDefault().nextInt(-2, 5);

        System.out.println("Stockwerk: " + stockwerk);

        switch (stockwerk){
            case -1 -> System.out.println("Parkhaus");
            case 0 -> System.out.println("Angebote");
            case 1 -> System.out.println("Damenbekleidung");
            case 2 -> System.out.println("Herrenbekleidung");
            case 3 -> System.out.println("Kinderbekleidung");
            default -> System.out.println("unbekannt");
        }

        System.out.println("-----------------------------");

        switch (stockwerk){
            case 3: System.out.println("Kinderbekleidung");
            case 2: System.out.println("Herrenbekleidung");
            case 1: System.out.println("Damenbekleidung");
            case 0: System.out.println("Angebote"); break;
            case -1: System.out.println("Parkhaus"); break;
            default: System.out.println("unbekannt");
        }

    }

}