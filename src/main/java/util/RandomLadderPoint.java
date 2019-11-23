package util;

import java.util.Random;

public class RandomLadderPoint implements LadderRule {
    public boolean isPoint() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
