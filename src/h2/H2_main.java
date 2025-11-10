package h2;

import java.util.random.RandomGenerator;

public class H2_main {

    public static void main(String[] args) {

    	int jahr = 2025;
		boolean schalt;

		//jahr = RandomGenerator.getDefault().nextInt(1900,3000);
		
		if(jahr % 400 == 0) schalt = true;
		else if (jahr % 100 == 0) schalt = false;
		else if (jahr % 4 == 0) schalt = true;
		else schalt = false;

		System.out.println("Jahr: " + jahr + ", Schalt: " + schalt);
        
    }

}
