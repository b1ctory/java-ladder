package util;

import java.util.Random;

public class RandomLadderPoint {
    public boolean isPoint() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
