package h3;

import java.util.random.RandomGenerator;

public class H3_main {

    public static void main(String[] args) {

    	int max;
		int fix;
		int wartend;
		boolean istVoll;

        max = RandomGenerator.getDefault().nextInt(5,21);
        fix = RandomGenerator.getDefault().nextInt(0, max);
        wartend = RandomGenerator.getDefault().nextInt(0, 25);

        System.out.println("Max Gäste: " + max + " ,fixe Gäste: " + fix + " ,Wartend: " + wartend);

		while (wartend > 0 && fix < max) {
			wartend -= 1;
			fix += 1;
		}

		istVoll = fix == max;

        System.out.println("Max Gäste: " + max + " ,fixe Gäste: " + fix + " ,Wartend: " + wartend);
        System.out.println("Ist voll: " + istVoll);
		
    }

}
