package p3;

import java.util.List;
import java.util.random.RandomGenerator;

public class P3_main {

    public static void main(String[] args) {

        /*
        (a): true, true, true, true
        (b): true, true, true, true
        (c): false, false, false, false
        (d): false, true, true, true
         */

        String a = "", b = "", c = "", d = "";

        boolean x, y;

        x = true;
        y = true;
        a += !(x!=y && x==y) + ", ";
        b += (x || true) + ", ";
        c += (x && false) + ", ";
        d += ((x&&!y)||(!x)) + ", ";

        x = true;
        y = false;
        a += !(x!=y && x==y) + ", ";
        b += (x || true) + ", ";
        c += (x && false) + ", ";
        d += ((x&&!y)||(!x)) + ", ";

        x = false;
        y = true;
        a += !(x!=y && x==y) + ", ";
        b += (x || true) + ", ";
        c += (x && false) + ", ";
        d += ((x&&!y)||(!x)) + ", ";

        x = false;
        y = false;
        a += !(x!=y && x==y) + ", ";
        b += (x || true) + ", ";
        c += (x && false) + ", ";
        d += ((x&&!y)||(!x)) + ", ";

        System.out.println("(a): " + a);
        System.out.println("(b): " + b);
        System.out.println("(c): " + c);
        System.out.println("(d): " + d);

    }

}
