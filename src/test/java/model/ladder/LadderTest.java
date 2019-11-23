package model.ladder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class LadderTest {
    @Test
    public void 사다리_최소_높이_체크() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Ladder(0,100);
        });
    }
}