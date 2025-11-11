package h3;

import java.util.random.RandomGenerator;

public class H3_main {

    public static void main(String[] args) {

        float celsiusFloat = RandomGenerator.getDefault().nextInt(-20, 40);
        double celsiusDouble = RandomGenerator.getDefault().nextInt(-20, 40);

        float fahrenheitFloat = (celsiusFloat * 9/5) + 32;
        double fahrenheitDouble = (celsiusDouble * 9/5) + 32;

        System.out.println("Celsius (float): " + celsiusFloat + "°C -> Fahrenheit (float): " + fahrenheitFloat + "°F");
        System.out.println("Celsius (double): " + celsiusDouble + "°C -> Fahrenheit (double): " + fahrenheitDouble + "°F");

    }

}
