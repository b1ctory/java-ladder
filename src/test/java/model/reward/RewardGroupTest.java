package model.reward;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RewardGroupTest {
    @Test
    public void 참여자_게임결과_수_일치_확인() {
        assertThrows(IllegalArgumentException.class, () -> {
            new RewardGroup(Arrays.asList("a","b"),4);
        });
    }
}