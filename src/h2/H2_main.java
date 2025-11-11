package h2;

import java.util.random.RandomGenerator;

public class H2_main {

    public static void main(String[] args) {

        boolean x,y,a,b,c;
        int input = 10;

        System.out.println("Input: " + input);

        x = (input == 10 || input == 11) ? true : false;
        y = (input == 1 || input == 11) ? true : false;

        boolean E1 = x;
        boolean E2 = y;
        boolean E3 = x ^ y;

        a = E1 && E2;
        b = E1 || E3;
        c = !y;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

    }

}
