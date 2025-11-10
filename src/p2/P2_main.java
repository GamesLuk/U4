package p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.random.RandomGenerator;

public class P2_main {

    public static void main(String[] args) {

        /*
        (a): int -3 fehlerfrei
        (b): int 1 fehlerfrei
        (c): int 3 fehlerfrei
        (d): int 1 fehlerfrei
        (e): int 6 fehlerfrei
        (f): double 13.0 fehlerfrei
         */

        int a = 3, b = 5, c = 6;
        double x = 1.5, y = 2.3;
        int intResult;
        double doubleResult;

        intResult = c - a * 3;
        System.out.println("(a): " + intResult);

        intResult = c / b;
        System.out.println("(b): " + intResult);

        intResult = a + b / c;
        System.out.println("(c): " + intResult);

        doubleResult = c / b;
        System.out.println("(d1): " + doubleResult);

        doubleResult = c /(double) b;
        System.out.println("(d2): " + doubleResult);

        doubleResult = c + a / b;
        System.out.println("(e1): " + doubleResult);

        doubleResult = c + a /(double) b;
        System.out.println("(e2): " + doubleResult);

        doubleResult = x + y * b;
        System.out.println("(f): " + doubleResult);

    }

}
