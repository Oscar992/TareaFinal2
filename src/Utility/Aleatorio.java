package Utility;

import java.util.Random;

public class Aleatorio {
    Random random;

    public Aleatorio() {
        random = new Random();
    }

    public int generarRandomInteger(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public double generarRandomDouble(double min, double max) {
        return min + (max - min) * random.nextDouble();
    }
}
