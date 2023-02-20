package Utility;

import java.util.Random;

public class Aleatorio {
    private final Random random;

    public Aleatorio() {
        random = new Random();
    }

    public static int generarRandomInteger(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public static double generarRandomDouble(double min, double max) {
        return min + (max - min) * random.nextDouble();
    }
}
