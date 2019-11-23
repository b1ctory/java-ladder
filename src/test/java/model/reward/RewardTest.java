package model.reward;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RewardTest {
    @Test
    public void 글자수_제한() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Reward("");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Reward("123456");
        });
    }
}