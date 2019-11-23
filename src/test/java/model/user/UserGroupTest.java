package model.user;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UserGroupTest {
    @Test
    public void 참가자수_체크() {
        assertThrows(IllegalArgumentException.class, () -> {
            new UserGroup(Arrays.asList("a"));
        });
    }

    @Test
    public void 참가자_중복_체크() {
        assertThrows(IllegalArgumentException.class, () -> {
            new UserGroup(Arrays.asList("a","a"));
        });
    }
}