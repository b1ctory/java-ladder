package model.user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    public void 이름_글자수_제한() {
        assertThrows(IllegalArgumentException.class, () -> {
                new User("");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new User("abcdef");
        });
    }

    @Test
    public void 이름_입력_제한() {
        assertThrows(IllegalArgumentException.class, () -> {
            new User("all");
        });
    }


}